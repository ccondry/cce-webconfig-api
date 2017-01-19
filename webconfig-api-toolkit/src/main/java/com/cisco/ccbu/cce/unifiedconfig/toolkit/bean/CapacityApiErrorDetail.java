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
public class CapacityApiErrorDetail extends BaseApiBean {
  private Integer actual;
  private Integer max;
  private String name;

  public Integer getActual() {
     return this.actual;
  }

  public void setActual(Integer actual) {
     this.actual = actual;
  }

  public Integer getMax() {
     return this.max;
  }

  public void setMax(Integer max) {
     this.max = max;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }


}
