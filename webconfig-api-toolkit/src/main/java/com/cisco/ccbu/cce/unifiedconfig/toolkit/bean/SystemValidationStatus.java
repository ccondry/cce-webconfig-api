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


@XmlRootElement(name="systemValidationStatus")
public class SystemValidationStatus extends BaseApiBean {
  private Boolean isValid;
  private List<SystemValidationRuleResult> systemValidationResult;

  @XmlElement(name="isValid")
  public Boolean getIsValid() {
     return this.isValid;
  }

  public void setIsValid(Boolean isValid) {
     this.isValid = isValid;
  }

  @XmlElementWrapper(name="validationRules")
  @XmlElement(name="validationRule")
  public List<SystemValidationRuleResult> getSystemValidationResult() {
     return this.systemValidationResult;
  }

  public void setSystemValidationResult(List<SystemValidationRuleResult> systemValidationResult) {
     this.systemValidationResult = systemValidationResult;
  }


}
