package com.cisco.ccbu.cce.unifiedconfig.toolkit.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiListBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Agent;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.AgentTeam;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Attribute;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.CallType;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Campaign;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.CampaignSkillGroupInfo;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.DialedNumber;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.DialingMode;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.ImportContact;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.MediaRoutingDomain;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Person;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.PrecisionQueue;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.SkillGroup;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.TimeZone;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.TimeZoneRef;
import com.sun.jersey.api.client.UniformInterfaceException;

public class CceRestUtils {
	private static final String IMPORT_PATH = "import";
	
	public static Agent lookupAgentById(RESTClient restClient, String q) throws RESTClientNotFoundException {
		Agent.AgentList agents;
		String notFoundMessage = "No Agent matched with agent ID: '";
		try {
			agents = restClient.getList(Agent.AgentList.class, q);
		} catch (ApiException e) {
			throw new RESTClientNotFoundException(notFoundMessage + q);
		}
		// If no Skill Group is found with the search term, return null.
		if(agents.getItems().size() == 0) {
			throw new RESTClientNotFoundException(notFoundMessage + q);
		}

		// Look for exact matching name and return that Skill Group
		for(Agent agent: agents.getItems()) {
			if(agent.getAgentId().equals(q))
				return agent;
		}

		throw new RESTClientNotFoundException(notFoundMessage + q);
	}

	public static Person populatePersonBean(String firstName, String lastName, String userName, String password) {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setUserName(userName);
		person.setPassword(password);
		person.setLoginEnabled(true);
		return person;
	}
	public static Person populatePersonBean(String firstName, String lastName, String userName, Boolean ssoEnabled) {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setUserName(userName);
		person.setLoginEnabled(true);
		person.setSsoEnabled(ssoEnabled ? 1 : 0);
		return person;
	}

	/**
	 * Searches for a SkillGroup by skillGroupName
	 * If not found, returns null
	 * If more than one found, returns exact matching name
	 * If exact match not found, returns the first match found
	 *
	 * @param restClient RestClient
	 * @param skillGroupName Name of the SkillGroup
	 * @return SkillGroup or null
	 * @throws RESTClientNotFoundException 
	 */
	public static SkillGroup lookupSkillGroup(RESTClient restClient, String skillGroupName) throws RESTClientNotFoundException {
		SkillGroup.SkillGroupList skillGroups = restClient.getList(SkillGroup.SkillGroupList.class, skillGroupName);

		// If no Skill Group is found with the search term, return null.
		if(skillGroups.getItems().size() == 0) {
//			System.out.println("No SkillGroup was found with Skill Group name: " + skillGroupName);
			throw new RESTClientNotFoundException("No SkillGroup matched the name: '" + skillGroupName);
		}

		// Look for exact matching name and return that Skill Group
		for(SkillGroup skillGroup: skillGroups.getItems()) {
			if(skillGroup.getName().equals(skillGroupName))
				return skillGroup;
		}

		// If no Skill Group name matches the exact search term, then select the first skill group in the list
		//        SkillGroup selectedSkllGroup = skillGroups.getItems().get(0);
		//        System.out.println("No SkillGroup matched the name: '" + skillGroupName +
		//                "'. Selecting Skill Group with name: " + selectedSkllGroup.getName());
		//        return selectedSkllGroup;
		throw new RESTClientNotFoundException("No SkillGroup matched the name: '" + skillGroupName);
	}


	public static AgentTeam lookupAgentTeam(RESTClient restClient, String teamName) throws RESTClientNotFoundException {
		AgentTeam.AgentTeamList agentTeams;
		try {
			agentTeams = restClient.getList(AgentTeam.AgentTeamList.class, teamName);
		} catch (ApiException e) {
			throw new RESTClientNotFoundException("No AgentTeam matched the name: '" + teamName);
		}
		// If no Skill Group is found with the search term, return null.
		if(agentTeams.getItems().size() == 0) {
			throw new RESTClientNotFoundException("No AgentTeam matched the name: '" + teamName);
		}

		// Look for exact matching name and return that Skill Group
		for(AgentTeam agentTeam: agentTeams.getItems()) {
			if(agentTeam.getName().equals(teamName))
				return agentTeam;
		}

		// If no Skill Group name matches the exact search term, then select the first skill group in the list
		//        AgentTeam selectedAgentTeam = agentTeams.getItems().get(0);
		//        System.out.println("No AgentTeam matched the name: '" + teamName +
		//                "'. Selecting AgentTeam with name: " + selectedAgentTeam.getName());
		//        return selectedAgentTeam;
		throw new RESTClientNotFoundException("No AgentTeam matched the name: '" + teamName);
	}
	
