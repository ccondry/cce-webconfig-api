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


@Path("mediaroutingdomain")
@XmlRootElement(name="mediaRoutingDomain")
public class MediaRoutingDomain extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean interruptible;
  private Integer mRDomainId;
  private Integer maxTaskDuration;
  private Integer maxTasksInQueue;
  private Integer maxTimeInQueue;
  private String name;
  private String refURL;
  private Integer serviceLevelThreshold;
  private Integer taskLife;
  private Integer taskStartTimeout;
  private MediaRoutingType type;

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

  public Boolean getInterruptible() {
     return this.interruptible;
  }

  public void setInterruptible(Boolean interruptible) {
     this.interruptible = interruptible;
  }

  @XmlElement(name="id")
  public Integer getMRDomainId() {
     return this.mRDomainId;
  }

  public void setMRDomainId(Integer mRDomainId) {
     this.mRDomainId = mRDomainId;
  }

  public Integer getMaxTaskDuration() {
     return this.maxTaskDuration;
  }

  public void setMaxTaskDuration(Integer maxTaskDuration) {
     this.maxTaskDuration = maxTaskDuration;
  }

  public Integer getMaxTasksInQueue() {
     return this.maxTasksInQueue;
  }

  public void setMaxTasksInQueue(Integer maxTasksInQueue) {
     this.maxTasksInQueue = maxTasksInQueue;
  }

  public Integer getMaxTimeInQueue() {
     return this.maxTimeInQueue;
  }

  public void setMaxTimeInQueue(Integer maxTimeInQueue) {
     this.maxTimeInQueue = maxTimeInQueue;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
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

  public Integer getTaskLife() {
     return this.taskLife;
  }

  public void setTaskLife(Integer taskLife) {
     this.taskLife = taskLife;
  }

  public Integer getTaskStartTimeout() {
     return this.taskStartTimeout;
  }

  public void setTaskStartTimeout(Integer taskStartTimeout) {
     this.taskStartTimeout = taskStartTimeout;
  }

  public MediaRoutingType getType() {
     return this.type;
  }

  public void setType(MediaRoutingType type) {
     this.type = type;
  }


  @Path("mediaroutingdomain")
  @XmlRootElement(name = "results")
  public static class MediaRoutingDomainList extends BaseApiListBean<MediaRoutingDomain> {
    @XmlElementWrapper(name = "mediaRoutingDomains")
    @XmlElement(name = "mediaRoutingDomain")
    public List<MediaRoutingDomain> getItems() {
      return items;
    }

    public void setItems(List<MediaRoutingDomain> items) {
      this.items = items;
    }
  }
}
