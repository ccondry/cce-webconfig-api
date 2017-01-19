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
public class Node extends BaseApiBean {
  private Boolean active;
  private String deviceType;
  private String hostName;
  private String ip;

  public Boolean getActive() {
     return this.active;
  }

  public void setActive(Boolean active) {
     this.active = active;
  }

  public String getDeviceType() {
     return this.deviceType;
  }

  public void setDeviceType(String deviceType) {
     this.deviceType = deviceType;
  }

  public String getHostName() {
     return this.hostName;
  }

  public void setHostName(String hostName) {
     this.hostName = hostName;
  }

  public String getIp() {
     return this.ip;
  }

  public void setIp(String ip) {
     this.ip = ip;
  }


}
