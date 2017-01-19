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


@Path("deployment")
@XmlRootElement(name="deployment")
public class Deployment extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private Integer deploymentType;
  private Boolean supervisorLoginAllowed;

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

  public Boolean getSupervisorLoginAllowed() {
     return this.supervisorLoginAllowed;
  }

  public void setSupervisorLoginAllowed(Boolean supervisorLoginAllowed) {
     this.supervisorLoginAllowed = supervisorLoginAllowed;
  }


  @Path("deployment")
  @XmlRootElement(name = "results")
  public static class DeploymentList extends BaseApiListBean<Deployment> {
    @XmlElementWrapper(name = "deployments")
    @XmlElement(name = "deployment")
    public List<Deployment> getItems() {
      return items;
    }

    public void setItems(List<Deployment> items) {
      this.items = items;
    }
  }
}
