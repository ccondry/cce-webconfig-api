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
public class ValueListErrorDetail extends BaseApiBean {
  private List<String> invalidValues;

  @XmlElementWrapper(name="invalidValues")
  @XmlElement(name="invalidValue")
  public List<String> getInvalidValues() {
     return this.invalidValues;
  }

  public void setInvalidValues(List<String> invalidValues) {
     this.invalidValues = invalidValues;
  }


}
