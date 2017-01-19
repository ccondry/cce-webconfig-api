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


@Path("agentstatetrace")
@XmlRootElement(name="agentstatetrace")
public class AgentStateTrace extends BaseApiBean {
  private List<AgentBase> agentList;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private PermissionInfo permissionInfo;
  private String refURL;

  @XmlElementWrapper(name="agents")
  @XmlElement(name="agent")
  public List<AgentBase> getAgentList() {
     return this.agentList;
  }

  public void setAgentList(List<AgentBase> agentList) {
     this.agentList = agentList;
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

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("agentstatetrace")
  @XmlRootElement(name = "results")
  public static class AgentStateTraceList extends BaseApiListBean<AgentStateTrace> {
    @XmlElementWrapper(name = "agentstatetraces")
    @XmlElement(name = "agentstatetrace")
    public List<AgentStateTrace> getItems() {
      return items;
    }

    public void setItems(List<AgentStateTrace> items) {
      this.items = items;
    }
  }
}