	public static PrecisionQueue lookupPQ(RESTClient restClient, String pqName) throws RESTClientNotFoundException {
		PrecisionQueue.PrecisionQueueList precisionQueues;
		try {
			precisionQueues = restClient.getList(PrecisionQueue.PrecisionQueueList.class, pqName);
		} catch (ApiException e) {
			throw new RESTClientNotFoundException("No PrecisionQueue matched the name: '" + pqName);
		}
		// If no Precision Queue is found with the search term, throw exception
		if(precisionQueues.getItems().size() == 0) {
			throw new RESTClientNotFoundException("No PrecisionQueue matched the name: '" + pqName);
		}

		// Look for exact matching name and return that Precision Queue
		for(PrecisionQueue precisionQueue: precisionQueues.getItems()) {
			if(precisionQueue.getName().equals(pqName))
				return precisionQueue;
		}
		
		throw new RESTClientNotFoundException("No PrecisionQueue matched the name: '" + pqName);
	}
	

	public static Attribute lookupAttribute(RESTClient restClient, String attributeName) throws RESTClientNotFoundException {
		Attribute.AttributeList attributes;
		try {
			attributes = restClient.getList(Attribute.AttributeList.class, attributeName);
		} catch (ApiException e) {
			throw new RESTClientNotFoundException("No Attribute matched the name: '" + attributeName);
		}
		// If no Attribute is found with the search term, throw exception
		if(attributes.getItems().size() == 0) {
			throw new RESTClientNotFoundException("No Attribute matched the name: '" + attributeName);
		}

		// Look for exact matching name and return that Attribute
		for(Attribute attribute: attributes.getItems()) {
			if(attribute.getName().equals(attributeName))
				return attribute;
		}
		
		throw new RESTClientNotFoundException("No Attribute matched the name: '" + attributeName);
	}
	
	public static DialedNumber lookupDialedNumber(RESTClient restClient, String dnString) {
		DialedNumber.DialedNumberList dialedNumbers;
		try {
			dialedNumbers = restClient.getList(DialedNumber.DialedNumberList.class, dnString);
		} catch (ApiException e) {
			return null;
		}
		// If no Attribute is found with the search term, throw exception
		if(dialedNumbers.getItems().size() == 0) {
			return null;
		}
		
		// Look for exact matching name and return that Attribute
		for(DialedNumber dialedNumber: dialedNumbers.getItems()) {
			if(dialedNumber.getDialedNumberString().equals(dnString))
				return dialedNumber;
		}
		
		return null;
	}
	
	/**
	 * @param restClient the CCE rest client object
	 * @param skillgroup the skillgroup to add the agents to
	 * @param agents 
	 * @param useridString cxdemo lab user ID
	 * @throws RESTClientNotFoundException if no agents are found
	 * @throws ApiException when the API service failed to add agents to the skillgroup, 
	 * such as if there are too many configured PQs/Skillgroups for the deployment
	 */
	
	public static void addAgentsToSkillgroup(RESTClient restClient, SkillGroup skillgroup, List<Agent> agents) throws RESTClientNotFoundException, ApiException {
		// add agents to skillgroup
		List<ReferenceBean> agentsAdded = new ArrayList<ReferenceBean>();
		for(Agent agent : agents) {
			agentsAdded.add(new ReferenceBean(agent.getRefURL()));
		}
		// set the agents that should be added to this skillgroup
		skillgroup.setAgentsAdded(agentsAdded);

		// post or put changes to the CCE server
		restClient.update(skillgroup);

	}

	public static DialedNumber createAndGetDialedNumber(RESTClient restClient, String dnString, String description, Integer routingType, String mrdName, String callTypeName) {
		DialedNumber dialedNumber = new DialedNumber();
		// set properties
		dialedNumber.setDialedNumberString(dnString);
		dialedNumber.setDescription(description);
		dialedNumber.setRoutingType(routingType);
		// MRD
		ReferenceBean mrdRef = getMrdRef(restClient, callTypeName);
		dialedNumber.setMediaRoutingDomain(mrdRef);
		// Call Type
		ReferenceBean callTypeRef = getCallTypeRef(restClient, callTypeName);
		dialedNumber.setCallType(callTypeRef);
		// create dialed number
		dialedNumber = restClient.createAndGetBean(dialedNumber);
		return dialedNumber;
	}
	
