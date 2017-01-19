package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Agent;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Deployment;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Person;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.SkillGroup;

import java.util.Date;
import java.util.List;

/**
 * Utility methods for Demo classes
 */
public class DemoUtils {

    public static final String COMMA_DELIMITER = ",";
    public static final String PIPE_DELIMITER = "|";

    public static final int uniqueBase = ((int)( new Date().getTime() / 1000 )) % 10000;
    public static final int PCCE_DEPLOYMENT_TYPE = 7;
    public static final int PCCE_LAB_DEPLOYMENT_TYPE = 10;

    public static final String NEW_LINE = System.getProperty("line.separator");

    /**
     * Generates a unique string to be used while creating new objects
     *
     * @param base base name for the object
     * @param count count
     * @return unique string
     */
    public static String generateUniqueString(String base, int count){
        return String.format("%s_%03d_%05d", base, uniqueBase, count);
    }

    /**
     * Deletes a list of beans
     *
     * @param restClient Rest Client
     * @param beans beans to be deleted
     */
    public static void delete(RESTClient restClient, List<BaseApiBean> beans) {
        for(BaseApiBean bean : beans){
            restClient.delete(bean.getRefURL());
            System.out.println("Deleted " + bean.getClass().getSimpleName() +": " + bean.getRefURL());
        }
    }

    /**
     * Creates an Agent
     *
     * @param restClient Rest Client
     * @param firstName agent's first name
     * @param lastName agent's last anme
     * @param userName agent's useranme
     * @param description agent's description
     * @return
     */
    public static Agent createAgent(RESTClient restClient, String firstName, String lastName, String userName, String description) {
        Agent agent = populateAgentBean(firstName, lastName, userName, description);
        agent = restClient.createAndGetBean(agent);
        System.out.println("Agent created: " + agent.getRefURL());
        return agent;
    }

    /**
     * Set up the Agent bean
     *
     * @param firstName agent's first name
     * @param lastName agent's last anme
     * @param userName agent's useranme
     * @param description agent's description
     * @return Agent
     */
    public static Agent populateAgentBean(String firstName, String lastName, String userName, String description) {

        Agent newAgent = new Agent();

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setUserName(userName);

        newAgent.setPerson(person);
        newAgent.setDescription(description);

        return newAgent;
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
     */
    public static SkillGroup lookupSkillGroup(RESTClient restClient, String skillGroupName) {
        SkillGroup.SkillGroupList skillGroups = restClient.getList(SkillGroup.SkillGroupList.class, skillGroupName);

        // If no Skill Group is found with the search term, return null.
        if(skillGroups.getItems().size() == 0) {
            System.out.println("No SkillGroup was found with Skill Group name: " + skillGroupName);
            return null;
        }

        // Look for exact matching name and return that Skill Group
        for(SkillGroup skillGroup: skillGroups.getItems()) {
            if(skillGroup.getName().equals(skillGroupName))
                return skillGroup;
        }

        // If no Skill Group name matches the exact search term, then select the first skill group in the list
        SkillGroup selectedSkllGroup = skillGroups.getItems().get(0);
        System.out.println("No SkillGroup matched the name: '" + skillGroupName +
                "'. Selecting Skill Group with name: " + selectedSkllGroup.getName());
        return selectedSkllGroup;
    }

    /**
     * Searches for an Agent by Agent username
     * If not found, returns null
     * If more than one found, returns exact matching agent username
     * If exact match not found, returns the first match found
     *
     * @param restClient RestClient
     * @param agentUsername username of the Agent
     * @return Agent or null
     */
    public static Agent lookupAgent(RESTClient restClient, String agentUsername) {
        Agent.AgentList agents = restClient.getList(Agent.AgentList.class, agentUsername);

        // If no agent username is found with the search term, return null.
        if(agents.getItems().size() == 0) {
            System.out.println("No Agent was found with username: " + agentUsername);
            return null;
        }

        // Look for exact matching agent username and return that Agent
        for(Agent agent: agents.getItems()) {
            if(agent.getPerson().getUserName().equals(agentUsername))
                return agent;
        }

        // If no Agent username matches the exact search term, then select the first AgentId in the list
        Agent selectedAgent = agents.getItems().get(0);
        System.out.println("No Agent username matched: '" + agentUsername +
                "'. Selecting Agent with username: " + selectedAgent.getPerson().getUserName());
        return selectedAgent;
    }

    /**
     * Checks if deployment type is PCCE or PCCE_LAB
     *
     * @param deploymentType Deployment Type
     * @return true if deployment type is PCCE or PCCE_LAB
     */
    public static boolean isPCCEDeploymentType(Deployment deploymentType) {
        return (deploymentType.getDeploymentType() == PCCE_DEPLOYMENT_TYPE ||
                deploymentType.getDeploymentType() != PCCE_LAB_DEPLOYMENT_TYPE);
    }

}
