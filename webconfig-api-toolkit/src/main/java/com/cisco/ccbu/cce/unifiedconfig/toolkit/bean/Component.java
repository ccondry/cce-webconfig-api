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


public class Component extends BaseApiBean {
  private TraceLevelEnum level;
  private List<TraceMachine> traceMachines;
  private ProductEnum type;

  public TraceLevelEnum getLevel() {
     return this.level;
  }

  public void setLevel(TraceLevelEnum level) {
     this.level = level;
  }

  @XmlElementWrapper(name="traceMachines")
  @XmlElement(name="traceMachine")
  public List<TraceMachine> getTraceMachines() {
     return this.traceMachines;
  }

  public void setTraceMachines(List<TraceMachine> traceMachines) {
     this.traceMachines = traceMachines;
  }

  public ProductEnum getType() {
     return this.type;
  }

  public void setType(ProductEnum type) {
     this.type = type;
  }


}
