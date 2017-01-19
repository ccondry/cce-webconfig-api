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


@Path("sso")
@XmlRootElement(name="ssoState")
public class SsoGlobalState extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private PermissionInfo permissionInfo;
  private String refURL;
  private SsoGlobalEnabledState state;

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

  public SsoGlobalEnabledState getState() {
     return this.state;
  }

  public void setState(SsoGlobalEnabledState state) {
     this.state = state;
  }


  @Path("sso")
  @XmlRootElement(name = "results")
  public static class SsoGlobalStateList extends BaseApiListBean<SsoGlobalState> {
    @XmlElementWrapper(name = "ssoStates")
    @XmlElement(name = "ssoState")
    public List<SsoGlobalState> getItems() {
      return items;
    }

    public void setItems(List<SsoGlobalState> items) {
      this.items = items;
    }
  }
}
