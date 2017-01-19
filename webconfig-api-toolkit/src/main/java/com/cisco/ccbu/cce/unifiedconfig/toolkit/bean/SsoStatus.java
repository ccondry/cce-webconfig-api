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
@XmlRootElement(name="ssoStatus")
public class SsoStatus extends BaseApiBean {
  private SsoGlobalEnabledState globalSsoState;
  private Boolean hasIdsCredentials;
  private IdSConfigurationState idSConfigurationState;
  private String idsBaseUrl;
  private SsoOperationState modeState;
  private SsoOperationState registrationState;
  private List<SsoComponentStatus> ssoComponentStatuses;

  public SsoGlobalEnabledState getGlobalSsoState() {
     return this.globalSsoState;
  }

  public void setGlobalSsoState(SsoGlobalEnabledState globalSsoState) {
     this.globalSsoState = globalSsoState;
  }

  public Boolean getHasIdsCredentials() {
     return this.hasIdsCredentials;
  }

  public void setHasIdsCredentials(Boolean hasIdsCredentials) {
     this.hasIdsCredentials = hasIdsCredentials;
  }

  public IdSConfigurationState getIdSConfigurationState() {
     return this.idSConfigurationState;
  }

  public void setIdSConfigurationState(IdSConfigurationState idSConfigurationState) {
     this.idSConfigurationState = idSConfigurationState;
  }

  public String getIdsBaseUrl() {
     return this.idsBaseUrl;
  }

  public void setIdsBaseUrl(String idsBaseUrl) {
     this.idsBaseUrl = idsBaseUrl;
  }

  public SsoOperationState getModeState() {
     return this.modeState;
  }

  public void setModeState(SsoOperationState modeState) {
     this.modeState = modeState;
  }

  public SsoOperationState getRegistrationState() {
     return this.registrationState;
  }

  public void setRegistrationState(SsoOperationState registrationState) {
     this.registrationState = registrationState;
  }

  @XmlElementWrapper(name="##default")
  @XmlElement(name="ssoComponentStatus")
  public List<SsoComponentStatus> getSsoComponentStatuses() {
     return this.ssoComponentStatuses;
  }

  public void setSsoComponentStatuses(List<SsoComponentStatus> ssoComponentStatuses) {
     this.ssoComponentStatuses = ssoComponentStatuses;
  }


  @Path("sso")
  @XmlRootElement(name = "results")
  public static class SsoStatusList extends BaseApiListBean<SsoStatus> {
    @XmlElementWrapper(name = "ssoStatuss")
    @XmlElement(name = "ssoStatus")
    public List<SsoStatus> getItems() {
      return items;
    }

    public void setItems(List<SsoStatus> items) {
      this.items = items;
    }
  }
}
