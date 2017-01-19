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


@Path("timezone")
@XmlRootElement(name="results")
public class TimeZoneList extends BaseApiBean {
  private List<TimeZone> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="timeZones")
  @XmlElement(name="timeZone")
  public List<TimeZone> getItems() {
     return this.items;
  }

  public void setItems(List<TimeZone> items) {
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


  @Path("timezone")
  @XmlRootElement(name = "results")
  public static class TimeZoneListList extends BaseApiListBean<TimeZoneList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<TimeZoneList> getItems() {
      return items;
    }

    public void setItems(List<TimeZoneList> items) {
      this.items = items;
    }
  }
}
