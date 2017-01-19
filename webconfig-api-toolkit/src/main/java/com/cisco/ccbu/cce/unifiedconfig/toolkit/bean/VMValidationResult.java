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


@XmlRootElement(name="vmValidationResult")
public class VMValidationResult extends BaseApiBean {
  private Boolean isValid;
  private List<VMLayoutResult> layoutResults;

  @XmlElement(name="isValid")
  public Boolean getIsValid() {
     return this.isValid;
  }

  public void setIsValid(Boolean isValid) {
     this.isValid = isValid;
  }

  @XmlElementWrapper(name="vmLayoutResults")
  @XmlElement(name="vmLayoutResult")
  public List<VMLayoutResult> getLayoutResults() {
     return this.layoutResults;
  }

  public void setLayoutResults(List<VMLayoutResult> layoutResults) {
     this.layoutResults = layoutResults;
  }


}
