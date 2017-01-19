package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;


import com.cisco.ccbu.cce.unifiedconfig.toolkit.ApiException;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.*;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * Example code for creating agents, Attributes, and associating them.
 *
 * Command line launch: mvn exec:java -Dexec.mainClass="com.cisco.ccbu.cce.unifiedconfig.toolkit.examples.AgentAttributeDemo" -Dexec.args="10.86.135.193 administrator@test.com abc123="
 */
public class AgentAttributeDemo {

    private static final int uniqueBase = ((int)( new Date().getTime() / 1000 )) % 10000;
    private static int count = 1;

    public static void main(String[] args) {

        if(args.length < 3){
            System.out.println("AgentAttributeDemo requires 3 parameters: hostname username (with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        RESTClient restClient = new RESTClient(args[0], args[1], args[2]);

        Deployment deploymentType = restClient.get(Deployment.class, RESTClient.baseUrl + Deployment.class.getAnnotation(Path.class).value());

        System.out.println("System is in Deployment Type: " + deploymentType.getDeploymentType());

        try{
            agentAttributeDemo(restClient, deploymentType);
        }catch (ApiException e){
            System.out.println(e.getErrors());
        }
    }

    private static void agentAttributeDemo(RESTClient restClient, Deployment deploymentType) {

        // *** Agent Find (UCCE) or Create (PCCE)
        Agent agent = null;
        if(deploymentType.getDeploymentType() != 7 && deploymentType.getDeploymentType() != 10){

            Agent.AgentList agents = restClient.getList(Agent.AgentList.class);

            if(agents.getItems() == null || agents.getItems().size() == 0){
                System.out.println("No Agents were found.  At least one agent must exist for a UCCE demo");
                System.exit(0);
            }else{
                agent = agents.getItems().get(0);
                System.out.println("Agent Selected for Test: " + agent.getRefURL());
            }
        }else{
            agent = populateAgentBean(generateUniqueString("firstName"), generateUniqueString("lastName"),
                    generateUniqueString("userName"), "test1");
            agent = restClient.createAndGetBean(agent);
            System.out.println("Agent created: " + agent.getRefURL());
        }

        // Save off any attributes on the current agent
        List<AttributeValueWithAttribute> existingAttributes = agent.getAttributes();
        if(existingAttributes == null){
            existingAttributes = new ArrayList<>();
        }

        // -- Create an attribute object.
        Attribute attribute = new Attribute();
        attribute.setDataType(3);
        attribute.setDefaultValue("true");
        attribute.setName(generateUniqueString("attribute"));
        attribute = restClient.createAndGetBean(attribute);

        // *** Associate an Agent with a Attribute via Update
        AttributeValueWithAttribute agentAttribute = new AttributeValueWithAttribute();
        agentAttribute.setAttributeValue("true");
        agentAttribute.setAttribute(new ReferenceBean(attribute.getRefURL()));

        // -- Put it in the agent object from earlier
        agent.setAttributes(Arrays.asList(agentAttribute));

        // -- Performing an update which will attach the attribute to our agent.
        agent = restClient.updateAndGetBean(agent);
        System.out.println("Attribute " + agentAttribute.getRefURL() + " assigned to agent " + agent.getRefURL());

        // *** Remove the association
        agent.setAttributes(existingAttributes);
        agent = restClient.updateAndGetBean(agent);
        System.out.println("Agent restored to existing attribute set");

        // ** Delete the attribute (and Agent if PCCE)
        restClient.delete(attribute.getRefURL());
        System.out.println("Deleted Attribute: " + attribute.getRefURL());

        if(deploymentType.getDeploymentType() == 7 || deploymentType.getDeploymentType() == 10){
            restClient.delete(agent.getRefURL());
            System.out.println("Deleted Agent: " + agent.getRefURL());
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
