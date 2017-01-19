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


@Path("machineinventory")
@XmlRootElement(name="results")
public class MachineHostList extends BaseApiBean {
  private List<MachineHost> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="hosts")
  @XmlElement(name="host")
  public List<MachineHost> getItems() {
     return this.items;
  }

  public void setItems(List<MachineHost> items) {
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


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MachineHostListList extends BaseApiListBean<MachineHostList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<MachineHostList> getItems() {
      return items;
    }

    public void setItems(List<MachineHostList> items) {
      this.items = items;
    }
  }
}
