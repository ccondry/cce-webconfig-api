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


@XmlRootElement(name="ContextServiceConfig")
public class SocialMinerContextServiceConfig extends BaseApiBean {
  private List<String> campaigns;
  private String connectionData;
  private boolean labMode;
  private int maxRetries;
  private String proxyUrl;
  private int requestTimeoutInMS;
  private ConnectionStatus status;

  @XmlElementWrapper(name="##default")
  @XmlElement(name="campaign")
  public List<String> getCampaigns() {
     return this.campaigns;
  }

  public void setCampaigns(List<String> campaigns) {
     this.campaigns = campaigns;
  }

  public String getConnectionData() {
     return this.connectionData;
  }

  public void setConnectionData(String connectionData) {
     this.connectionData = connectionData;
  }

  public boolean getLabMode() {
     return this.labMode;
  }

  public void setLabMode(boolean labMode) {
     this.labMode = labMode;
  }

  public int getMaxRetries() {
     return this.maxRetries;
  }

  public void setMaxRetries(int maxRetries) {
     this.maxRetries = maxRetries;
  }

  public String getProxyUrl() {
     return this.proxyUrl;
  }

  public void setProxyUrl(String proxyUrl) {
     this.proxyUrl = proxyUrl;
  }

  public int getRequestTimeoutInMS() {
     return this.requestTimeoutInMS;
  }

  public void setRequestTimeoutInMS(int requestTimeoutInMS) {
     this.requestTimeoutInMS = requestTimeoutInMS;
  }

  public ConnectionStatus getStatus() {
     return this.status;
  }

  public void setStatus(ConnectionStatus status) {
     this.status = status;
  }


}
