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


@Path("dnc")
@XmlRootElement(name="results")
public class DNCList extends BaseApiBean {
  private List<ImportRule> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="dncs")
  @XmlElement(name="dnc")
  public List<ImportRule> getItems() {
     return this.items;
  }

  public void setItems(List<ImportRule> items) {
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


  @Path("dnc")
  @XmlRootElement(name = "results")
  public static class DNCListList extends BaseApiListBean<DNCList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<DNCList> getItems() {
      return items;
    }

    public void setItems(List<DNCList> items) {
      this.items = items;
    }
  }
}
