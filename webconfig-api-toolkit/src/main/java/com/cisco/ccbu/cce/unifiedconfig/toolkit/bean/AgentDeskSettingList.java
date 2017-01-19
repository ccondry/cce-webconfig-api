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


@Path("agentdesksetting")
@XmlRootElement(name="results")
public class AgentDeskSettingList extends BaseApiBean {
  private List<AgentDeskSetting> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="agentDeskSettings")
  @XmlElement(name="agentDeskSetting")
  public List<AgentDeskSetting> getItems() {
     return this.items;
  }

  public void setItems(List<AgentDeskSetting> items) {
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


  @Path("agentdesksetting")
  @XmlRootElement(name = "results")
  public static class AgentDeskSettingListList extends BaseApiListBean<AgentDeskSettingList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<AgentDeskSettingList> getItems() {
      return items;
    }

    public void setItems(List<AgentDeskSettingList> items) {
      this.items = items;
    }
  }
}
