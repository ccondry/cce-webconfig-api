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


@Path("deploymenttypeinfo")
@XmlRootElement(name="deploymentTypeInfo")
public class DeploymentTypeInfo extends BaseApiBean {
  private CapacityInfo capacityInfo;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private Integer deploymentType;
  private PermissionInfo permissionInfo;
  private SystemValidationStatus systemValidationStatus;
  private Integer targetDeploymentType;
  private List<VMHost> vmHosts;
  private String vmLayoutType;
  private String vmValidationLogURL;

  public CapacityInfo getCapacityInfo() {
     return this.capacityInfo;
  }

  public void setCapacityInfo(CapacityInfo capacityInfo) {
     this.capacityInfo = capacityInfo;
  }

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

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public Integer getDeploymentType() {
     return this.deploymentType;
  }

  public void setDeploymentType(Integer deploymentType) {
     this.deploymentType = deploymentType;
  }

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  public SystemValidationStatus getSystemValidationStatus() {
     return this.systemValidationStatus;
  }

  public void setSystemValidationStatus(SystemValidationStatus systemValidationStatus) {
     this.systemValidationStatus = systemValidationStatus;
  }

  public Integer getTargetDeploymentType() {
     return this.targetDeploymentType;
  }

  public void setTargetDeploymentType(Integer targetDeploymentType) {
     this.targetDeploymentType = targetDeploymentType;
  }

  @XmlElementWrapper(name="vmHosts")
  @XmlElement(name="vmHost")
  public List<VMHost> getVmHosts() {
     return this.vmHosts;
  }

  public void setVmHosts(List<VMHost> vmHosts) {
     this.vmHosts = vmHosts;
  }

  public String getVmLayoutType() {
     return this.vmLayoutType;
  }

  public void setVmLayoutType(String vmLayoutType) {
     this.vmLayoutType = vmLayoutType;
  }

  public String getVmValidationLogURL() {
     return this.vmValidationLogURL;
  }

  public void setVmValidationLogURL(String vmValidationLogURL) {
     this.vmValidationLogURL = vmValidationLogURL;
  }


  @Path("deploymenttypeinfo")
  @XmlRootElement(name = "results")
  public static class DeploymentTypeInfoList extends BaseApiListBean<DeploymentTypeInfo> {
    @XmlElementWrapper(name = "deploymentTypeInfos")
    @XmlElement(name = "deploymentTypeInfo")
    public List<DeploymentTypeInfo> getItems() {
      return items;
    }

    public void setItems(List<DeploymentTypeInfo> items) {
      this.items = items;
    }
  }
}
