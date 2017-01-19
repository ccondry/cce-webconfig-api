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
@XmlRootElement(name="supervisorUserInfo")
public class SupervisorUserInfo extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String domainName;
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

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getDomainName() {
     return this.domainName;
  }

  public void setDomainName(String domainName) {
     this.domainName = domainName;
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


  @Path("agent")
  @XmlRootElement(name = "results")
  public static class SupervisorUserInfoList extends BaseApiListBean<SupervisorUserInfo> {
    @XmlElementWrapper(name = "supervisorUserInfos")
    @XmlElement(name = "supervisorUserInfo")
    public List<SupervisorUserInfo> getItems() {
      return items;
    }

    public void setItems(List<SupervisorUserInfo> items) {
      this.items = items;
    }
  }
}
