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


@Path("contactsharequeue")
@XmlRootElement(name="contactShareQueue")
public class ContactShareQueue extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private String name;
  private String queueType;
  private String refURL;
  private ReferenceBean targetInstance;
  private Integer targetInstanceId;
  private TargetQueue targetQueue;

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

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getQueueType() {
     return this.queueType;
  }

  public void setQueueType(String queueType) {
     this.queueType = queueType;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public ReferenceBean getTargetInstance() {
     return this.targetInstance;
  }

  public void setTargetInstance(ReferenceBean targetInstance) {
     this.targetInstance = targetInstance;
  }

  public Integer getTargetInstanceId() {
     return this.targetInstanceId;
  }

  public void setTargetInstanceId(Integer targetInstanceId) {
     this.targetInstanceId = targetInstanceId;
  }

  public TargetQueue getTargetQueue() {
     return this.targetQueue;
  }

  public void setTargetQueue(TargetQueue targetQueue) {
     this.targetQueue = targetQueue;
  }


  @Path("contactsharequeue")
  @XmlRootElement(name = "results")
  public static class ContactShareQueueList extends BaseApiListBean<ContactShareQueue> {
    @XmlElementWrapper(name = "contactShareQueues")
    @XmlElement(name = "contactShareQueue")
    public List<ContactShareQueue> getItems() {
      return items;
    }

    public void setItems(List<ContactShareQueue> items) {
      this.items = items;
    }
  }
}
