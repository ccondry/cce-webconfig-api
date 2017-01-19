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


@XmlRootElement(name="vmHostData")
public class VMHostData extends BaseApiBean {
  private String bios;
  private short cpuCores;
  private List<VMDatastoreData> datastores;
  private Long memoryMB;
  private VMHostProfile serverProfile;
  private String serverVersion;
  private String vendor;

  public String getBios() {
     return this.bios;
  }

  public void setBios(String bios) {
     this.bios = bios;
  }

  public short getCpuCores() {
     return this.cpuCores;
  }

  public void setCpuCores(short cpuCores) {
     this.cpuCores = cpuCores;
  }

  @XmlElementWrapper(name="dataStores")
  @XmlElement(name="dataStore")
  public List<VMDatastoreData> getDatastores() {
     return this.datastores;
  }

  public void setDatastores(List<VMDatastoreData> datastores) {
     this.datastores = datastores;
  }

  public Long getMemoryMB() {
     return this.memoryMB;
  }

  public void setMemoryMB(Long memoryMB) {
     this.memoryMB = memoryMB;
  }

  @XmlElement(name="serverProfile")
  public VMHostProfile getServerProfile() {
     return this.serverProfile;
  }

  public void setServerProfile(VMHostProfile serverProfile) {
     this.serverProfile = serverProfile;
  }

  @XmlElement(name="version")
  public String getServerVersion() {
     return this.serverVersion;
  }

  public void setServerVersion(String serverVersion) {
     this.serverVersion = serverVersion;
  }

  public String getVendor() {
     return this.vendor;
  }

  public void setVendor(String vendor) {
     this.vendor = vendor;
  }


}
