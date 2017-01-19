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


public class CallGlobalSetting extends BaseApiBean {
  private Short abandonCallWaitTime;
  private Integer answeredShortCallThreshold;
  private String baseUrl;
  private ReferenceBean defaultBucketInterval;
  private ReferenceBean defaultCallType;
  private Integer serviceLevelThreshold;
  private Short serviceLevelType;

  public Short getAbandonCallWaitTime() {
     return this.abandonCallWaitTime;
  }

  public void setAbandonCallWaitTime(Short abandonCallWaitTime) {
     this.abandonCallWaitTime = abandonCallWaitTime;
  }

  public Integer getAnsweredShortCallThreshold() {
     return this.answeredShortCallThreshold;
  }

  public void setAnsweredShortCallThreshold(Integer answeredShortCallThreshold) {
     this.answeredShortCallThreshold = answeredShortCallThreshold;
  }

  public String getBaseUrl() {
     return this.baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
     this.baseUrl = baseUrl;
  }

  public ReferenceBean getDefaultBucketInterval() {
     return this.defaultBucketInterval;
  }

  public void setDefaultBucketInterval(ReferenceBean defaultBucketInterval) {
     this.defaultBucketInterval = defaultBucketInterval;
  }

  public ReferenceBean getDefaultCallType() {
     return this.defaultCallType;
  }

  public void setDefaultCallType(ReferenceBean defaultCallType) {
     this.defaultCallType = defaultCallType;
  }

  public Integer getServiceLevelThreshold() {
     return this.serviceLevelThreshold;
  }

  public void setServiceLevelThreshold(Integer serviceLevelThreshold) {
     this.serviceLevelThreshold = serviceLevelThreshold;
  }

  public Short getServiceLevelType() {
     return this.serviceLevelType;
  }

  public void setServiceLevelType(Short serviceLevelType) {
     this.serviceLevelType = serviceLevelType;
  }


}
