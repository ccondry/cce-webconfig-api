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


public class VMAddress extends BaseApiBean {
  private String ipAddress;
  private String name;
  private String networkType;

  public String getIpAddress() {
     return this.ipAddress;
  }

  public void setIpAddress(String ipAddress) {
     this.ipAddress = ipAddress;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getNetworkType() {
     return this.networkType;
  }

  public void setNetworkType(String networkType) {
     this.networkType = networkType;
  }


}
