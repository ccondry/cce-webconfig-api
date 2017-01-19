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


@Path("contactsharegroup")
@XmlRootElement(name="results")
public class ContactShareGroupList extends BaseApiBean {
  private List<ContactShareGroup> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="contactShareGroups")
  @XmlElement(name="contactShareGroup")
  public List<ContactShareGroup> getItems() {
     return this.items;
  }

  public void setItems(List<ContactShareGroup> items) {
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


  @Path("contactsharegroup")
  @XmlRootElement(name = "results")
  public static class ContactShareGroupListList extends BaseApiListBean<ContactShareGroupList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ContactShareGroupList> getItems() {
      return items;
    }

    public void setItems(List<ContactShareGroupList> items) {
      this.items = items;
    }
  }
}
