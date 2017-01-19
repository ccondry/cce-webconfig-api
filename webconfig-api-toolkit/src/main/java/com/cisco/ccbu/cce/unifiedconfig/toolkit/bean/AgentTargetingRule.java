// ----------------------------------------------
package com.cisco.ccbu.cce.unifiedconfig.toolkit.bean;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import java.util.Date;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiListBean;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlElementWrapper;


@Path("agenttargetingrule")
@XmlRootElement(name="agentTargetingRule")
public class AgentTargetingRule extends BaseApiBean {
  private List<AgentTargetingRuleRange> agentTargetingRuleRanges;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private String expression;
  private String name;
  private PeripheralRef peripheral;
  private String refURL;
  private List<ReferenceBean> routingClients;
  private Short ruleType;

  @XmlElementWrapper(name="ranges")
  @XmlElement(name="range")
  public List<AgentTargetingRuleRange> getAgentTargetingRuleRanges() {
     return this.agentTargetingRuleRanges;
  }

  public void setAgentTargetingRuleRanges(List<AgentTargetingRuleRange> agentTargetingRuleRanges) {
     this.agentTargetingRuleRanges = agentTargetingRuleRanges;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public String getExpression() {
     return this.expression;
  }

  public void setExpression(String expression) {
     this.expression = expression;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public PeripheralRef getPeripheral() {
     return this.peripheral;
  }

  public void setPeripheral(PeripheralRef peripheral) {
     this.peripheral = peripheral;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElementWrapper(name="routingClients")
  @XmlElement(name="routingClient")
  public List<ReferenceBean> getRoutingClients() {
     return this.routingClients;
  }

  public void setRoutingClients(List<ReferenceBean> routingClients) {
     this.routingClients = routingClients;
  }

  public Short getRuleType() {
     return this.ruleType;
  }

  public void setRuleType(Short ruleType) {
     this.ruleType = ruleType;
  }


  @Path("agenttargetingrule")
  @XmlRootElement(name = "results")
  public static class AgentTargetingRuleList extends BaseApiListBean<AgentTargetingRule> {
    @XmlElementWrapper(name = "agentTargetingRules")
    @XmlElement(name = "agentTargetingRule")
    public List<AgentTargetingRule> getItems() {
      return items;
    }

    public void setItems(List<AgentTargetingRule> items) {
      this.items = items;
    }
  }
}
