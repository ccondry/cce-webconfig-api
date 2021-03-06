// ----------------------------------------------
package com.cisco.ccbu.cce.unifiedconfig.toolkit.bean;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBeanWithName;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import java.util.Date;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiListBean;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlElementWrapper;


@Path("skillgroup")
@XmlRootElement(name="skillGroup")
public class SkillGroup extends BaseApiBeanWithName {
  private Integer agentCount;
  private List<ReferenceBean> agents;
  private List<ReferenceBean> agentsAdded;
  private List<ReferenceBean> agentsRemoved;
  private ReferenceBean bucketInterval;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private ReferenceBean mediaRoutingDomain;
  private String name;
  private PeripheralRef peripheral;
  private Integer peripheralNumber;
  private String refURL;
  private Integer selectedAgentCount;
  private Integer serviceLevelThreshold;
  private Integer serviceLevelType;

  public Integer getAgentCount() {
     return this.agentCount;
  }

  public void setAgentCount(Integer agentCount) {
     this.agentCount = agentCount;
  }

  @XmlElementWrapper(name="agents")
  @XmlElement(name="agent")
  public List<ReferenceBean> getAgents() {
     return this.agents;
  }

  public void setAgents(List<ReferenceBean> agents) {
     this.agents = agents;
  }

  @XmlElementWrapper(name="agentsAdded")
  @XmlElement(name="agent")
  public List<ReferenceBean> getAgentsAdded() {
     return this.agentsAdded;
  }

  public void setAgentsAdded(List<ReferenceBean> agentsAdded) {
     this.agentsAdded = agentsAdded;
  }

  @XmlElementWrapper(name="agentsRemoved")
  @XmlElement(name="agent")
  public List<ReferenceBean> getAgentsRemoved() {
     return this.agentsRemoved;
  }

  public void setAgentsRemoved(List<ReferenceBean> agentsRemoved) {
     this.agentsRemoved = agentsRemoved;
  }

  public ReferenceBean getBucketInterval() {
     return this.bucketInterval;
  }

  public void setBucketInterval(ReferenceBean bucketInterval) {
     this.bucketInterval = bucketInterval;
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

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public ReferenceBean getMediaRoutingDomain() {
     return this.mediaRoutingDomain;
  }

  public void setMediaRoutingDomain(ReferenceBean mediaRoutingDomain) {
     this.mediaRoutingDomain = mediaRoutingDomain;
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

  public Integer getPeripheralNumber() {
     return this.peripheralNumber;
  }

  public void setPeripheralNumber(Integer peripheralNumber) {
     this.peripheralNumber = peripheralNumber;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getSelectedAgentCount() {
     return this.selectedAgentCount;
  }

  public void setSelectedAgentCount(Integer selectedAgentCount) {
     this.selectedAgentCount = selectedAgentCount;
  }

  public Integer getServiceLevelThreshold() {
     return this.serviceLevelThreshold;
  }

  public void setServiceLevelThreshold(Integer serviceLevelThreshold) {
     this.serviceLevelThreshold = serviceLevelThreshold;
  }

  public Integer getServiceLevelType() {
     return this.serviceLevelType;
  }

  public void setServiceLevelType(Integer serviceLevelType) {
     this.serviceLevelType = serviceLevelType;
  }


  @Path("skillgroup")
  @XmlRootElement(name = "results")
  public static class SkillGroupList extends BaseApiListBean<SkillGroup> {
    @XmlElementWrapper(name = "skillGroups")
    @XmlElement(name = "skillGroup")
    public List<SkillGroup> getItems() {
      return items;
    }

    public void setItems(List<SkillGroup> items) {
      this.items = items;
    }
  }
}
