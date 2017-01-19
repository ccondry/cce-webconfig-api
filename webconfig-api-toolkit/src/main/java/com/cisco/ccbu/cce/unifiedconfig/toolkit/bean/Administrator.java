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


@Path("administrator")
@XmlRootElement(name="administrator")
public class Administrator extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean customer;
  private ReferenceBean department;
  private List<ReferenceBean> departments;
  private String description;
  private String domainName;
  private Boolean readOnly;
  private String refURL;
  private ReferenceBean role;
  private boolean ssoEnabled;
  private boolean supervisor;
  private String userName;

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

  public ReferenceBean getCustomer() {
     return this.customer;
  }

  public void setCustomer(ReferenceBean customer) {
     this.customer = customer;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  @XmlElementWrapper(name="departments")
  @XmlElement(name="department")
  public List<ReferenceBean> getDepartments() {
     return this.departments;
  }

  public void setDepartments(List<ReferenceBean> departments) {
     this.departments = departments;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public String getDomainName() {
     return this.domainName;
  }

  public void setDomainName(String domainName) {
     this.domainName = domainName;
  }

  public Boolean getReadOnly() {
     return this.readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
     this.readOnly = readOnly;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public ReferenceBean getRole() {
     return this.role;
  }

  public void setRole(ReferenceBean role) {
     this.role = role;
  }

  public boolean getSsoEnabled() {
     return this.ssoEnabled;
  }

  public void setSsoEnabled(boolean ssoEnabled) {
     this.ssoEnabled = ssoEnabled;
  }

  public boolean getSupervisor() {
     return this.supervisor;
  }

  public void setSupervisor(boolean supervisor) {
     this.supervisor = supervisor;
  }

  public String getUserName() {
     return this.userName;
  }

  public void setUserName(String userName) {
     this.userName = userName;
  }


  @Path("administrator")
  @XmlRootElement(name = "results")
  public static class AdministratorList extends BaseApiListBean<Administrator> {
    @XmlElementWrapper(name = "administrators")
    @XmlElement(name = "administrator")
    public List<Administrator> getItems() {
      return items;
    }

    public void setItems(List<Administrator> items) {
      this.items = items;
    }
  }
}
