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


@Path("agentdistribution")
@XmlRootElement(name="results")
public class AgentDistributionList extends BaseApiBean {
  private List<AgentDistribution> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="agentDistributions")
  @XmlElement(name="agentDistribution")
  public List<AgentDistribution> getItems() {
     return this.items;
  }

  public void setItems(List<AgentDistribution> items) {
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


  @Path("agentdistribution")
  @XmlRootElement(name = "results")
  public static class AgentDistributionListList extends BaseApiListBean<AgentDistributionList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<AgentDistributionList> getItems() {
      return items;
    }

    public void setItems(List<AgentDistributionList> items) {
      this.items = items;
    }
  }
}
