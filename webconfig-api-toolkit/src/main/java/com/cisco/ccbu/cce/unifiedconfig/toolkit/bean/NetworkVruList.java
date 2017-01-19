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


@Path("networkvru")
@XmlRootElement(name="results")
public class NetworkVruList extends BaseApiBean {
  private List<NetworkVru> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="networkVrus")
  @XmlElement(name="networkVru")
  public List<NetworkVru> getItems() {
     return this.items;
  }

  public void setItems(List<NetworkVru> items) {
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


  @Path("networkvru")
  @XmlRootElement(name = "results")
  public static class NetworkVruListList extends BaseApiListBean<NetworkVruList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<NetworkVruList> getItems() {
      return items;
    }

    public void setItems(List<NetworkVruList> items) {
      this.items = items;
    }
  }
}
