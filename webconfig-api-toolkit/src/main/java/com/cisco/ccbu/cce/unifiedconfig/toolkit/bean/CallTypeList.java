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


@Path("calltype")
@XmlRootElement(name="results")
public class CallTypeList extends BaseApiBean {
  private List<CallType> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="callTypes")
  @XmlElement(name="callType")
  public List<CallType> getItems() {
     return this.items;
  }

  public void setItems(List<CallType> items) {
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


  @Path("calltype")
  @XmlRootElement(name = "results")
  public static class CallTypeListList extends BaseApiListBean<CallTypeList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<CallTypeList> getItems() {
      return items;
    }

    public void setItems(List<CallTypeList> items) {
      this.items = items;
    }
  }
}
