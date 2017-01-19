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


@XmlRootElement(name="pim")
public class WebsetupPim extends BaseApiBean {
  private String address;
  private String mobileAgentCodec;
  private String password;
  private String peripheralId;
  private String type;
  private String userName;

  public String getAddress() {
     return this.address;
  }

  public void setAddress(String address) {
     this.address = address;
  }

  public String getMobileAgentCodec() {
     return this.mobileAgentCodec;
  }

  public void setMobileAgentCodec(String mobileAgentCodec) {
     this.mobileAgentCodec = mobileAgentCodec;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public String getPeripheralId() {
     return this.peripheralId;
  }

  public void setPeripheralId(String peripheralId) {
     this.peripheralId = peripheralId;
  }

  public String getType() {
     return this.type;
  }

  public void setType(String type) {
     this.type = type;
  }

  public String getUserName() {
     return this.userName;
  }

  public void setUserName(String userName) {
     this.userName = userName;
  }


}
