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


@Path("agenttargetingrule")
@XmlRootElement(name="results")
public class AgentTargetingRuleList extends BaseApiBean {
  private List<AgentTargetingRule> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="agentTargetingRules")
  @XmlElement(name="agentTargetingRule")
  public List<AgentTargetingRule> getItems() {
     return this.items;
  }

  public void setItems(List<AgentTargetingRule> items) {
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


  @Path("agenttargetingrule")
  @XmlRootElement(name = "results")
  public static class AgentTargetingRuleListList extends BaseApiListBean<AgentTargetingRuleList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<AgentTargetingRuleList> getItems() {
      return items;
    }

    public void setItems(List<AgentTargetingRuleList> items) {
      this.items = items;
    }
  }
}
