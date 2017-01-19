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


@XmlRootElement(name="initStatus")
public class InitStatus extends BaseApiBean {
  private StateEnum state;
  private DeploymentModel targetDeploymentType;

  public StateEnum getState() {
     return this.state;
  }

  public void setState(StateEnum state) {
     this.state = state;
  }

  public DeploymentModel getTargetDeploymentType() {
     return this.targetDeploymentType;
  }

  public void setTargetDeploymentType(DeploymentModel targetDeploymentType) {
     this.targetDeploymentType = targetDeploymentType;
  }


}