	public static ReferenceBean getMrdRef(RESTClient restClient, String mrdName) {
		MediaRoutingDomain mrd = lookupMRD(restClient, mrdName);
		ReferenceBean mrdRef = new ReferenceBean();
		mrdRef.setName(mrd.getName());
		mrdRef.setRefURL(mrd.getRefURL());
		return mrdRef;
	}

	public static ReferenceBean getCallTypeRef(RESTClient restClient, String callTypeName) {
		CallType callType = lookupCallType(restClient, callTypeName);
		ReferenceBean callTypeRef = new ReferenceBean();
		callTypeRef.setName(callType.getName());
		callTypeRef.setRefURL(callType.getRefURL());
		return callTypeRef;
	}
	
	public static CallType lookupCallType(RESTClient restClient, String name) {
		CallType.CallTypeList callTypes;
		try {
			callTypes = restClient.getList(CallType.CallTypeList.class, name);
		} catch (ApiException e) {
			return null;
		}
		// If nothing is found with the search term, throw exception
		if(callTypes.getItems().size() == 0) {
			return null;
		}
		
		// Look for exact matching name and return that item
		for(CallType item: callTypes.getItems()) {
			if(item.getName().equals(name))
				return item;
		}
		// no exact matches found
		return null;
	}

	public static MediaRoutingDomain lookupMRD(RESTClient restClient, String name) {
		MediaRoutingDomain.MediaRoutingDomainList list;
		try {
			list = restClient.getList(MediaRoutingDomain.MediaRoutingDomainList.class, name);
		} catch (ApiException e) {
			return null;
		}
		// If nothing is found with the search term, throw exception
		if(list.getItems().size() == 0) {
			return null;
		}
		
		// Look for exact matching name and return that item
		for(MediaRoutingDomain item: list.getItems()) {
			if(item.getName().equals(name))
				return item;
		}
		// no exact matches found
		return null;
	}
	
	/**
	 * Create and return an Import Bean
	 *
	 * @param delimiter Delimiter used in file content
	 * @param fileContent Records to be imported including the header
	 * @param overwriteData if existing data should be overwritten
	 * @return
	 */
	public static ImportContact populateBulkImportBean(String delimiter, String fileContent, boolean overwriteData) {

		ImportContact importContact = new ImportContact();
		importContact.setDelimiter(delimiter);
		importContact.setFileContent(fileContent);
		importContact.setOverwriteData(overwriteData);

		return importContact;
	}


	/**
	 * Construct import path from Campaign refURL
	 *
	 * @param campaign Campaign for which we need to create the importPath
	 * @return
	 */
	public static String constructImportPath(Campaign campaign) {
		String importPath = campaign.getRefURL().replace(RESTClient.baseUrl, "");
		importPath += "/" + IMPORT_PATH;
		return importPath;
	}

	/**
	 * Creates a Campaign and returns the created Campaign
	 *
	 * @param restClient Rest Client
	 * @param campaignName 
	 * @param skillGroup SkillGroup - a SkillGroup is required for creating a Campaign, this skillGroup must not be used in other Campaigns
	 * @param dialingMode 
	 * @param dialedNumber 
	 * @param ivrPorts 
	 * @param campaignPurposeType 
	 * @return Campaign
	 */
	public static Campaign createAndGetCampaign(RESTClient restClient, String campaignName, SkillGroup skillGroup, DialingMode dialingMode, String dialedNumber, Integer ivrPorts, Integer campaignPurposeType) {
		List<CampaignSkillGroupInfo> skillGroupInfos = createCampaignSkillGroupInfos(Arrays.asList(skillGroup), dialedNumber, ivrPorts);

		// -- Get UTC timeZone
		TimeZone timeZoneUTC = restClient.get(TimeZone.class, RESTClient.baseUrl + "timezone/UTC");

		// -- Make a new Campaign object
		Campaign campaign = populateCampaignBean(campaignName, dialingMode, skillGroupInfos, timeZoneUTC, campaignPurposeType);
		campaign = restClient.createAndGetBean(campaign);
		System.out.println("Campaign created: " + campaign.getRefURL());
		return campaign;
	}

