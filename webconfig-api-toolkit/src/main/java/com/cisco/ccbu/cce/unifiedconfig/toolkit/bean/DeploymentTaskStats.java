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


public class DeploymentTaskStats extends BaseApiBean {
  private List<DeploymentTaskInfo> taskStats;

  @XmlElementWrapper(name="deploymentTaskStats")
  @XmlElement(name="deploymentTaskInfo")
  public List<DeploymentTaskInfo> getTaskStats() {
     return this.taskStats;
  }

  public void setTaskStats(List<DeploymentTaskInfo> taskStats) {
     this.taskStats = taskStats;
  }


}
