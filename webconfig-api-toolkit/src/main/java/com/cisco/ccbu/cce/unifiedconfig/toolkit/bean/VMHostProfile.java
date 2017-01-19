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


public class VMHostProfile extends BaseApiBean {
  private String biosVersion;
  private List<VMDatastore> datastores;
  private short minCpuCores;
  private long minimumMemoryMB;
  private List<String> supportedServerVersions;
  private String vendor;
  private List<VMProfile> vmsToMatch;

  public String getBiosVersion() {
     return this.biosVersion;
  }

  public void setBiosVersion(String biosVersion) {
     this.biosVersion = biosVersion;
  }

  @XmlElementWrapper(name="dataStores")
  @XmlElement(name="dataStore")
  public List<VMDatastore> getDatastores() {
     return this.datastores;
  }

  public void setDatastores(List<VMDatastore> datastores) {
     this.datastores = datastores;
  }

  public short getMinCpuCores() {
     return this.minCpuCores;
  }

  public void setMinCpuCores(short minCpuCores) {
     this.minCpuCores = minCpuCores;
  }

  public long getMinimumMemoryMB() {
     return this.minimumMemoryMB;
  }

  public void setMinimumMemoryMB(long minimumMemoryMB) {
     this.minimumMemoryMB = minimumMemoryMB;
  }

  @XmlElementWrapper(name="supportedServerVersions")
  @XmlElement(name="version")
  public List<String> getSupportedServerVersions() {
     return this.supportedServerVersions;
  }

  public void setSupportedServerVersions(List<String> supportedServerVersions) {
     this.supportedServerVersions = supportedServerVersions;
  }

  public String getVendor() {
     return this.vendor;
  }

  public void setVendor(String vendor) {
     this.vendor = vendor;
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
