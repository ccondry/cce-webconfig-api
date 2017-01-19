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


@Path("registry")
@XmlRootElement(name="registry")
public class Registry extends BaseApiBean {
  private String cgListenPort;
  private Integer conapiEnabled;
  private Boolean instanceCreated;
  private String instanceName;
  private String jtapiCUCMSubAddress;
  private String jtapiClientVersion;
  private String jtapiUser;
  private String locale;
  private List<PeripheralWithRoutingClient> mediaRoutingPeripherals;
  private String mrPG;
  private String ucmPG;
  private String ucmPGTIPPort;
  private String ucmPGTOSPort;
  private String vruPG;

  public String getCgListenPort() {
     return this.cgListenPort;
  }

  public void setCgListenPort(String cgListenPort) {
     this.cgListenPort = cgListenPort;
  }

  public Integer getConapiEnabled() {
     return this.conapiEnabled;
  }

  public void setConapiEnabled(Integer conapiEnabled) {
     this.conapiEnabled = conapiEnabled;
  }

  public Boolean getInstanceCreated() {
     return this.instanceCreated;
  }

  public void setInstanceCreated(Boolean instanceCreated) {
     this.instanceCreated = instanceCreated;
  }

  public String getInstanceName() {
     return this.instanceName;
  }

  public void setInstanceName(String instanceName) {
     this.instanceName = instanceName;
  }

  public String getJtapiCUCMSubAddress() {
     return this.jtapiCUCMSubAddress;
  }

  public void setJtapiCUCMSubAddress(String jtapiCUCMSubAddress) {
     this.jtapiCUCMSubAddress = jtapiCUCMSubAddress;
  }

  public String getJtapiClientVersion() {
     return this.jtapiClientVersion;
  }

  public void setJtapiClientVersion(String jtapiClientVersion) {
     this.jtapiClientVersion = jtapiClientVersion;
  }

  public String getJtapiUser() {
     return this.jtapiUser;
  }

  public void setJtapiUser(String jtapiUser) {
     this.jtapiUser = jtapiUser;
  }

  public String getLocale() {
     return this.locale;
  }

  public void setLocale(String locale) {
     this.locale = locale;
  }

  @XmlElementWrapper(name="mediaRoutingPeripherals")
  @XmlElement(name="mediaRoutingPeripheral")
  public List<PeripheralWithRoutingClient> getMediaRoutingPeripherals() {
     return this.mediaRoutingPeripherals;
  }

  public void setMediaRoutingPeripherals(List<PeripheralWithRoutingClient> mediaRoutingPeripherals) {
     this.mediaRoutingPeripherals = mediaRoutingPeripherals;
  }

  public String getMrPG() {
     return this.mrPG;
  }

  public void setMrPG(String mrPG) {
     this.mrPG = mrPG;
  }

  public String getUcmPG() {
     return this.ucmPG;
  }

  public void setUcmPG(String ucmPG) {
     this.ucmPG = ucmPG;
  }

  public String getUcmPGTIPPort() {
     return this.ucmPGTIPPort;
  }

  public void setUcmPGTIPPort(String ucmPGTIPPort) {
     this.ucmPGTIPPort = ucmPGTIPPort;
  }

  public String getUcmPGTOSPort() {
     return this.ucmPGTOSPort;
  }

  public void setUcmPGTOSPort(String ucmPGTOSPort) {
     this.ucmPGTOSPort = ucmPGTOSPort;
  }

  public String getVruPG() {
     return this.vruPG;
  }

  public void setVruPG(String vruPG) {
     this.vruPG = vruPG;
  }


  @Path("registry")
  @XmlRootElement(name = "results")
  public static class RegistryList extends BaseApiListBean<Registry> {
    @XmlElementWrapper(name = "registrys")
    @XmlElement(name = "registry")
    public List<Registry> getItems() {
      return items;
    }

    public void setItems(List<Registry> items) {
      this.items = items;
    }
  }
}
