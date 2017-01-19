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
public class JMSConnectionParams extends BaseApiBean {
  private String brokerUrl;
  private Integer maxPoolSize;
  private Integer minPoolSize;
  private String password;
  private String topicSchemaUrl;
  private String topicSchemaUrlPassword;
  private String topicSchemaUrlUserId;
  private String userId;

  public String getBrokerUrl() {
     return this.brokerUrl;
  }

  public void setBrokerUrl(String brokerUrl) {
     this.brokerUrl = brokerUrl;
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

  public String getTopicSchemaUrl() {
     return this.topicSchemaUrl;
  }

  public void setTopicSchemaUrl(String topicSchemaUrl) {
     this.topicSchemaUrl = topicSchemaUrl;
  }

  public String getTopicSchemaUrlPassword() {
     return this.topicSchemaUrlPassword;
  }

  public void setTopicSchemaUrlPassword(String topicSchemaUrlPassword) {
     this.topicSchemaUrlPassword = topicSchemaUrlPassword;
  }

  public String getTopicSchemaUrlUserId() {
     return this.topicSchemaUrlUserId;
  }

  public void setTopicSchemaUrlUserId(String topicSchemaUrlUserId) {
     this.topicSchemaUrlUserId = topicSchemaUrlUserId;
  }

  public String getUserId() {
     return this.userId;
  }

  public void setUserId(String userId) {
     this.userId = userId;
  }


}
