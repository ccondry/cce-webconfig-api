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


@XmlRootElement(name="errorDetail")
public class MachineListErrorDetail extends BaseApiBean {
  private String errorType;
  private Set machines;

  public String getErrorType() {
     return this.errorType;
  }

  public void setErrorType(String errorType) {
     this.errorType = errorType;
  }

  @XmlElementWrapper(name="machines")
  @XmlElement(name="machine")
  public Set getMachines() {
     return this.machines;
  }

  public void setMachines(Set machines) {
     this.machines = machines;
  }


}
