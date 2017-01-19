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


@Path("notifications")
@XmlRootElement(name="results")
public class NotificationList extends BaseApiBean {
  private PermissionInfo permissionInfo;

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }


  @Path("notifications")
  @XmlRootElement(name = "results")
  public static class NotificationListList extends BaseApiListBean<NotificationList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<NotificationList> getItems() {
      return items;
    }

    public void setItems(List<NotificationList> items) {
      this.items = items;
    }
  }
}
