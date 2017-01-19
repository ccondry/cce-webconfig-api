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


@Path("networkvruscript")
@XmlRootElement(name="results")
public class NetworkVruScriptList extends BaseApiBean {
  private List<NetworkVruScript> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="networkVruScripts")
  @XmlElement(name="networkVruScript")
  public List<NetworkVruScript> getItems() {
     return this.items;
  }

  public void setItems(List<NetworkVruScript> items) {
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


  @Path("networkvruscript")
  @XmlRootElement(name = "results")
  public static class NetworkVruScriptListList extends BaseApiListBean<NetworkVruScriptList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<NetworkVruScriptList> getItems() {
      return items;
    }

    public void setItems(List<NetworkVruScriptList> items) {
      this.items = items;
    }
  }
}
