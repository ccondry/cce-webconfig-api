package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.*;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.*;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.InitialSettings;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.*;
import java.util.Set;

/**
 * Sample code for how to execute the initialization operations.  See the accompanying file initialize.properties for
 * values that need to be provided.
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.InitializeDemo"
 */
public class InitializeDemo {
    public static final String PCCE_HOST = "pcce.host";

    public static final String SIDE_A_USERNAME = "side.a.username";
    public static final String SIDE_A_PASSWORD = "side.a.password";
    public static final String SIDE_A_ADDRESS = "side.a.address";
    public static final String SIDE_B_USERNAME = "side.b.username";
    public static final String SIDE_B_PASSWORD = "side.b.password";
    public static final String SIDE_B_ADDRESS = "side.b.address";

    public static final String CM_PUB_NAME = "cm.pub.name";
    public static final String CM_USERNAME = "cm.username";
    public static final String CM_PASSWORD = "cm.password";

    public static final String CVP_DIAG_USERNAME = "cvp.diag.username";
    public static final String CVP_DIAG_PASSWORD = "cvp.diag.password";
    public static final String CVP_ADMIN_USERNAME = "cvp.admin.username";
    public static final String CVP_ADMIN_PASSWORD = "cvp.admin.password";

    public static final String CCE_DIAG_USERNAME = "pcce.diag.username";
    public static final String CCE_DIAG_PASSWORD = "pcce.diag.password";

    public static final String CUIC_DIAG_USERNAME = "cuic.diag.username";
    public static final String CUIC_DIAG_PASSWORD = "cuic.diag.password";

    public static final String CUIC_IDS_USERNAME = "cuic.ids.username";
    public static final String CUIC_IDS_PASSWORD = "cuic.ids.password";

    public static final String FINESSE_DIAG_USERNAME = "finesse.diag.username";
    public static final String FINESSE_DIAG_PASSWORD = "finesse.diag.password";

    public static final String SETTINGS_CODEC = "settings.codec";
    public static final String SETTINGS_SERVICE_USERNAME = "settings.service.username";
    public static final String SETTINGS_SERVICE_PASSWORD = "settings.service.password";

    public static final String FACILITY = "facility";
    public static final String INSTANCE = "instance";

    /**
     * How long to wait between polls of the initialization status API.
     */
    static long sleepTimeMs = 5000;

    private RESTClient restClient;
    private Properties props;
    private Map<MachineType, List<MachineHost>> typeToMachine;

    /**
     * The main method.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Properties props = new Properties();
        props.load(InitializeDemo.class.getResourceAsStream("/initialize.properties"));
        validateProperties(props);

        try {
            new InitializeDemo(props).executeInitialize();
        } catch (ApiException e){
            System.out.println(e.getErrors());
        }
    }

    /**
     * Validates properties are set.
     */
    private static void validateProperties(Properties props) {
        List<String> propsThatMayBeBlank = Arrays.asList(SETTINGS_SERVICE_USERNAME, SETTINGS_SERVICE_PASSWORD);

        Set<String> propertyNames = new TreeSet<>();
        for(Object prop : props.keySet()) {
            String propertyName = prop.toString();
            if(!propsThatMayBeBlank.contains(propertyName)) {
                propertyNames.add(propertyName);
            }
        }
        boolean isValid = true;
        for(String propertyName : propertyNames) {
            String value = props.getProperty(propertyName);
            if (value==null || value.length()==0) {
                System.out.println("no value specified for property: " + propertyName);
                isValid = false;
            }
        }
        if(!isValid) {
            throw new RuntimeException("one or more properties were not defined in initialize.properties");
        }
    }

    /**
     * May be used to pass in a properties list of installation parameters.
     */
    public InitializeDemo(Properties props) {
        this.props = props;

        // Create a new RESTClient object with the IP of you DS / AW HDS
        restClient = new RESTClient(props.getProperty(PCCE_HOST), props.getProperty(CCE_DIAG_USERNAME), props.getProperty(CCE_DIAG_PASSWORD));
    }

    // for unit testing
    public InitializeDemo() {}

    /**
     * Performs automated initialization.
     */
    public InitializationResult executeInitialize() throws InterruptedException {
        createInstance();
        updateDeploymentTypeInfo();

        loadMachines();
        updateCm();
        updateCvp();
        updateCce();
        updateCuic();
        updateFinesse();
        updateInitialSettings();

        startInit();
        return monitorInitialization();
    }

