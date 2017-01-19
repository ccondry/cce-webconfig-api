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


@XmlRootElement(name="logger")
public class WebsetupLogger extends BaseApiBean {
  private String loggerSideAPrivateAddress;
  private String loggerSideBPrivateAddress;
  private String routerSideAPrivateAddress;
  private String routerSideBPrivateAddress;
  private String serviceAccountPassword;
  private String serviceAccountUserName;
  private String side;

  public String getLoggerSideAPrivateAddress() {
     return this.loggerSideAPrivateAddress;
  }

  public void setLoggerSideAPrivateAddress(String loggerSideAPrivateAddress) {
     this.loggerSideAPrivateAddress = loggerSideAPrivateAddress;
  }

  public String getLoggerSideBPrivateAddress() {
     return this.loggerSideBPrivateAddress;
  }

  public void setLoggerSideBPrivateAddress(String loggerSideBPrivateAddress) {
     this.loggerSideBPrivateAddress = loggerSideBPrivateAddress;
  }

  public String getRouterSideAPrivateAddress() {
     return this.routerSideAPrivateAddress;
  }

  public void setRouterSideAPrivateAddress(String routerSideAPrivateAddress) {
     this.routerSideAPrivateAddress = routerSideAPrivateAddress;
  }

  public String getRouterSideBPrivateAddress() {
     return this.routerSideBPrivateAddress;
  }

  public void setRouterSideBPrivateAddress(String routerSideBPrivateAddress) {
     this.routerSideBPrivateAddress = routerSideBPrivateAddress;
  }

  public String getServiceAccountPassword() {
     return this.serviceAccountPassword;
  }

  public void setServiceAccountPassword(String serviceAccountPassword) {
     this.serviceAccountPassword = serviceAccountPassword;
  }

  public String getServiceAccountUserName() {
     return this.serviceAccountUserName;
  }

  public void setServiceAccountUserName(String serviceAccountUserName) {
     this.serviceAccountUserName = serviceAccountUserName;
  }

  public String getSide() {
     return this.side;
  }

  public void setSide(String side) {
     this.side = side;
  }


}
