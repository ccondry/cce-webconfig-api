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


@XmlRootElement(name="EnterpriseDatabaseConfig")
public class FinesseEnterpriseDatabaseConfig extends BaseApiBean {
  private String backupHost;
  private String databaseName;
  private String domain;
  private String host;
  private String password;
  private int port;
  private String userName;

  public String getBackupHost() {
     return this.backupHost;
  }

  public void setBackupHost(String backupHost) {
     this.backupHost = backupHost;
  }

  public String getDatabaseName() {
     return this.databaseName;
  }

  public void setDatabaseName(String databaseName) {
     this.databaseName = databaseName;
  }

  public String getDomain() {
     return this.domain;
  }

  public void setDomain(String domain) {
     this.domain = domain;
  }

  public String getHost() {
     return this.host;
  }

  public void setHost(String host) {
     this.host = host;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public int getPort() {
     return this.port;
  }

  public void setPort(int port) {
     this.port = port;
  }

  @XmlElement(name="username")
  public String getUserName() {
     return this.userName;
  }

  public void setUserName(String userName) {
     this.userName = userName;
  }


}