    /**
     * Used to monitor initialization progress and output results to the console.
     */
    @SuppressWarnings("unchecked")
    InitializationResult monitorInitialization() throws InterruptedException {
        System.out.println("==== Monitoring initialization progress of the following tasks: ====");

        // print out all tasks
        List<InitializationStatus> statuses = getStatusList();
        for(InitializationStatus status : statuses) {
            System.out.println(" - " + status.getTaskName());
        }

        // keep track of tasks so we don't print it multiple times if its status hasn't changed
        List<String> successfulTaskNames = new ArrayList<>();
        List<String> processingTaskNames = new ArrayList<>();
        List<String> failedTaskNames = new ArrayList<>();

        System.out.println("\n==== Current status ====");
        boolean failed = false;
        while(true) {
            Iterable<InitializationStatus> failedTasks = findStatus(statuses, StateEnum.FAILED);

            for(InitializationStatus status : failedTasks) {
                failed = true;
                printIfNecessary("Failed task", status.getTaskName(), failedTaskNames);
            }

            Iterable<InitializationStatus> succeededTasks = findStatus(statuses, StateEnum.SUCCEEDED);
            for(InitializationStatus status : succeededTasks) {
                printIfNecessary("Task completed successfully: ", status.getTaskName(), successfulTaskNames);
            }

            for(InitializationStatus status : findStatus(statuses, StateEnum.PROCESSING)) {
                printIfNecessary("Processing...", status.getTaskName(), processingTaskNames);
            }

            if(!isCompleteOrFailed(statuses)) {
                Thread.sleep(sleepTimeMs);
            } else {
                break;
            }
            statuses = getStatusList();
        }

        System.out.println("\n==== SUMMARY ====");

        printSummaryData("Failed tasks", failedTaskNames);
        printSummaryData("Successful tasks", successfulTaskNames);

        if(failed) {
            System.out.println("\n**** FAILED during initialization ****");
        } else {
            System.out.println("\n**** Successfully completed initialization ****");
        }
        return new InitializationResult(statuses, !failed);
    }

    /**
     * Helper method to return whether the status results indicate success or failure.
     */
    private boolean isCompleteOrFailed(List<InitializationStatus> statuses) {
        int successCount = 0;
        for(InitializationStatus status : statuses) {
            if(status.getState()== StateEnum.FAILED) {
                return true;
            } else if(status.getState()== StateEnum.SUCCEEDED) {
                successCount++;
            }
        }
        return successCount == statuses.size();
    }

    /**
     * May be overridden, for unit testing.
     */
    @SuppressWarnings("unchecked")
    List<InitializationStatus> getStatusList() {
        InitializationStatusResults status = restClient.get(InitializationStatusResults.class, RESTClient.baseUrl + "initialize");
        return status.getStatusList();
    }

    /**
     * Prints results.
     */
    private void printSummaryData(String header, List<String> tasks) {
        System.out.println("\n" + header + ":");
        if(tasks.size()==0) {
            System.out.println(" - None");
        } else {
            for(String task : tasks) {
                System.out.println(" - " + task);
            }
        }
    }

    /**
     * Prints current state of the task if its state hasn't changed.
     */
    private void printIfNecessary(String desc, String taskName, List<String> printedTaskNames) {
        if(!printedTaskNames.contains(taskName)) {
            System.out.println(" > " + desc + " " + taskName);
            printedTaskNames.add(taskName);
        }
    }

    /**
     * This starts the initialization process.
     */
    private void startInit() {
        System.out.println("Starting initialization process");

        restClient.updateEmptyBody("initialize", true);
    }

    /**
     * Updates initial settings.
     */
    private void updateInitialSettings() {
        System.out.println("Updating initial settings");

        InitialSettings initialSettings = new InitialSettings();
        initialSettings.setPath("initialize/settings");

        // possible codecs: "G.711U", "G.711A", "G.729"
        initialSettings.setMobileAgentCodec(props.getProperty(SETTINGS_CODEC));

        String username = props.getProperty(SETTINGS_SERVICE_USERNAME);
        String password = props.getProperty(SETTINGS_SERVICE_PASSWORD);
        if(StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)) {
            initialSettings.setServiceAccountUserName(username);
            initialSettings.setServiceAccountPassword(password);
        }

