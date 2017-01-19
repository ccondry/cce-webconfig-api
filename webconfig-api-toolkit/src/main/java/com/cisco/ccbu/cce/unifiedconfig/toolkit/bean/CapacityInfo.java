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


@XmlRootElement(name="capacityInfo")
public class CapacityInfo extends BaseApiBean {
  private List<CapacityCheckResult> capacityCheckResults;

  @XmlElementWrapper(name="capacityRules")
  @XmlElement(name="capacityRule")
  public List<CapacityCheckResult> getCapacityCheckResults() {
     return this.capacityCheckResults;
  }

  public void setCapacityCheckResults(List<CapacityCheckResult> capacityCheckResults) {
     this.capacityCheckResults = capacityCheckResults;
  }


}
