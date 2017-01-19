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


@Path("enterpriseroute")
@XmlRootElement(name="results")
public class EnterpriseRouteList extends BaseApiBean {
  private List<EnterpriseRoute> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="EnterpriseRoutes")
  @XmlElement(name="EnterpriseRoute")
  public List<EnterpriseRoute> getItems() {
     return this.items;
  }

  public void setItems(List<EnterpriseRoute> items) {
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


  @Path("enterpriseroute")
  @XmlRootElement(name = "results")
  public static class EnterpriseRouteListList extends BaseApiListBean<EnterpriseRouteList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<EnterpriseRouteList> getItems() {
      return items;
    }

    public void setItems(List<EnterpriseRouteList> items) {
      this.items = items;
    }
  }
}
