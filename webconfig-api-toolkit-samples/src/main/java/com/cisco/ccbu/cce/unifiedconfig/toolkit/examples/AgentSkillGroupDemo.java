package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;


import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Agent;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Deployment;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.Person;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.SkillGroup;

import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.Date;


/**
 * Example code for creating agents, skill groups, and associating them.
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.AgentSkillGroupDemo" -Dexec.args="10.86.135.193 administrator@test.com abc123="
 */
public class AgentSkillGroupDemo {

    private static final int uniqueBase = ((int)( new Date().getTime() / 1000 )) % 10000;
    private static int count = 1;

    public static void main(String[] args) {

        if(args.length < 3){
            System.out.println("AgentSkillGroupDemo requires 3 parameters: hostname username (with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        RESTClient restClient = new RESTClient(args[0], args[1], args[2]);

        Deployment deploymentType = restClient.get(Deployment.class, RESTClient.baseUrl + Deployment.class.getAnnotation(Path.class).value());

        System.out.println("System is in Deployment Type: " + deploymentType.getDeploymentType());

        if(deploymentType.getDeploymentType() != 7 && deploymentType.getDeploymentType() != 10){
            System.out.println("AgentSkillGroupDemo can only be run in PCCE (7) or PCCE_LAB (10) deployments.");
            System.exit(0);
        }

        try{
            agentSkillGroupDemo(restClient);
        }catch (ApiException e){
            System.out.println(e.getErrors());
        }
    }

    private static void agentSkillGroupDemo(RESTClient restClient) {

        // *** Agent and Skill Group Create
        // -- Make a new agent object and associate it with a new person object.
        Agent newAgent = populateAgentBean(generateUniqueString("firstName"), generateUniqueString("lastName"),
                generateUniqueString("userName"), "test1");

        // -- Create an agent and get an agent
        newAgent = restClient.createAndGetBean(newAgent);
        System.out.println("Agent created: " + newAgent.getRefURL());

        // -- Try and get an agent that doesn't exist
        try{
            restClient.get(Agent.class, RESTClient.baseUrl +"agent/12345");
        }catch (ApiException e){
            if(e.getErrors() != null){
                System.out.println(e.getErrors().toString());
            }else{
                System.out.println(e.getMessage());
            }
        }

        // -- Create a skillgroup object.
        SkillGroup skillGroup = new SkillGroup();
        skillGroup.setName(generateUniqueString("skill"));
        skillGroup = restClient.createAndGetBean(skillGroup);
        System.out.println("Skill Group created: " + skillGroup.getRefURL());

        // *** Associate an Agent with a Skill Group via Update
        // -- Create a reference object with this skillgroup object so we can assign an agent to it
        ReferenceBean skillRef = new ReferenceBean(skillGroup.getRefURL());

        // -- Put it in the agent object from earlier
        newAgent.setSkillGroups(Arrays.asList(skillRef));

        // -- Performing an update which will attach the skillGroup to our agent.
        restClient.update(newAgent);
        System.out.println("SkillGroup " + skillGroup.getRefURL() + " assigned to agent " + newAgent.getRefURL());

        // *** Show the query params (aka search) functionality
        // -- Create 2 more agents with matching descriptions
        Agent newAgent2 = restClient.createAndGetBean(populateAgentBean(generateUniqueString("firstName"), generateUniqueString("lastName"),
                generateUniqueString("userName"), "test2"));
        System.out.println("Agent created: " + newAgent2.getRefURL());
        Agent newAgent3 = restClient.createAndGetBean(populateAgentBean(generateUniqueString("firstName"), generateUniqueString("lastName"),
                generateUniqueString("userName"), "test2"));
        System.out.println("Agent created: " + newAgent3.getRefURL());

        System.out.println("List all agent's with the word 'test' in the description - all 3");
        Agent.AgentList itemList = restClient.getList(Agent.AgentList.class, "test");
        for (Agent i : itemList.getItems()) {
            System.out.println(i.getPerson().getUserName() + " description " + i.getDescription());
        }

        System.out.println("List all agent's with the word 'test' in the description - the 2 newly created ones");
        itemList = restClient.getList(Agent.AgentList.class, "test2");
        for (Agent i : itemList.getItems()) {
            System.out.println(i.getPerson().getUserName() + " description " + i.getDescription());
        }

        // *** Finally Delete everything
        for(BaseApiBean bean : Arrays.asList(newAgent, newAgent2, newAgent3, skillGroup)){
            restClient.delete(bean.getRefURL());
            System.out.println("Deleted " + bean.getClass().getSimpleName() +": " + bean.getRefURL());
        }
    }

    private static Agent populateAgentBean(String firstName, String lastName, String userName, String description) {

        Agent newAgent = new Agent();

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setUserName(userName);

        newAgent.setPerson(person);
        newAgent.setDescription(description);

        return newAgent;
    }

    private static String generateUniqueString(String base){
        return String.format("%s_%03d_%05d", base, uniqueBase, count++);
    }

}
