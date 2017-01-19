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


@Path("campaign")
@XmlRootElement(name="results")
public class CampaignList extends BaseApiBean {
  private List<Campaign> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="campaigns")
  @XmlElement(name="campaign")
  public List<Campaign> getItems() {
     return this.items;
  }

  public void setItems(List<Campaign> items) {
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


  @Path("campaign")
  @XmlRootElement(name = "results")
  public static class CampaignListList extends BaseApiListBean<CampaignList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<CampaignList> getItems() {
      return items;
    }

    public void setItems(List<CampaignList> items) {
      this.items = items;
    }
  }
}
