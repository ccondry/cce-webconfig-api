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


@Path("peripheral")
@XmlRootElement(name="results")
public class PeripheralList extends BaseApiBean {
  private List<PeripheralWithRoutingClient> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="peripherals")
  @XmlElement(name="peripheral")
  public List<PeripheralWithRoutingClient> getItems() {
     return this.items;
  }

  public void setItems(List<PeripheralWithRoutingClient> items) {
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


  @Path("peripheral")
  @XmlRootElement(name = "results")
  public static class PeripheralListList extends BaseApiListBean<PeripheralList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<PeripheralList> getItems() {
      return items;
    }

    public void setItems(List<PeripheralList> items) {
      this.items = items;
    }
  }
}
