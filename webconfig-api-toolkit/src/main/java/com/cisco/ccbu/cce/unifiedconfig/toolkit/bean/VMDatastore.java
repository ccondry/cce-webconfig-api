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


public class VMDatastore extends BaseApiBean {
  private Long maxSizeInGB;
  private Long minSizeInGB;
  private Long sizeInGB;
  private List<VMProfile> vmsToMatch;

  public Long getMaxSizeInGB() {
     return this.maxSizeInGB;
  }

  public void setMaxSizeInGB(Long maxSizeInGB) {
     this.maxSizeInGB = maxSizeInGB;
  }

  public Long getMinSizeInGB() {
     return this.minSizeInGB;
  }

  public void setMinSizeInGB(Long minSizeInGB) {
     this.minSizeInGB = minSizeInGB;
  }

  public Long getSizeInGB() {
     return this.sizeInGB;
  }

  public void setSizeInGB(Long sizeInGB) {
     this.sizeInGB = sizeInGB;
  }

  @XmlElementWrapper(name="vmsToMatch")
  @XmlElement(name="vm")
  public List<VMProfile> getVmsToMatch() {
     return this.vmsToMatch;
  }

  public void setVmsToMatch(List<VMProfile> vmsToMatch) {
     this.vmsToMatch = vmsToMatch;
  }


}
