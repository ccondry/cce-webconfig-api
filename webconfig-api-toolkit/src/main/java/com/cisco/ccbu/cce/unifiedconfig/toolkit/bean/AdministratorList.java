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


@Path("administrator")
@XmlRootElement(name="results")
public class AdministratorList extends BaseApiBean {
  private List<Administrator> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="administrators")
  @XmlElement(name="administrator")
  public List<Administrator> getItems() {
     return this.items;
  }

  public void setItems(List<Administrator> items) {
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


  @Path("administrator")
  @XmlRootElement(name = "results")
  public static class AdministratorListList extends BaseApiListBean<AdministratorList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<AdministratorList> getItems() {
      return items;
    }

    public void setItems(List<AdministratorList> items) {
      this.items = items;
    }
  }
}
