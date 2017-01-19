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


@Path("peripheralgateway")
@XmlRootElement(name="results")
public class RoutingClientList extends BaseApiBean {
  private List<RoutingClient> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="routingClients")
  @XmlElement(name="routingClient")
  public List<RoutingClient> getItems() {
     return this.items;
  }

  public void setItems(List<RoutingClient> items) {
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


  @Path("peripheralgateway")
  @XmlRootElement(name = "results")
  public static class RoutingClientListList extends BaseApiListBean<RoutingClientList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<RoutingClientList> getItems() {
      return items;
    }

    public void setItems(List<RoutingClientList> items) {
      this.items = items;
    }
  }
}
