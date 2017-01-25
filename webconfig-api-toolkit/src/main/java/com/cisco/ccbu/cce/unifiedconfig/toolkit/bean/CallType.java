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


@Path("calltype")
@XmlRootElement(name="callType")
public class CallType extends BaseApiBeanWithName {
  private ReferenceBean bucketInterval;
  private Integer callTypeId;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private String name;
  private String refURL;
  private List<ScriptSchedule> scriptSchedules;
  private Integer serviceLevelThreshold;
  private Integer serviceLevelType;

  public ReferenceBean getBucketInterval() {
     return this.bucketInterval;
  }

  public void setBucketInterval(ReferenceBean bucketInterval) {
     this.bucketInterval = bucketInterval;
  }

  @XmlElement(name="id")
  public Integer getCallTypeId() {
     return this.callTypeId;
  }

  public void setCallTypeId(Integer callTypeId) {
     this.callTypeId = callTypeId;
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

  @XmlElementWrapper(name="##default")
  @XmlElement(name="scriptSchedule")
  public List<ScriptSchedule> getScriptSchedules() {
     return this.scriptSchedules;
  }

  public void setScriptSchedules(List<ScriptSchedule> scriptSchedules) {
     this.scriptSchedules = scriptSchedules;
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


  @Path("calltype")
  @XmlRootElement(name = "results")
  public static class CallTypeList extends BaseApiListBean<CallType> {
    @XmlElementWrapper(name = "callTypes")
    @XmlElement(name = "callType")
    public List<CallType> getItems() {
      return items;
    }

    public void setItems(List<CallType> items) {
      this.items = items;
    }
  }
}
