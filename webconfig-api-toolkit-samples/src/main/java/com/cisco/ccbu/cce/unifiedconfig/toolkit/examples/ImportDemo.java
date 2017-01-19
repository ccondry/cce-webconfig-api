package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.*;

import javax.ws.rs.Path;

/**
 * Example code for importing customer contact records for a Campaign
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.ImportDemo" -Dexec.args="10.86.135.210 administrator@test.com abc123="
 */
public class ImportDemo {

    private static RESTClient restClient = null;
    private static SkillGroup skillGroup = null;
    private static boolean skillGroupCreated = false;

    private static final String COMMA_SEPARATED_FILE_CONTENT_MULTIPLE_FIELDS =
            "AccountNumber,FirstName,LastName,Phone01,Phone02" +DemoUtils.NEW_LINE+
                    "ACCOUNT111,Mir,Ali,123456789,987654321" +DemoUtils.NEW_LINE+
                    "ACCOUNT112,Steve,Glovin,123456788,9876543*22" +DemoUtils.NEW_LINE+
                    "ACCOUNT113,Tom,Weissinger,123456787,987654323#" +DemoUtils.NEW_LINE+
                    "ACCOUNT114,Sajith,Kaimal,123456786,9*87654324";

    private static final String PIPE_SEPARATED_FILE_CONTENT_MULTIPLE_FIELDS =
            "AccountNumber|FirstName|LastName|Phone01|Phone02" +DemoUtils.NEW_LINE+
                    "ACCOUNT115|Mark|Rzasa|123456789|987654321" +DemoUtils.NEW_LINE+
                    "ACCOUNT116|Elie|Lalo|123456788|9876543*22" +DemoUtils.NEW_LINE+
                    "ACCOUNT117|Josephine|Zhuang|123456787|987654323#" +DemoUtils.NEW_LINE+
                    "ACCOUNT118|Avinash|Kumar|123456786|9*87654324";

    private static final String IMPORT_PATH = "import";

    /**
     * Launches the ImportDemo if the arguments are valid.
     *
     * @param args ImportDemo requires 3 arguments: hostname username(with @domain) password
     */
    public static void main(String[] args) {

        validateAndSetupSkillGroup(args);

        importDemo(restClient);
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
    private static void importDemo(RESTClient restClient) {

        Campaign campaign = null;

        try {
            // -- Create a Campaign
            campaign = CampaignDemo.createAndGetCampaign(restClient, skillGroup);

            String importPath = constructImportPath(campaign);

            // -- Create 4 records using comma-delimited file content
            restClient.create(populateBulkImportBean(DemoUtils.COMMA_DELIMITER, COMMA_SEPARATED_FILE_CONTENT_MULTIPLE_FIELDS, false),
                    importPath);
            System.out.println("Created Import with 4 records comma-separated");

            // -- Create 4 more records using pipe-delimited file content
            restClient.create(populateBulkImportBean(DemoUtils.PIPE_DELIMITER, PIPE_SEPARATED_FILE_CONTENT_MULTIPLE_FIELDS, false),
                    importPath);
            System.out.println("Created Import with 4 more records pipe-separated");
        }
        catch (ApiException e){
            System.out.println(e.getErrors());
        }
        finally {
            // Deleting import, campaign and skillGroup
            if(campaign != null) {
                restClient.delete(campaign.getRefURL() + "/import");
                System.out.println("Deleted all imported records");
                restClient.delete(campaign.getRefURL());
                System.out.println("Deleted Campaign");
            }
            if(skillGroupCreated) {
                restClient.delete(skillGroup.getRefURL());
                System.out.println("Deleted SkillGroup");
            }
        }
    }

    /**
     * Construct import path from Campaign refURL
     *
     * @param campaign Campaign for which we need to create the importPath
     * @return
     */
    private static String constructImportPath(Campaign campaign) {
        String importPath = campaign.getRefURL().replace(RESTClient.baseUrl, "");
        importPath += "/" + IMPORT_PATH;
        return importPath;
    }

    /**
     * Create and return an Import Bean
     *
     * @param delimiter Delimiter used in file content
     * @param fileContent Records to be imported including the header
     * @param overwriteData if existing data should be overwritten
     * @return
     */
    private static ImportContact populateBulkImportBean(String delimiter, String fileContent, boolean overwriteData) {

        ImportContact importContact = new ImportContact();
        importContact.setDelimiter(delimiter);
        importContact.setFileContent(fileContent);
        importContact.setOverwriteData(overwriteData);

        return importContact;
    }

    /**
     * Validates the arguments based on deployment type
     * Sets up the Skill Groups
     *
     * @param args command line arguments
     */
    private static void validateAndSetupSkillGroup(String[] args) {
        if(args.length < 3){
            System.out.println("ImportDemo requires at least 3 arguments: hostname username(with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        restClient = new RESTClient(args[0], args[1], args[2]);

        Deployment deploymentType = restClient.get(Deployment.class, RESTClient.baseUrl + Deployment.class.getAnnotation(Path.class).value());
        System.out.println("System is in Deployment Type: " + deploymentType.getDeploymentType());

        if(!DemoUtils.isPCCEDeploymentType(deploymentType) && args.length < 4){
            System.out.println("ImportDemo requires 4 arguments in non-PCCE deployments: " +
                    "hostname username(with @domain) password skillGroupName");
            System.exit(0);
        }

        if(DemoUtils.isPCCEDeploymentType(deploymentType)) {
            if(args.length < 4) {
                skillGroup = CampaignDemo.createAndGetSkillGroup(restClient);
                skillGroupCreated = true;
            }
            else
                skillGroup = DemoUtils.lookupSkillGroup(restClient, args[3]);

            if(skillGroup == null)
                System.exit(0);
        }

    }


}
