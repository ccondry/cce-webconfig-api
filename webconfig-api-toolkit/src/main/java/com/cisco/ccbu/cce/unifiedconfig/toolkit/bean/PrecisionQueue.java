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


@Path("precisionqueue")
@XmlRootElement(name="precisionQueue")
public class PrecisionQueue extends BaseApiBeanWithName {
  private Integer agentCount;
  private Integer agentOrdering;
  private String attribute1;
  private String attribute2;
  private String attribute3;
  private String attribute4;
  private String attribute5;
  private ReferenceBean bucketInterval;
  private Integer callOrdering;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private ReferenceBean mediaRoutingDomain;
  private String name;
  private Integer precisionQueueId;
  private String refURL;
  private Integer serviceLevelThreshold;
  private Integer serviceLevelType;
  private List<SkillGroupWithPqId> skillGroups;
  private List<Step> steps;

  public Integer getAgentCount() {
     return this.agentCount;
  }

  public void setAgentCount(Integer agentCount) {
     this.agentCount = agentCount;
  }

  public Integer getAgentOrdering() {
     return this.agentOrdering;
  }

  public void setAgentOrdering(Integer agentOrdering) {
     this.agentOrdering = agentOrdering;
  }

  public String getAttribute1() {
     return this.attribute1;
  }

  public void setAttribute1(String attribute1) {
     this.attribute1 = attribute1;
  }

  public String getAttribute2() {
     return this.attribute2;
  }

  public void setAttribute2(String attribute2) {
     this.attribute2 = attribute2;
  }

  public String getAttribute3() {
     return this.attribute3;
  }

  public void setAttribute3(String attribute3) {
     this.attribute3 = attribute3;
  }

  public String getAttribute4() {
     return this.attribute4;
  }

  public void setAttribute4(String attribute4) {
     this.attribute4 = attribute4;
  }

  public String getAttribute5() {
     return this.attribute5;
  }

  public void setAttribute5(String attribute5) {
     this.attribute5 = attribute5;
  }

  public ReferenceBean getBucketInterval() {
     return this.bucketInterval;
  }

  public void setBucketInterval(ReferenceBean bucketInterval) {
     this.bucketInterval = bucketInterval;
  }

  public Integer getCallOrdering() {
     return this.callOrdering;
  }

  public void setCallOrdering(Integer callOrdering) {
     this.callOrdering = callOrdering;
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

  @XmlElement(name="id")
  public Integer getPrecisionQueueId() {
     return this.precisionQueueId;
  }

  public void setPrecisionQueueId(Integer precisionQueueId) {
     this.precisionQueueId = precisionQueueId;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
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

  @XmlElementWrapper(name="skillGroups")
  @XmlElement(name="skillGroup")
  public List<SkillGroupWithPqId> getSkillGroups() {
     return this.skillGroups;
  }

  public void setSkillGroups(List<SkillGroupWithPqId> skillGroups) {
     this.skillGroups = skillGroups;
  }

  @XmlElementWrapper(name="steps")
  @XmlElement(name="step")
  public List<Step> getSteps() {
     return this.steps;
  }

  public void setSteps(List<Step> steps) {
     this.steps = steps;
  }


  @Path("precisionqueue")
  @XmlRootElement(name = "results")
  public static class PrecisionQueueList extends BaseApiListBean<PrecisionQueue> {
    @XmlElementWrapper(name = "precisionQueues")
    @XmlElement(name = "precisionQueue")
    public List<PrecisionQueue> getItems() {
      return items;
    }

    public void setItems(List<PrecisionQueue> items) {
      this.items = items;
    }
  }
}
