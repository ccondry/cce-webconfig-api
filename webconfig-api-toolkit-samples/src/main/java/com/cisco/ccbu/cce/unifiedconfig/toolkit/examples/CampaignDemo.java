package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;


import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.*;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example code for Campaign operations
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.CampaignDemo" -Dexec.args="10.86.135.210 administrator@test.com abc123="
 */
public class CampaignDemo {

    private static RESTClient restClient = null;
    private static SkillGroup skillGroup1 = null;
    private static SkillGroup skillGroup2 = null;
    private static boolean skillGroupsCreated = false;

    private static int campaignCount = 1;
    private static int skillGroupCount = 1;

    private static final String CAMPAIGN_NAME_PREFIX = "DemoCampaign";


    /**
     * Validates the arguments
     * Sets up the SkillGroups
     * Launches the campaignDemo
     *
     * @param args CampaignDemo requires 3 arguments: hostname username(with @domain) password
     */
    public static void main(String[] args) {

        validateAndSetupSkillGroups(args);

        campaignDemo(restClient);
    }

    /**
     * This function demonstrates the various operations allowed on a Campaign
     * Steps:
     * 1. Create the Campaign
     * 2. Update a value in the Campaign and verify that it is updated.
     * 3. Create one more Campaigns.
     * 4. Get a list of Campaigns created (3 in all)
     * 5. Delete all the Campaigns and SkillGroups created.
     * 6. Getting a Campaign with an non-existing CampaignID will result in an error. This shows the format of errors.
     *
     * @param restClient
     */
    private static void campaignDemo(RESTClient restClient) {

        Campaign campaign1 = null;
        Campaign campaign2 = null;

        try {
            // -- Create a Campaign
            campaign1 = createAndGetCampaign(restClient, skillGroup1);

            // -- Update the campaign - set abandonEnabled to false
            updateAndVerifyCampaign(restClient, campaign1);

            // -- Create 1 more Campaign
            campaign2 = createAndGetCampaign(restClient, skillGroup2);

            // Get the list of the Campaigns created
            Campaign.CampaignList campaigns = restClient.getList(Campaign.CampaignList.class, CAMPAIGN_NAME_PREFIX);
            System.out.println("Number of Campaigns retrieved on LIST: " + campaigns.getItems().size());
        }
        catch (ApiException e){
            System.out.println(e.getErrors());
        }
        finally {
            // *** Finally Delete everything
            if(campaign1 != null) {
                restClient.delete(campaign1.getRefURL());
                System.out.println("Deleted Campaign: " + campaign1.getRefURL());
            }
            if(campaign2 != null) {
                restClient.delete(campaign2.getRefURL());
                System.out.println("Deleted Campaign: " + campaign2.getRefURL());
            }
            if(skillGroupsCreated) {
                restClient.delete(skillGroup1.getRefURL());
                restClient.delete(skillGroup2.getRefURL());
                System.out.println("Deleted SkillGroups.");
            }
        }

        // -- Try and get a Campaign that doesn't exist
        checkingGetOnNonExistingCampaign(restClient);
    }

    /**
     * Creates a Campaign and returns the created Campaign
     *
     * @param restClient Rest Client
     * @param skillGroup SkillGroup - a SkillGroup is required for creating a Campaign, this skillGroup must not be used in other Campaigns
     * @return Campaign
     */
    public static Campaign createAndGetCampaign(RESTClient restClient, SkillGroup skillGroup) {
        List<CampaignSkillGroupInfo> skillGroupInfos = createCampaignSkillGroupInfos(Arrays.asList(skillGroup));

        // -- Get UTC timeZone
        TimeZone timeZoneUTC = restClient.get(TimeZone.class, RESTClient.baseUrl + "timezone/UTC");

        // -- Make a new Campaign object
        Campaign campaign = populateCampaignBean(DemoUtils.generateUniqueString(CAMPAIGN_NAME_PREFIX, campaignCount++),
                                                    DialingMode.PREVIEWONLY, skillGroupInfos, timeZoneUTC);
        campaign = restClient.createAndGetBean(campaign);
        System.out.println("Campaign created: " + campaign.getRefURL());
        return campaign;
    }

    /**
     * Creates a SkillGroup and returns the created SkillGroup
     *
     * @param restClient Rest Client
     * @return SkillGroup
     */
    public static SkillGroup createAndGetSkillGroup(RESTClient restClient) {
        SkillGroup skillGroup = new SkillGroup();
        skillGroup.setName(DemoUtils.generateUniqueString("skill", skillGroupCount++));
        skillGroup = restClient.createAndGetBean(skillGroup);
        System.out.println("Skill Group created: " + skillGroup.getRefURL());
        return skillGroup;
    }

    /**
     * Updates the Campaign by changing the value of abandonEnabled from true to false.
     * Prints out the value of abandonEnabled before and after update.
     *
     * @param restClient Rest Client
     * @param campaign Campaign
     */
    private static void updateAndVerifyCampaign(RESTClient restClient, Campaign campaign) {
        System.out.println("Updating Campaign, setting abandonEnabled to false");
        System.out.println("abandonEnabled before update: " + campaign.getAbandonEnabled());

        campaign.setAbandonEnabled(false);
        Campaign updateCampaign = restClient.updateAndGetBean(campaign);
        System.out.println("Campaign updated: " + updateCampaign.getRefURL());
        System.out.println("abandonEnabled after update: " + updateCampaign.getAbandonEnabled());
    }

