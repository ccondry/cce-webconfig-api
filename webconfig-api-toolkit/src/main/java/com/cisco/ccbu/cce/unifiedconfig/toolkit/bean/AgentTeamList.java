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


@Path("/agentteam")
@XmlRootElement(name="results")
public class AgentTeamList extends BaseApiBean {
  private List<AgentTeamBase> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="agentTeams")
  @XmlElement(name="agentTeam")
  public List<AgentTeamBase> getItems() {
     return this.items;
  }

  public void setItems(List<AgentTeamBase> items) {
     this.items = items;
  }

  public PageInfo getPageInfo() {
     return this.pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
     this.pageInfo = pageInfo;
  }

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }


  @Path("/agentteam")
  @XmlRootElement(name = "results")
  public static class AgentTeamListList extends BaseApiListBean<AgentTeamList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<AgentTeamList> getItems() {
      return items;
    }

    public void setItems(List<AgentTeamList> items) {
      this.items = items;
    }
  }
}
