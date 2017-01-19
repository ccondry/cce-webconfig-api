package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;


import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.*;

import javax.ws.rs.Path;

/**
 * Example code for Do Not Call ImportRule operations
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.DNCDemo" -Dexec.args="CCE-DS-A administrator@test.com abc123="
 */
public class DNCDemo {


    private static final String DNC_NAME_PREFIX = "DemoDNC";

    private static final String DNC_SERVICE_NAME = "dnc";

    /**
     * Launches the DNCDemo if arguments are valid.
     * @param args DNCDemo requires 3 arguments: hostname username(with @domain) password
     */
    public static void main(String[] args) {

        if(args.length < 3){
            System.out.println("DNCDemo requires 3 arguments: hostname username (with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        RESTClient restClient = new RESTClient(args[0], args[1], args[2]);

        Deployment deploymentType = restClient.get(Deployment.class, RESTClient.baseUrl + Deployment.class.getAnnotation(Path.class).value());

        System.out.println("System is in Deployment Type: " + deploymentType.getDeploymentType());

        try{
            dncDemo(restClient, args[0]);
        }catch (ApiException e){
            System.out.println(e.getErrors());
        }
    }

    /**
     *  This function demonstrates the various operations allowed on the DNC API
     *  1. Creates a new Do Not Call Import Rule
     *  2. Updates the DNC
     *  3. Deletes the DNC
     *  The list operation is similar to the Campaign, Please refer to the CampaignDemo
     */
    private static void dncDemo( RESTClient restClient, String hostname){

        //Create the new DNC Import Rule
        ImportRule dnc1 = createAndGetDNC(restClient, hostname);

        //Update the DNC - setting overwriteEnabled to true
        updateAndVerifyDNC(restClient, dnc1);

        //Delete the DNC Import Rule
        deleteDNC(restClient, dnc1);

    }

    /**
     *  This function deletes the DNC Import Rule
     * @param restClient - Rest Client
     * @param dnc - DNC Import Rule that needs to be deleted
     */
    private static void deleteDNC(RESTClient restClient, ImportRule dnc){

        restClient.delete(dnc.getRefURL());
        System.out.println("deleted " + dnc.getClass().getSimpleName() + ": " + dnc.getRefURL());
    }

    /**
     * Creates the DNC Import Rule and returns it
     *
     * @param restClient - Rest Client
     * @return ImportRule
     */
    private static ImportRule createAndGetDNC(RESTClient restClient, String hostname) {

        String filePath = "\\\\"+hostname+"\\C$\\dnc.txt";
        //Populate the Bean
        ImportRule dnc = populateDNCBean(DemoUtils.generateUniqueString(DNC_NAME_PREFIX,1),filePath, false, false);

        //Create the DNC
        dnc = restClient.createAndGetBean(dnc,DNC_SERVICE_NAME);
        System.out.println("DNC Rule Created: " + dnc.getRefURL());
        return dnc;
    }

    /**
     * This function populates the DNC Import Rule Bean with the values
     *
     * @param dncName - Name of the Do Not Call Rule
     * @param filePath -  Path to the import file which is on logger or accessible from logger
     * @param overwriteEnabled - If the new import should override the numbers that got imported with a previous import
     * @param renameEnabled -  If the DNC import file will be renamed after import is complete, else file will be deleted
     * @return ImportRule
     */
    private static ImportRule populateDNCBean(String dncName, String filePath, boolean overwriteEnabled, boolean renameEnabled)
    {
        ImportRule dnc = new ImportRule();
        dnc.setName(dncName);
        dnc.setFilePath(filePath);
        dnc.setOverwriteEnabled(overwriteEnabled);
        dnc.setRenameEnabled(renameEnabled);
        return dnc;
    }

    /**
     * This function updates the DNC Import Rule with overwriteEnabled to true
     *
     * @param restClient - REST Client
     * @param dnc - DNC Import Rule bean that needs to be updated
     */
    private static void updateAndVerifyDNC(RESTClient restClient, ImportRule dnc){

        System.out.println("Updating DNC, setting overwriteEnabled = true");
        System.out.println("overwriteEnabled before update: " + dnc.getOverwriteEnabled());

        dnc.setOverwriteEnabled(true);
        ImportRule updateDNC = restClient.updateAndGetBean(dnc);

        System.out.println("DNC updated: " + updateDNC.getRefURL());
        System.out.println("overwriteEnabled after update: " + updateDNC.getOverwriteEnabled());
    }
}
