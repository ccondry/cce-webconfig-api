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


@Path("congestioncontrol")
@XmlRootElement(name="congestionControl")
public class CongestionControl extends BaseApiBean {
  private Integer changeStamp;
  private Boolean congestionEnabled;
  private Integer congestionTreatmentMode;
  private String correlationId;
  private Integer cpsCapacity;
  private Integer cpsCapacityDefault;
  private ReferenceBean department;
  private Integer deploymentType;
  private CongestionControlPermissionInfo permissionInfo;
  private String systemDefaultLabel;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public Boolean getCongestionEnabled() {
     return this.congestionEnabled;
  }

  public void setCongestionEnabled(Boolean congestionEnabled) {
     this.congestionEnabled = congestionEnabled;
  }

  public Integer getCongestionTreatmentMode() {
     return this.congestionTreatmentMode;
  }

  public void setCongestionTreatmentMode(Integer congestionTreatmentMode) {
     this.congestionTreatmentMode = congestionTreatmentMode;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  public Integer getCpsCapacity() {
     return this.cpsCapacity;
  }

  public void setCpsCapacity(Integer cpsCapacity) {
     this.cpsCapacity = cpsCapacity;
  }

  public Integer getCpsCapacityDefault() {
     return this.cpsCapacityDefault;
  }

  public void setCpsCapacityDefault(Integer cpsCapacityDefault) {
     this.cpsCapacityDefault = cpsCapacityDefault;
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

  public CongestionControlPermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(CongestionControlPermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  public String getSystemDefaultLabel() {
     return this.systemDefaultLabel;
  }

  public void setSystemDefaultLabel(String systemDefaultLabel) {
     this.systemDefaultLabel = systemDefaultLabel;
  }


  @Path("congestioncontrol")
  @XmlRootElement(name = "results")
  public static class CongestionControlList extends BaseApiListBean<CongestionControl> {
    @XmlElementWrapper(name = "congestionControls")
    @XmlElement(name = "congestionControl")
    public List<CongestionControl> getItems() {
      return items;
    }

    public void setItems(List<CongestionControl> items) {
      this.items = items;
    }
  }
}
