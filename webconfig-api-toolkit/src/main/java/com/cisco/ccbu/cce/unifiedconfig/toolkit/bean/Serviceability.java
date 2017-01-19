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


@XmlRootElement(name="serviceability")
public class Serviceability extends BaseApiBean {
  private ApiStats apiStats;
  private CapacityInfo capacityInfo;
  private DeploymentTaskStats deploymentTaskStats;
  private JvmStats jvmStats;
  private SystemInfo systemInfo;
  private SystemInfo systemInfoSummary;
  private SystemValidationStatus systemValidationStatus;
  private TaskStats taskStats;
  private UcceVersion ucceVersion;
  private VersionBase version;

  public ApiStats getApiStats() {
     return this.apiStats;
  }

  public void setApiStats(ApiStats apiStats) {
     this.apiStats = apiStats;
  }

  public CapacityInfo getCapacityInfo() {
     return this.capacityInfo;
  }

  public void setCapacityInfo(CapacityInfo capacityInfo) {
     this.capacityInfo = capacityInfo;
  }

  public DeploymentTaskStats getDeploymentTaskStats() {
     return this.deploymentTaskStats;
  }

  public void setDeploymentTaskStats(DeploymentTaskStats deploymentTaskStats) {
     this.deploymentTaskStats = deploymentTaskStats;
  }

  public JvmStats getJvmStats() {
     return this.jvmStats;
  }

  public void setJvmStats(JvmStats jvmStats) {
     this.jvmStats = jvmStats;
  }

  public SystemInfo getSystemInfo() {
     return this.systemInfo;
  }

  public void setSystemInfo(SystemInfo systemInfo) {
     this.systemInfo = systemInfo;
  }

  @XmlElement(name="systemInfoSummary")
  public SystemInfo getSystemInfoSummary() {
     return this.systemInfoSummary;
  }

  public void setSystemInfoSummary(SystemInfo systemInfoSummary) {
     this.systemInfoSummary = systemInfoSummary;
  }

  @XmlElement(name="systemValidationStatus")
  public SystemValidationStatus getSystemValidationStatus() {
     return this.systemValidationStatus;
  }

  public void setSystemValidationStatus(SystemValidationStatus systemValidationStatus) {
     this.systemValidationStatus = systemValidationStatus;
  }

  public TaskStats getTaskStats() {
     return this.taskStats;
  }

  public void setTaskStats(TaskStats taskStats) {
     this.taskStats = taskStats;
  }

  @XmlElement(name="ucceVersion")
  public UcceVersion getUcceVersion() {
     return this.ucceVersion;
  }

  public void setUcceVersion(UcceVersion ucceVersion) {
     this.ucceVersion = ucceVersion;
  }

  public VersionBase getVersion() {
     return this.version;
  }

  public void setVersion(VersionBase version) {
     this.version = version;
  }


}
