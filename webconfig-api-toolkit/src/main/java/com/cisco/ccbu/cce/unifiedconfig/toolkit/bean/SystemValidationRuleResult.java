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


@XmlRootElement(name="validationRule")
public class SystemValidationRuleResult extends BaseApiBean {
  private String actual;
  private String expected;
  private Boolean isValid;
  private Integer max;
  private Integer min;
  private String name;

  @XmlElement(name="actual")
  public String getActual() {
     return this.actual;
  }

  public void setActual(String actual) {
     this.actual = actual;
  }

  @XmlElement(name="expected")
  public String getExpected() {
     return this.expected;
  }

  public void setExpected(String expected) {
     this.expected = expected;
  }

  @XmlElement(name="isValid")
  public Boolean getIsValid() {
     return this.isValid;
  }

  public void setIsValid(Boolean isValid) {
     this.isValid = isValid;
  }

  @XmlElement(name="max")
  public Integer getMax() {
     return this.max;
  }

  public void setMax(Integer max) {
     this.max = max;
  }

  @XmlElement(name="min")
  public Integer getMin() {
     return this.min;
  }

  public void setMin(Integer min) {
     this.min = min;
  }

  @XmlElement(name="name")
  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }


}
