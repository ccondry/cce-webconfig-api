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


@XmlRootElement(name="aw")
public class WebsetupAW extends BaseApiBean {
  private String loggerSideAPublicAddress;
  private String loggerSideBPublicAddress;
  private String preferredSide;
  private String routerSideAPublicAddress;
  private String routerSideBPublicAddress;
  private String serviceAccountPassword;
  private String serviceAccountUserName;

  public String getLoggerSideAPublicAddress() {
     return this.loggerSideAPublicAddress;
  }

  public void setLoggerSideAPublicAddress(String loggerSideAPublicAddress) {
     this.loggerSideAPublicAddress = loggerSideAPublicAddress;
  }

  public String getLoggerSideBPublicAddress() {
     return this.loggerSideBPublicAddress;
  }

  public void setLoggerSideBPublicAddress(String loggerSideBPublicAddress) {
     this.loggerSideBPublicAddress = loggerSideBPublicAddress;
  }

  public String getPreferredSide() {
     return this.preferredSide;
  }

  public void setPreferredSide(String preferredSide) {
     this.preferredSide = preferredSide;
  }

  public String getRouterSideAPublicAddress() {
     return this.routerSideAPublicAddress;
  }

  public void setRouterSideAPublicAddress(String routerSideAPublicAddress) {
     this.routerSideAPublicAddress = routerSideAPublicAddress;
  }

  public String getRouterSideBPublicAddress() {
     return this.routerSideBPublicAddress;
  }

  public void setRouterSideBPublicAddress(String routerSideBPublicAddress) {
     this.routerSideBPublicAddress = routerSideBPublicAddress;
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


}
