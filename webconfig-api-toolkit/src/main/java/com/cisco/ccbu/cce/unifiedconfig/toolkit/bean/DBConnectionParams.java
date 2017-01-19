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
public class DBConnectionParams extends BaseApiBean {
  private String database;
  private String dbEncoding;
  private String dbInstance;
  private String host;
  private Integer maxPoolSize;
  private Integer minPoolSize;
  private String password;
  private Integer port;
  private String userId;

  public String getDatabase() {
     return this.database;
  }

  public void setDatabase(String database) {
     this.database = database;
  }

  public String getDbEncoding() {
     return this.dbEncoding;
  }

  public void setDbEncoding(String dbEncoding) {
     this.dbEncoding = dbEncoding;
  }

  public String getDbInstance() {
     return this.dbInstance;
  }

  public void setDbInstance(String dbInstance) {
     this.dbInstance = dbInstance;
  }

  public String getHost() {
     return this.host;
  }

  public void setHost(String host) {
     this.host = host;
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

  public Integer getPort() {
     return this.port;
  }

  public void setPort(Integer port) {
     this.port = port;
  }

  public String getUserId() {
     return this.userId;
  }

  public void setUserId(String userId) {
     this.userId = userId;
  }


}
