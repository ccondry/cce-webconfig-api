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


@Path("contextservice")
@XmlRootElement(name="contextServiceRegistration")
public class ContextServiceRegistration extends BaseApiBean {
  private Integer changeStamp;
  private String connectionData;
  private String correlationId;
  private ReferenceBean department;
  private String deregistrationUrl;
  private String managementUrl;
  private PermissionInfo permissionInfo;
  private String refURL;
  private String registrationUrl;
  private RegistrationState state;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getConnectionData() {
     return this.connectionData;
  }

  public void setConnectionData(String connectionData) {
     this.connectionData = connectionData;
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

  public String getDeregistrationUrl() {
     return this.deregistrationUrl;
  }

  public void setDeregistrationUrl(String deregistrationUrl) {
     this.deregistrationUrl = deregistrationUrl;
  }

  public String getManagementUrl() {
     return this.managementUrl;
  }

  public void setManagementUrl(String managementUrl) {
     this.managementUrl = managementUrl;
  }

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public String getRegistrationUrl() {
     return this.registrationUrl;
  }

  public void setRegistrationUrl(String registrationUrl) {
     this.registrationUrl = registrationUrl;
  }

  public RegistrationState getState() {
     return this.state;
  }

  public void setState(RegistrationState state) {
     this.state = state;
  }


  @Path("contextservice")
  @XmlRootElement(name = "results")
  public static class ContextServiceRegistrationList extends BaseApiListBean<ContextServiceRegistration> {
    @XmlElementWrapper(name = "contextServiceRegistrations")
    @XmlElement(name = "contextServiceRegistration")
    public List<ContextServiceRegistration> getItems() {
      return items;
    }

    public void setItems(List<ContextServiceRegistration> items) {
      this.items = items;
    }
  }
}