    /**
     * This function calls the GET method on an non-existing Campaign i.e. campaign refURL has an invalid id.
     * Also prints out the Error message received on standard output
     *
     * @param restClient Rest Client
     */
    private static void checkingGetOnNonExistingCampaign(RESTClient restClient) {
        System.out.println("Getting a non-existing campaign should return an error");
        try{
            restClient.get(Campaign.class, RESTClient.baseUrl +"campaign/12345");
        }catch (ApiException e){
            if(e.getErrors() != null){
                System.out.println(e.getErrors().toString());
            }else{
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Creates a list of CampaignSkillGroupInfos from the list of SkillGroups provided
     *
     * @param skillGroups list of SkillGroups
     * @return list of CampaignSkillGroupInfos
     */
    private static List<CampaignSkillGroupInfo> createCampaignSkillGroupInfos(List<SkillGroup> skillGroups) {

        List<CampaignSkillGroupInfo> skillGroupInfos = new ArrayList<>(skillGroups.size());

        for(SkillGroup skillGroup: skillGroups) {

            // -- Setup a SkillGroupInfo for the SkillGroup
            CampaignSkillGroupInfo skillGroupInfo = new CampaignSkillGroupInfo();
            ReferenceBean skillGroupRef = new ReferenceBean();
            skillGroupRef.setName(skillGroup.getName());
            skillGroupRef.setRefURL(skillGroup.getRefURL());
            skillGroupInfo.setSkillGroupRef(skillGroupRef);

            // Add SkillGroupInfo to SkillGroupInfos
            skillGroupInfos.add(skillGroupInfo);
        }

        return skillGroupInfos;
    }

    /**
     * Create and return a Campaign bean
     *
     * @param campaignName Name of the Campaign
     * @param dialingMode Campaign's dialing mode, see <code>DialingMode</code> for acceptable values
     * @param skillGroupInfos List of SkillGroupInfos
     * @param timeZone Default TimeZone of the Campaign
     * @return Campaign bean
     */
    private static Campaign populateCampaignBean(String campaignName,
                                                 DialingMode dialingMode,
                                                 List<CampaignSkillGroupInfo> skillGroupInfos,
                                                 TimeZone timeZone) {

        Campaign newCampaign = new Campaign();

        newCampaign.setName(campaignName);
        newCampaign.setDialingMode(dialingMode);

        newCampaign.setSkillGroupInfos(skillGroupInfos);

        TimeZoneRef timeZoneRef = new TimeZoneRef();
        timeZoneRef.setRefURL(timeZone.getRefURL());
        timeZoneRef.setDisplayName(timeZone.getName());
        newCampaign.setTimeZone(timeZoneRef);

        return newCampaign;
    }

    /**
     * Creates SkillGroups and sets them up.
     *
     * @param restClient Rest Client
     */
    private static void createAndSetSkillGroups(RESTClient restClient) {

        skillGroup1 = createAndGetSkillGroup(restClient);
        skillGroup2 = createAndGetSkillGroup(restClient);

        skillGroupsCreated = true;
    }

    /**
     * Looks up the Skill Groups by skill group names and sets them up.
     * Prints errors to standard output and exits if SkillGroups cannot be created
     *
     * @param restClient Rest Client
     * @param skillGroupName1 Name of SkillGroup1
     * @param skillGroupName2 Name of SkillGroup2
     */
    private static void lookupAndSetSkillGroups(RESTClient restClient, String skillGroupName1, String skillGroupName2) {

        skillGroup1 = DemoUtils.lookupSkillGroup(restClient, skillGroupName1);
        skillGroup2 = DemoUtils.lookupSkillGroup(restClient, skillGroupName2);

        if(skillGroup1 == null || skillGroup2 == null)
            System.exit(0);
    }

    /**
     * Validates the arguments based on deployment type
     * Sets up the Skill Groups
     *
     * @param args command line arguments
     */
    private static void validateAndSetupSkillGroups(String[] args) {
        if(args.length < 3){
            System.out.println("CampaignDemo requires at least 3 arguments: hostname username(with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        restClient = new RESTClient(args[0], args[1], args[2]);

        Deployment deploymentType = restClient.get(Deployment.class, RESTClient.baseUrl + Deployment.class.getAnnotation(Path.class).value());
        System.out.println("System is in Deployment Type: " + deploymentType.getDeploymentType());

        if(!DemoUtils.isPCCEDeploymentType(deploymentType) && args.length < 5){
            System.out.println("CampaignDemo requires 5 arguments in non-PCCE deployments: " +
                    "hostname username(with @domain) password skillGroupName1 skillGroupName2");
            System.exit(0);
        }

        if(DemoUtils.isPCCEDeploymentType(deploymentType)) {
            if(args.length < 5)
                createAndSetSkillGroups(restClient);
            else
                lookupAndSetSkillGroups(restClient, args[3], args[4]);
        }

    }

}
