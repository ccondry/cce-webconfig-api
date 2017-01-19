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


@Path("applicationpath")
@XmlRootElement(name="applicationPath")
public class ApplicationPath extends BaseApiBean {
  private ReferenceBean applicationInstance;
  private List<ApplicationPathMember> applicationPathMembers;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Short logicalControllerId;
  private String name;
  private String refURL;

  public ReferenceBean getApplicationInstance() {
     return this.applicationInstance;
  }

  public void setApplicationInstance(ReferenceBean applicationInstance) {
     this.applicationInstance = applicationInstance;
  }

  @XmlElementWrapper(name="applicationPathMembers")
  @XmlElement(name="applicationPathMember")
  public List<ApplicationPathMember> getApplicationPathMembers() {
     return this.applicationPathMembers;
  }

  public void setApplicationPathMembers(List<ApplicationPathMember> applicationPathMembers) {
     this.applicationPathMembers = applicationPathMembers;
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

  public Short getLogicalControllerId() {
     return this.logicalControllerId;
  }

  public void setLogicalControllerId(Short logicalControllerId) {
     this.logicalControllerId = logicalControllerId;
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


  @Path("applicationpath")
  @XmlRootElement(name = "results")
  public static class ApplicationPathList extends BaseApiListBean<ApplicationPath> {
    @XmlElementWrapper(name = "applicationPaths")
    @XmlElement(name = "applicationPath")
    public List<ApplicationPath> getItems() {
      return items;
    }

    public void setItems(List<ApplicationPath> items) {
      this.items = items;
    }
  }
}
