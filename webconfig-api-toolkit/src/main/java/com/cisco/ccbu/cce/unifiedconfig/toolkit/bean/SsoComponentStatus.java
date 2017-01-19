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
@XmlRootElement(name="ssoComponentStatus")
public class SsoComponentStatus extends BaseApiBean {
  private List<ApiError> apiErrors;
  private SsoOperationState modeState;
  private String name;
  private String refURL;
  private SsoOperationState registrationState;
  private String ssoTestPath;

  @XmlElementWrapper(name="##default")
  @XmlElement(name="apiError")
  public List<ApiError> getApiErrors() {
     return this.apiErrors;
  }

  public void setApiErrors(List<ApiError> apiErrors) {
     this.apiErrors = apiErrors;
  }

  public SsoOperationState getModeState() {
     return this.modeState;
  }

  public void setModeState(SsoOperationState modeState) {
     this.modeState = modeState;
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

  public SsoOperationState getRegistrationState() {
     return this.registrationState;
  }

  public void setRegistrationState(SsoOperationState registrationState) {
     this.registrationState = registrationState;
  }

  public String getSsoTestPath() {
     return this.ssoTestPath;
  }

  public void setSsoTestPath(String ssoTestPath) {
     this.ssoTestPath = ssoTestPath;
  }


  @Path("sso")
  @XmlRootElement(name = "results")
  public static class SsoComponentStatusList extends BaseApiListBean<SsoComponentStatus> {
    @XmlElementWrapper(name = "ssoComponentStatuss")
    @XmlElement(name = "ssoComponentStatus")
    public List<SsoComponentStatus> getItems() {
      return items;
    }

    public void setItems(List<SsoComponentStatus> items) {
      this.items = items;
    }
  }
}
