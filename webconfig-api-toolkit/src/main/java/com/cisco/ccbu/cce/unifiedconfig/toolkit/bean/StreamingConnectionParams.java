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


@XmlRootElement(name="##default")
public class StreamingConnectionParams extends BaseApiBean {
  private String ldPassword;
  private String ldSchemaUrl;
  private String ldServiceIP;
  private Integer ldServicePort;
  private String ldTokenUrl;
  private String ldUserId;
  private Integer maxPoolSize;
  private Integer minPoolSize;
  private String password;
  private String userId;
  private Integer webSocketPort;

  public String getLdPassword() {
     return this.ldPassword;
  }

  public void setLdPassword(String ldPassword) {
     this.ldPassword = ldPassword;
  }

  public String getLdSchemaUrl() {
     return this.ldSchemaUrl;
  }

  public void setLdSchemaUrl(String ldSchemaUrl) {
     this.ldSchemaUrl = ldSchemaUrl;
  }

  public String getLdServiceIP() {
     return this.ldServiceIP;
  }

  public void setLdServiceIP(String ldServiceIP) {
     this.ldServiceIP = ldServiceIP;
  }

  public Integer getLdServicePort() {
     return this.ldServicePort;
  }

  public void setLdServicePort(Integer ldServicePort) {
     this.ldServicePort = ldServicePort;
  }

  public String getLdTokenUrl() {
     return this.ldTokenUrl;
  }

  public void setLdTokenUrl(String ldTokenUrl) {
     this.ldTokenUrl = ldTokenUrl;
  }

  public String getLdUserId() {
     return this.ldUserId;
  }

  public void setLdUserId(String ldUserId) {
     this.ldUserId = ldUserId;
  }

  public Integer getMaxPoolSize() {
     return this.maxPoolSize;
  }

  public void setMaxPoolSize(Integer maxPoolSize) {
     this.maxPoolSize = maxPoolSize;
  }

  public Integer getMinPoolSize() {
     return this.minPoolSize;
  }

  public void setMinPoolSize(Integer minPoolSize) {
     this.minPoolSize = minPoolSize;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public String getUserId() {
     return this.userId;
  }

  public void setUserId(String userId) {
     this.userId = userId;
  }

  public Integer getWebSocketPort() {
     return this.webSocketPort;
  }

  public void setWebSocketPort(Integer webSocketPort) {
     this.webSocketPort = webSocketPort;
  }


}
