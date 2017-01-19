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


@Path("mediaroutingdomain")
@XmlRootElement(name="results")
public class MediaRoutingDomainList extends BaseApiBean {
  private List<MediaRoutingDomain> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="mediaRoutingDomains")
  @XmlElement(name="mediaRoutingDomain")
  public List<MediaRoutingDomain> getItems() {
     return this.items;
  }

  public void setItems(List<MediaRoutingDomain> items) {
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


  @Path("mediaroutingdomain")
  @XmlRootElement(name = "results")
  public static class MediaRoutingDomainListList extends BaseApiListBean<MediaRoutingDomainList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<MediaRoutingDomainList> getItems() {
      return items;
    }

    public void setItems(List<MediaRoutingDomainList> items) {
      this.items = items;
    }
  }
}
