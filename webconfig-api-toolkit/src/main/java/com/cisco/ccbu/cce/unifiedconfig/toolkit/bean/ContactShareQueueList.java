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


@Path("contactsharequeue")
@XmlRootElement(name="results")
public class ContactShareQueueList extends BaseApiBean {
  private List<ContactShareQueue> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="contactShareQueues")
  @XmlElement(name="contactShareQueue")
  public List<ContactShareQueue> getItems() {
     return this.items;
  }

  public void setItems(List<ContactShareQueue> items) {
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


  @Path("contactsharequeue")
  @XmlRootElement(name = "results")
  public static class ContactShareQueueListList extends BaseApiListBean<ContactShareQueueList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ContactShareQueueList> getItems() {
      return items;
    }

    public void setItems(List<ContactShareQueueList> items) {
      this.items = items;
    }
  }
}
