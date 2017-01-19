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


@Path("/department")
@XmlRootElement(name="results")
public class DepartmentList extends BaseApiBean {
  private List<Department> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="departments")
  @XmlElement(name="department")
  public List<Department> getItems() {
     return this.items;
  }

  public void setItems(List<Department> items) {
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


  @Path("/department")
  @XmlRootElement(name = "results")
  public static class DepartmentListList extends BaseApiListBean<DepartmentList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<DepartmentList> getItems() {
      return items;
    }

    public void setItems(List<DepartmentList> items) {
      this.items = items;
    }
  }
}
