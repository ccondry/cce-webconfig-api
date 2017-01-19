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


@Path("precisionqueue")
@XmlRootElement(name="results")
public class PrecisionQueueList extends BaseApiBean {
  private List<PrecisionQueue> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="precisionQueues")
  @XmlElement(name="precisionQueue")
  public List<PrecisionQueue> getItems() {
     return this.items;
  }

  public void setItems(List<PrecisionQueue> items) {
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


  @Path("precisionqueue")
  @XmlRootElement(name = "results")
  public static class PrecisionQueueListList extends BaseApiListBean<PrecisionQueueList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<PrecisionQueueList> getItems() {
      return items;
    }

    public void setItems(List<PrecisionQueueList> items) {
      this.items = items;
    }
  }
}
