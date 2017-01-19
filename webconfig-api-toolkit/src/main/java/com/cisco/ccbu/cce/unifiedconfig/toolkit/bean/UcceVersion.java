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


@XmlRootElement(name="ucceVersion")
public class UcceVersion extends BaseApiBean {
  private int buildVersion;
  private int esVersion;
  private int maintenanceVersion;
  private int majorVersion;
  private int minorVersion;
  private int srVersion;

  @XmlElement(name="buildVersion")
  public int getBuildVersion() {
     return this.buildVersion;
  }

  public void setBuildVersion(int buildVersion) {
     this.buildVersion = buildVersion;
  }

  @XmlElement(name="esVersion")
  public int getEsVersion() {
     return this.esVersion;
  }

  public void setEsVersion(int esVersion) {
     this.esVersion = esVersion;
  }

  @XmlElement(name="maintenanceVersion")
  public int getMaintenanceVersion() {
     return this.maintenanceVersion;
  }

  public void setMaintenanceVersion(int maintenanceVersion) {
     this.maintenanceVersion = maintenanceVersion;
  }

  @XmlElement(name="majorVersion")
  public int getMajorVersion() {
     return this.majorVersion;
  }

  public void setMajorVersion(int majorVersion) {
     this.majorVersion = majorVersion;
  }

  @XmlElement(name="minorVersion")
  public int getMinorVersion() {
     return this.minorVersion;
  }

  public void setMinorVersion(int minorVersion) {
     this.minorVersion = minorVersion;
  }

  @XmlElement(name="srVersion")
  public int getSrVersion() {
     return this.srVersion;
  }

  public void setSrVersion(int srVersion) {
     this.srVersion = srVersion;
  }


}
