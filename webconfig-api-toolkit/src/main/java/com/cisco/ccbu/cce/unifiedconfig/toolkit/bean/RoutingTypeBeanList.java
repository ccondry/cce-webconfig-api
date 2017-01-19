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


@Path("routingtype")
@XmlRootElement(name="results")
public class RoutingTypeBeanList extends BaseApiBean {
  private List<RoutingTypeBean> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="routingTypes")
  @XmlElement(name="routingType")
  public List<RoutingTypeBean> getItems() {
     return this.items;
  }

  public void setItems(List<RoutingTypeBean> items) {
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


  @Path("routingtype")
  @XmlRootElement(name = "results")
  public static class RoutingTypeBeanListList extends BaseApiListBean<RoutingTypeBeanList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<RoutingTypeBeanList> getItems() {
      return items;
    }

    public void setItems(List<RoutingTypeBeanList> items) {
      this.items = items;
    }
  }
}
