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


@Path("database")
@XmlRootElement(name="results")
public class DatabaseList extends BaseApiBean {
  private List<Database> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="databases")
  @XmlElement(name="database")
  public List<Database> getItems() {
     return this.items;
  }

  public void setItems(List<Database> items) {
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


  @Path("database")
  @XmlRootElement(name = "results")
  public static class DatabaseListList extends BaseApiListBean<DatabaseList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<DatabaseList> getItems() {
      return items;
    }

    public void setItems(List<DatabaseList> items) {
      this.items = items;
    }
  }
}
