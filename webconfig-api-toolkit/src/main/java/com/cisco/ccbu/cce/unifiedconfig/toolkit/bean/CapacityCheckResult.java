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


@XmlRootElement(name="capacityRule")
public class CapacityCheckResult extends BaseApiBean {
  private Long actual;
  private Object capacityCheckOperation;
  private Long max;
  private String name;

  public Long getActual() {
     return this.actual;
  }

  public void setActual(Long actual) {
     this.actual = actual;
  }

  public Object getCapacityCheckOperation() {
     return this.capacityCheckOperation;
  }

  public void setCapacityCheckOperation(Object capacityCheckOperation) {
     this.capacityCheckOperation = capacityCheckOperation;
  }

  public Long getMax() {
     return this.max;
  }

  public void setMax(Long max) {
     this.max = max;
  }

  @XmlElement(name="name")
  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }


}
