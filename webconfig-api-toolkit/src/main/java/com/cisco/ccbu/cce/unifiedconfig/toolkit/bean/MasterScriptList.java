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


@Path("masterscript")
@XmlRootElement(name="results")
public class MasterScriptList extends BaseApiBean {
  private List<MasterScript> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="masterScripts")
  @XmlElement(name="masterScript")
  public List<MasterScript> getItems() {
     return this.items;
  }

  public void setItems(List<MasterScript> items) {
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


  @Path("masterscript")
  @XmlRootElement(name = "results")
  public static class MasterScriptListList extends BaseApiListBean<MasterScriptList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<MasterScriptList> getItems() {
      return items;
    }

    public void setItems(List<MasterScriptList> items) {
      this.items = items;
    }
  }
}
