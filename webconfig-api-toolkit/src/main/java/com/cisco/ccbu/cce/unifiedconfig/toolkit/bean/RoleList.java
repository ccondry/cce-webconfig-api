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


@Path("role")
@XmlRootElement(name="results")
public class RoleList extends BaseApiBean {
  private List<Role> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="roles")
  @XmlElement(name="role")
  public List<Role> getItems() {
     return this.items;
  }

  public void setItems(List<Role> items) {
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


  @Path("role")
  @XmlRootElement(name = "results")
  public static class RoleListList extends BaseApiListBean<RoleList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<RoleList> getItems() {
      return items;
    }

    public void setItems(List<RoleList> items) {
      this.items = items;
    }
  }
}
