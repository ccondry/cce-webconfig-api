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


@Path("reasoncode")
@XmlRootElement(name="results")
public class ReasonCodeList extends BaseApiBean {
  private List<ReasonCode> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="reasonCodes")
  @XmlElement(name="reasonCode")
  public List<ReasonCode> getItems() {
     return this.items;
  }

  public void setItems(List<ReasonCode> items) {
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


  @Path("reasoncode")
  @XmlRootElement(name = "results")
  public static class ReasonCodeListList extends BaseApiListBean<ReasonCodeList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ReasonCodeList> getItems() {
      return items;
    }

    public void setItems(List<ReasonCodeList> items) {
      this.items = items;
    }
  }
}
