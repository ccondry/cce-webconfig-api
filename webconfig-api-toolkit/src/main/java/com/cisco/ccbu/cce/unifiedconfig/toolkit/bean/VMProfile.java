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


public class VMProfile extends BaseApiBean {
  private int cores;
  private long cpuReservation;
  private List<Long> diskSizesInGB;
  private String machineType;
  private int memoryInMB;
  private Integer memoryReservation;
  private String name;
  private String networkType;
  private Integer numberOfAddresses;
  private String os;
  private boolean required;
  private Integer videoMemory;

  public int getCores() {
     return this.cores;
  }

  public void setCores(int cores) {
     this.cores = cores;
  }

  public long getCpuReservation() {
     return this.cpuReservation;
  }

  public void setCpuReservation(long cpuReservation) {
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

  public String getMachineType() {
     return this.machineType;
  }

  public void setMachineType(String machineType) {
     this.machineType = machineType;
  }

  public int getMemoryInMB() {
     return this.memoryInMB;
  }

  public void setMemoryInMB(int memoryInMB) {
     this.memoryInMB = memoryInMB;
  }

  public Integer getMemoryReservation() {
     return this.memoryReservation;
  }

  public void setMemoryReservation(Integer memoryReservation) {
     this.memoryReservation = memoryReservation;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getNetworkType() {
     return this.networkType;
  }

  public void setNetworkType(String networkType) {
     this.networkType = networkType;
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

  public boolean getRequired() {
     return this.required;
  }

  public void setRequired(boolean required) {
     this.required = required;
  }

  public Integer getVideoMemory() {
     return this.videoMemory;
  }

  public void setVideoMemory(Integer videoMemory) {
     this.videoMemory = videoMemory;
  }


}
