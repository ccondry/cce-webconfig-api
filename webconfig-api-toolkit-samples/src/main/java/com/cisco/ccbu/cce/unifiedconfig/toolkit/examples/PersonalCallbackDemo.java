package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.*;

import javax.ws.rs.Path;
import java.util.Calendar;
import java.util.Date;

/**
 * Example code for Personal Callback Operations
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.PersonalCallbackDemo" -Dexec.args="10.86.135.210 administrator@test.com abc123="
 */
public class PersonalCallbackDemo {

    private static RESTClient restClient = null;
    private static Agent agent = null;
    private static boolean agentCreated = false;

    /**
     * Launches the PersonalCallbackDemo if the arguments are valid.
     *
     * @param args PersonalCallbackDemo requires 3 arguments: hostname username(with @domain) password
     */
    public static void main(String[] args) {

        validateAndSetupAgent(args);

        personalCallbackDemo(restClient);
    }

    /**
     * This function demonstrates the Create and Delete operations on Campaign import records
     * Steps:
     * 1. Create a Campaign
     * 2. Import four records using comma-delimited values
     * 3. Import four more records using pipe-delimited values
     * 4. Delete the imported records, campaign and skillGroup.
     *
     * @param restClient Rest Client
     */
    private static void personalCallbackDemo(RESTClient restClient) {

        PersonalCallbackRecord pcbRecord = null;

        try {
            // -- Create a PersonalCallback Record
            pcbRecord = createPersonalCallbackRecord(restClient, agent);

        } catch (ApiException e){
            System.out.println(e.getErrors());
        } finally {
            // Deleting Agent and Personal Callback records
            if(agentCreated) {
                restClient.delete(agent.getRefURL());
                System.out.println("Agent Deleted.");
            }
            if(pcbRecord != null) {
                restClient.delete(pcbRecord.getRefURL());
                System.out.println("PersonalCallbackRecord Deleted.");
            }
        }
    }

    /**
     * Creates a personal callback record.
     *
     * @param restClient Rest Client
     * @return
     */
    private static PersonalCallbackRecord createPersonalCallbackRecord(RESTClient restClient, Agent agent) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, 2);
        Date callbackDateTime = calendar.getTime();

        PersonalCallbackRecord pcbRecord =  populatePersonalCallbackBean("4080000000", agent, callbackDateTime, 1);
        pcbRecord = restClient.createAndGetBean(pcbRecord);
        System.out.println("PersonalCallbackRecord created: " + pcbRecord.getRefURL());

        return pcbRecord;
    }

    /**
     * Create and return a PersonalCallback bean.
     *
     * @param phone Phone number
     * @param agent Agent
     * @param callbackDateTime time and date for personal callback
     * @param maxAttempts maximum attempts
     * @return
     */
    private static PersonalCallbackRecord populatePersonalCallbackBean(String phone,
                                                                       Agent agent,
                                                                       Date callbackDateTime,
                                                                       int maxAttempts) {
        PersonalCallbackRecord pcbRecord = new PersonalCallbackRecord();
        pcbRecord.setAgentId(agent.getAgentId());
        pcbRecord.setAgent(new ReferenceBean(agent.getRefURL()));
        pcbRecord.setPhone(phone);
        pcbRecord.setCallbackDateTime(callbackDateTime);
        pcbRecord.setMaxAttempts(maxAttempts);

        return pcbRecord;
    }

    /**
     * Validates the arguments based on deployment type
     * Sets up the Agent
     *
     * @param args command line arguments
     */
    private static void validateAndSetupAgent(String[] args) {
        if(args.length < 3){
            System.out.println("PersonalCallbackDemo requires 3 parameters: hostname username(with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        restClient = new RESTClient(args[0], args[1], args[2]);

        Deployment deploymentType = restClient.get(Deployment.class, RESTClient.baseUrl + Deployment.class.getAnnotation(Path.class).value());
        System.out.println("System is in Deployment Type: " + deploymentType.getDeploymentType());

        if(!DemoUtils.isPCCEDeploymentType(deploymentType) && args.length < 4){
            System.out.println("PersonalCallbackDemo requires 4 arguments in non-PCCE deployments: " +
                    "hostname username(with @domain) password agentUsername");
            System.exit(0);
        }

        if(DemoUtils.isPCCEDeploymentType(deploymentType)) {
            if(args.length < 4) {
                agent = DemoUtils.createAgent(restClient, "Mir", "Ali", DemoUtils.generateUniqueString("MirAli", 1), "");
                agentCreated = true;
            }
            else
                agent = DemoUtils.lookupAgent(restClient, args[3]);

            if(agent == null)
                System.exit(0);
        }

    }
}