	/**
	 * Creates a SkillGroup and returns the created SkillGroup
	 *
	 * @param restClient Rest Client
	 * @param name 
	 * @return SkillGroup
	 */
	public static SkillGroup createAndGetSkillGroup(RESTClient restClient, String name) {
		SkillGroup skillGroup = new SkillGroup();
		skillGroup.setName(name);
		skillGroup = restClient.createAndGetBean(skillGroup);
		System.out.println("Skill Group created: " + skillGroup.getRefURL());
		return skillGroup;
	}

	/**
	 * Creates a list of CampaignSkillGroupInfos from the list of SkillGroups provided
	 *
	 * @param skillGroups list of SkillGroups
	 * @param dialedNumber 
	 * @param ivrPorts 
	 * @return list of CampaignSkillGroupInfos
	 */
	private static List<CampaignSkillGroupInfo> createCampaignSkillGroupInfos(List<SkillGroup> skillGroups, String dialedNumber, Integer ivrPorts) {

		List<CampaignSkillGroupInfo> skillGroupInfos = new ArrayList<>(skillGroups.size());

		for(SkillGroup skillGroup: skillGroups) {

			// -- Setup a SkillGroupInfo for the SkillGroup
			CampaignSkillGroupInfo skillGroupInfo = new CampaignSkillGroupInfo();
			ReferenceBean skillGroupRef = new ReferenceBean();
			skillGroupRef.setName(skillGroup.getName());
			skillGroupRef.setRefURL(skillGroup.getRefURL());
			skillGroupInfo.setSkillGroupRef(skillGroupRef);
			skillGroupInfo.setDialedNumber(dialedNumber);
			skillGroupInfo.setIvrPorts(ivrPorts);
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
	 * @param campaignPurposeType 
	 * @return Campaign bean
	 */
	private static Campaign populateCampaignBean(String campaignName,
			DialingMode dialingMode,
			List<CampaignSkillGroupInfo> skillGroupInfos,
			TimeZone timeZone, Integer campaignPurposeType) {

		Campaign campaign = new Campaign();

		campaign.setName(campaignName);
		campaign.setDialingMode(dialingMode);

		campaign.setSkillGroupInfos(skillGroupInfos);

		TimeZoneRef timeZoneRef = new TimeZoneRef();
		timeZoneRef.setRefURL(timeZone.getRefURL());
		timeZoneRef.setDisplayName(timeZone.getName());
		campaign.setTimeZone(timeZoneRef);
		campaign.setEnabled(true);
		campaign.setDialingMode(dialingMode);
		campaign.setCampaignPurposeType(campaignPurposeType);
		//		newCampaign.setStartTime("00:00");
		//		newCampaign.setEndTime("23:59");
		campaign.setStartDate(new Date());
		return campaign;
	}

	/**
	 * Searches for a Campaign by name
	 * If exact match found, returns exact matching name
	 * If exact match not found, returns null
	 *
	 * @param restClient RestClient
	 * @param name Name of the SkillGroup
	 * @return Campaign or null
	 */
	public static Campaign optCampaign(RESTClient restClient, String name) {
		Campaign.CampaignList campaigns;
		try {
			campaigns = listCampaigns(restClient, name);
		} catch (RESTClientNotFoundException e) {
			return null;
		}

		// Look for exact matching name and return that Campaign
		for(Campaign campaign: campaigns.getItems()) {
			if(campaign.getName().equals(name))
				return campaign;
		}

		return null;
	}

	/**
	 * Searches for a Campaign by name
	 * If exact match found, returns exact matching name
	 * If exact match not found, throws RESTClientNotFoundException
	 *
	 * @param restClient RestClient
	 * @param name Name of the SkillGroup
	 * @return Campaign
	 * @throws RESTClientNotFoundException 
	 */
	public static Campaign lookupCampaign(RESTClient restClient, String name) throws RESTClientNotFoundException {
		Campaign.CampaignList campaigns = listCampaigns(restClient, name);

		// Look for exact matching name and return that Campaign
		for(Campaign campaign: campaigns.getItems()) {
			if(campaign.getName().equals(name))
				return campaign;
		}

		throw new RESTClientNotFoundException("No Campaign matched the name: '" + name);
	}

	public static Campaign.CampaignList listCampaigns(RESTClient restClient, String name) throws RESTClientNotFoundException {
		Campaign.CampaignList campaigns = restClient.getList(Campaign.CampaignList.class, name);

		// If no Campaign is found with the search term, return null.
		if(campaigns.getItems().size() == 0) {
			throw new RESTClientNotFoundException("No Campaigns matched the name: '" + name);
		}
		return campaigns;
	}
}
