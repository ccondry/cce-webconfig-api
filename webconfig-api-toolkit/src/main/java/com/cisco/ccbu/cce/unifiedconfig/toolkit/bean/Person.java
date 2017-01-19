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


@Path("agent")
@XmlRootElement(name="person")
public class Person extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String firstName;
  private String lastName;
  private Boolean loginEnabled;
  private Boolean markDeletable;
  private String password;
  private Integer ssoEnabled;
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

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getFirstName() {
     return this.firstName;
  }

  public void setFirstName(String firstName) {
     this.firstName = firstName;
  }

  public String getLastName() {
     return this.lastName;
  }

  public void setLastName(String lastName) {
     this.lastName = lastName;
  }

  public Boolean getLoginEnabled() {
     return this.loginEnabled;
  }

  public void setLoginEnabled(Boolean loginEnabled) {
     this.loginEnabled = loginEnabled;
  }

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public Integer getSsoEnabled() {
     return this.ssoEnabled;
  }

  public void setSsoEnabled(Integer ssoEnabled) {
     this.ssoEnabled = ssoEnabled;
  }

  public String getUserName() {
     return this.userName;
  }

  public void setUserName(String userName) {
     this.userName = userName;
  }


  @Path("agent")
  @XmlRootElement(name = "results")
  public static class PersonList extends BaseApiListBean<Person> {
    @XmlElementWrapper(name = "persons")
    @XmlElement(name = "person")
    public List<Person> getItems() {
      return items;
    }

    public void setItems(List<Person> items) {
      this.items = items;
    }
  }
}
