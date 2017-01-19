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


@XmlRootElement(name="vmStatus")
public class VMData extends BaseApiBean {
  private List<VMDatastoreData> actualDatastores;
  private Integer cores;
  private Long cpuReservation;
  private List<Long> diskSizesInGB;
  private VMDatastore expectedDatastore;
  private String guestOS;
  private String hostName;
  private String instanceId;
  private Integer memoryInMB;
  private Integer memoryReservation;
  private Integer numberOfAddresses;
  private String os;
  private Boolean poweredOn;
  private VMProfile profile;
  private String profileName;
  private Integer videoMemory;
  private List<VMAddress> vmAddresses;
  private String vmAnnotation;
  private String vmName;
  private String vmToolsVersion;
  private boolean vmwareToolsUpToDate;

  public List<VMDatastoreData> getActualDatastores() {
     return this.actualDatastores;
  }

  public void setActualDatastores(List<VMDatastoreData> actualDatastores) {
     this.actualDatastores = actualDatastores;
  }

  public Integer getCores() {
     return this.cores;
  }

  public void setCores(Integer cores) {
     this.cores = cores;
  }

  public Long getCpuReservation() {
     return this.cpuReservation;
  }

  public void setCpuReservation(Long cpuReservation) {
     this.cpuReservation = cpuReservation;
  }

  @XmlElementWrapper(name="disks")
  @XmlElement(name="disk")
  public List<Long> getDiskSizesInGB() {
     return this.diskSizesInGB;
  }

  public void setDiskSizesInGB(List<Long> diskSizesInGB) {
     this.diskSizesInGB = diskSizesInGB;
  }

  public VMDatastore getExpectedDatastore() {
     return this.expectedDatastore;
  }

  public void setExpectedDatastore(VMDatastore expectedDatastore) {
     this.expectedDatastore = expectedDatastore;
  }

  public String getGuestOS() {
     return this.guestOS;
  }

  public void setGuestOS(String guestOS) {
     this.guestOS = guestOS;
  }

  public String getHostName() {
     return this.hostName;
  }

  public void setHostName(String hostName) {
     this.hostName = hostName;
  }

  public String getInstanceId() {
     return this.instanceId;
  }

  public void setInstanceId(String instanceId) {
     this.instanceId = instanceId;
  }

  public Integer getMemoryInMB() {
     return this.memoryInMB;
  }

  public void setMemoryInMB(Integer memoryInMB) {
     this.memoryInMB = memoryInMB;
  }

  public Integer getMemoryReservation() {
     return this.memoryReservation;
  }

  public void setMemoryReservation(Integer memoryReservation) {
     this.memoryReservation = memoryReservation;
  }

  public Integer getNumberOfAddresses() {
     return this.numberOfAddresses;
  }

  public void setNumberOfAddresses(Integer numberOfAddresses) {
     this.numberOfAddresses = numberOfAddresses;
  }

  public String getOs() {
     return this.os;
  }

  public void setOs(String os) {
     this.os = os;
  }

  public Boolean getPoweredOn() {
     return this.poweredOn;
  }

  public void setPoweredOn(Boolean poweredOn) {
     this.poweredOn = poweredOn;
  }

  public VMProfile getProfile() {
     return this.profile;
  }

  public void setProfile(VMProfile profile) {
     this.profile = profile;
  }

  public String getProfileName() {
     return this.profileName;
  }

  public void setProfileName(String profileName) {
     this.profileName = profileName;
  }

  public Integer getVideoMemory() {
     return this.videoMemory;
  }

  public void setVideoMemory(Integer videoMemory) {
     this.videoMemory = videoMemory;
  }

  @XmlElementWrapper(name="addresses")
  @XmlElement(name="address")
  public List<VMAddress> getVmAddresses() {
     return this.vmAddresses;
  }

  public void setVmAddresses(List<VMAddress> vmAddresses) {
     this.vmAddresses = vmAddresses;
  }

  public String getVmAnnotation() {
     return this.vmAnnotation;
  }

  public void setVmAnnotation(String vmAnnotation) {
     this.vmAnnotation = vmAnnotation;
  }

  public String getVmName() {
     return this.vmName;
  }

  public void setVmName(String vmName) {
     this.vmName = vmName;
  }

  public String getVmToolsVersion() {
     return this.vmToolsVersion;
  }

  public void setVmToolsVersion(String vmToolsVersion) {
     this.vmToolsVersion = vmToolsVersion;
  }

  public boolean getVmwareToolsUpToDate() {
     return this.vmwareToolsUpToDate;
  }

  public void setVmwareToolsUpToDate(boolean vmwareToolsUpToDate) {
     this.vmwareToolsUpToDate = vmwareToolsUpToDate;
  }


}