        // not handling external UCM for now
        restClient.update(initialSettings);
    }

    /**
     * Updates Finesse credentials.
     */
    private void updateFinesse() {
        System.out.println("Updating Finesse");

        updateMachine(MachineType.FINESSE, props.getProperty(FINESSE_DIAG_USERNAME), props.getProperty(FINESSE_DIAG_PASSWORD));
    }

    /**
     * Updates CUIC credentials.
     */
    private void updateCuic() {
        System.out.println("Updating CUIC");

        updateCUICMachine(MachineType.CUIC_PUBLISHER, props.getProperty(CUIC_DIAG_USERNAME), props.getProperty(CUIC_DIAG_PASSWORD),
                props.getProperty(CUIC_IDS_USERNAME), props.getProperty(CUIC_IDS_PASSWORD));
    }

    /**
     * Updates CCE credentials
     */
    private void updateCce() {
        System.out.println("Updating CCE");

        updateMachine(MachineType.CCE_AW, props.getProperty(CCE_DIAG_USERNAME), props.getProperty(CCE_DIAG_PASSWORD));
    }

    /**
     * Updates CVP credentials
     */
    private void updateCvp() {
        System.out.println("Updating CVP");

        List<MachineHost> machines = typeToMachine.get(MachineType.CVP_OPS);
        if(machines.size()!=1) {
            throw new RuntimeException("unexpected number of CVP ops machines");
        }

        MachineHost cvp = machines.get(0);
        MachineAddress address = cvp.getAddresses().get(0);

        updateOrCreateMachineService(address, ServiceType.MANAGEMENT_LINK, null, null);
        updateOrCreateMachineService(address, ServiceType.DIAGNOSTIC_PORTAL, props.getProperty(CVP_DIAG_USERNAME), props.getProperty(CVP_DIAG_PASSWORD));
        updateOrCreateMachineService(address, ServiceType.ADMINISTRATION, props.getProperty(CVP_ADMIN_USERNAME), props.getProperty(CVP_ADMIN_PASSWORD));

        restClient.update(cvp);
    }

    /**
     * Updates the service (if it exists) or creates a new one.
     */
    private void updateOrCreateMachineService(MachineAddress addr, ServiceType svcType, String username, String password) {
        MachineService service = null;
        for(MachineService svc : addr.getMachineServices()) {
            if(svc.getType()==svcType) {
                service = svc;
                break;
            }
        }
        if(service==null) {
            service = new MachineService();
            service.setType(svcType);
            addr.getMachineServices().add(service);
        }
        service.setUserName(username);
        service.setPassword(password);
    }

    /**
     * Updates call manager credentials.
     */
    private void updateCm() {
        System.out.println("Updating Call Manager");

        String cmPubName = props.getProperty(CM_PUB_NAME);
        MachineHost machine = findMachineByName(MachineType.CM, cmPubName);

        if(machine==null) {
            machine = findMachineByName(MachineType.CM_PUBLISHER, cmPubName);
            if(machine==null) {
                throw new RuntimeException("can't find CM pub with VM name " + cmPubName);
            }
        } else {
            machine.setMachineType(MachineType.CM_PUBLISHER);
        }

        MachineAddress addr = machine.getAddresses().get(0);
        MachineService svc = new MachineService();
        svc.setType(ServiceType.AXL);
        svc.setUserName(props.getProperty(CM_USERNAME));
        svc.setPassword(props.getProperty(CM_PASSWORD));
        addr.setMachineServices(Arrays.asList(svc));

        restClient.update(machine);
    }

    /**
     * Sets ESX host info.
     */
    private void updateDeploymentTypeInfo() {
        System.out.println("Setting ESX host info");

        DeploymentTypeInfo deploymentTypeInfo = new DeploymentTypeInfo();
        deploymentTypeInfo.initRefURL();

        VMHost sideAHost = new VMHost();
        sideAHost.setName("sideA");
        sideAHost.setUserName(props.getProperty(SIDE_A_USERNAME));
        sideAHost.setPassword(props.getProperty(SIDE_A_PASSWORD));
        sideAHost.setAddress(props.getProperty(SIDE_A_ADDRESS));

        VMHost sideBHost = new VMHost();
        sideBHost.setName("sideB");
        sideBHost.setUserName(props.getProperty(SIDE_B_USERNAME));
        sideBHost.setPassword(props.getProperty(SIDE_B_PASSWORD));
        sideBHost.setAddress(props.getProperty(SIDE_B_ADDRESS));

        deploymentTypeInfo.setDeploymentType(7);
        deploymentTypeInfo.setVmHosts(Arrays.asList(sideAHost, sideBHost));
        restClient.update(deploymentTypeInfo);
    }

    /**
     * Creates the instance.
     */
    private void createInstance() {
        System.out.println("Creating instance (if necessary)");
        WebsetupInstance instance;
        try {
            instance = restClient.getById(WebsetupInstance.class, "1");
        } catch(ApiException e) {
            instance = null;
        }
        if(instance!=null) {
            deleteInstance();
        }
        instance = new WebsetupInstance();
        instance.setFacilityName(props.getProperty(FACILITY));
        instance.setInstanceName(props.getProperty(INSTANCE));
        restClient.create(instance);
    }

    /**
     * Deletes the instance
     */
    private void deleteInstance() {
        restClient.deleteById(WebsetupInstance.class, "1");
    }

    /**
     * Loads machine inventory into memory.
     */
    @SuppressWarnings("unchecked")
    private void loadMachines() {
        System.out.println("Loading inventory");

        BaseApiListBean listBean = restClient.getList(MachineHost.MachineHostList.class);
        typeToMachine = new HashMap<>();

        int total = 0;
        for (BaseApiBean bean : (List<BaseApiBean>)listBean.getItems()) {
            MachineHost machine = (MachineHost)bean;
            List<MachineHost> machines = typeToMachine.get(machine.getMachineType());
            if(machines==null) {
                machines = new ArrayList<>();
            }
            machines.add(machine);
            typeToMachine.put(machine.getMachineType(),machines);
            total++;
        }

        System.out.println("Inventory has been loaded.  Total: " + total);
        for(MachineType machineType : typeToMachine.keySet()) {
            System.out.println(" Type: > " + machineType);
            for(MachineHost machine : typeToMachine.get(machineType)) {
                System.out.println("     --> " + machine.getName() + " " + machine);
            }
        }
    }

    /**
     * Helper method to update machine information.
     */
    private void updateMachine(MachineType machineType, String username, String password) {
        MachineHost machine = findMachineBySide(machineType, "sideA");
        if(machine==null) {
            throw new RuntimeException("no machines found for type " + machineType.name() + " on sideA");
        }

        MachineAddress addr = findAddressByType(machine.getAddresses(), AddressType.PUBLIC);
        List<MachineService> services;
        if(addr.getMachineServices()!=null) {
            services = new ArrayList<>(addr.getMachineServices());
        } else {
            services = new ArrayList<>();
        }
        addr.setMachineServices(services);
        updateOrCreateMachineService(addr, ServiceType.DIAGNOSTIC_PORTAL, username, password);

        restClient.update(machine);
    }

    /**
     * Helper method to update CUIC machine information.
     */
    private void updateCUICMachine(MachineType machineType, String username, String password, String idsUsername, String idsPassword) {
        MachineHost machine = findMachineBySide(machineType, "sideA");
        if(machine==null) {
            throw new RuntimeException("no machines found for type " + machineType.name() + " on sideA");
        }

        MachineAddress addr = findAddressByType(machine.getAddresses(), AddressType.PUBLIC);
        List<MachineService> services;
        if(addr.getMachineServices()!=null) {
            services = new ArrayList<>(addr.getMachineServices());
        } else {
            services = new ArrayList<>();
        }
        addr.setMachineServices(services);
        updateOrCreateMachineService(addr, ServiceType.DIAGNOSTIC_PORTAL, username, password);
        updateOrCreateMachineService(addr, ServiceType.IDS, idsUsername, idsPassword);

        restClient.update(machine);
    }

    /**
     * Returns a MachineAddress by type in the given list.
     */
    private MachineAddress findAddressByType(List<MachineAddress> addresses, final AddressType type) {
        return Iterables.find(addresses, new Predicate<MachineAddress>() {
            @Override
            public boolean apply(MachineAddress addr) {
                return addr.getType().equals(type);
            }
        });
    }

    /**
     * Returns a Machine by machine name.
     */
    private MachineHost findMachineByName(MachineType type, final String name) {
        List<MachineHost> machines = typeToMachine.get(type);
        if (machines == null) {
            return null;
        }

        try {
            return Iterables.find(machines, new Predicate<MachineHost>() {
                @Override
                public boolean apply(MachineHost machine) {
                    return machine.getName().equals(name);
                }
            });
        } catch (NoSuchElementException ignore) {
            return null;
        }
    }

    /**
     * Returns a Machine for the given side.
     */
    private MachineHost findMachineBySide(MachineType type, final String sideName) {
        List<MachineHost> machines = typeToMachine.get(type);
        if (machines == null) {
            return null;
        }

        try {
            return Iterables.find(machines, new Predicate<MachineHost>() {
                @Override
                public boolean apply(MachineHost machine) {
                    return machine.getVmHostRef().getName().equals(sideName);
                }
            });
        } catch (NoSuchElementException ignore) {
            return null;
        }
    }

    /**
     * Returns all InitializationStatus with the given state.
     */
    private Iterable<InitializationStatus> findStatus(List<InitializationStatus> statuses, final StateEnum state) {
        try {
            return Iterables.filter(statuses, new Predicate<InitializationStatus>() {
                @Override
                public boolean apply(InitializationStatus initializationStatus) {
                    return initializationStatus.getState() == state;
                }
            });
        } catch (NoSuchElementException ignore) {
            return null;
        }
    }

}
