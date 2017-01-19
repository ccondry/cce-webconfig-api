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


@Path("applicationpath")
@XmlRootElement(name="results")
public class ApplicationPathList extends BaseApiBean {
  private List<ApplicationPath> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="applicationPaths")
  @XmlElement(name="applicationPath")
  public List<ApplicationPath> getItems() {
     return this.items;
  }

  public void setItems(List<ApplicationPath> items) {
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


  @Path("applicationpath")
  @XmlRootElement(name = "results")
  public static class ApplicationPathListList extends BaseApiListBean<ApplicationPathList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ApplicationPathList> getItems() {
      return items;
    }

    public void setItems(List<ApplicationPathList> items) {
      this.items = items;
    }
  }
}
