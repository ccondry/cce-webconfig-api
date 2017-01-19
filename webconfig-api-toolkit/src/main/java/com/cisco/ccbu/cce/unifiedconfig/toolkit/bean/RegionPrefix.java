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


@XmlRootElement(name="regionprefix")
public class RegionPrefix extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private Timestamp dateTimeStamp;
  private Boolean daylightSavingEnabled;
  private ReferenceBean department;
  private Integer gmt;
  private String refURL;
  private Integer regionId;
  private String regionPrefix;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  public Timestamp getDateTimeStamp() {
     return this.dateTimeStamp;
  }

  public void setDateTimeStamp(Timestamp dateTimeStamp) {
     this.dateTimeStamp = dateTimeStamp;
  }

  public Boolean getDaylightSavingEnabled() {
     return this.daylightSavingEnabled;
  }

  public void setDaylightSavingEnabled(Boolean daylightSavingEnabled) {
     this.daylightSavingEnabled = daylightSavingEnabled;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public Integer getGmt() {
     return this.gmt;
  }

  public void setGmt(Integer gmt) {
     this.gmt = gmt;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getRegionId() {
     return this.regionId;
  }

  public void setRegionId(Integer regionId) {
     this.regionId = regionId;
  }

  public String getRegionPrefix() {
     return this.regionPrefix;
  }

  public void setRegionPrefix(String regionPrefix) {
     this.regionPrefix = regionPrefix;
  }


}
