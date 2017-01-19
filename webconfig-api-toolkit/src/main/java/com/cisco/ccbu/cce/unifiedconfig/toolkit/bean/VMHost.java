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


@XmlRootElement(name="vmHost")
public class VMHost extends BaseApiBean {
  private String address;
  private Integer changeStamp;
  private String name;
  private String password;
  private String refURL;
  private Boolean systemDefault;
  private String userName;

  public String getAddress() {
     return this.address;
  }

  public void setAddress(String address) {
     this.address = address;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Boolean getSystemDefault() {
     return this.systemDefault;
  }

  public void setSystemDefault(Boolean systemDefault) {
     this.systemDefault = systemDefault;
  }

  public String getUserName() {
     return this.userName;
  }

  public void setUserName(String userName) {
     this.userName = userName;
  }


}
