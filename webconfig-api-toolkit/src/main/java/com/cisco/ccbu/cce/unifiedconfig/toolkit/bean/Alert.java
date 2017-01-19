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


public class Alert extends BaseApiBean {
  private ApiErrors errors;
  private Machine machine;

  @XmlElement(name="apiErrors")
  public ApiErrors getErrors() {
     return this.errors;
  }

  public void setErrors(ApiErrors errors) {
     this.errors = errors;
  }

  public Machine getMachine() {
     return this.machine;
  }

  public void setMachine(Machine machine) {
     this.machine = machine;
  }


}
