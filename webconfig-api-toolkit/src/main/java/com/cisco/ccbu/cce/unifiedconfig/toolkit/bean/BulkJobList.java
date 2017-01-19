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


@Path("bulkjob")
@XmlRootElement(name="results")
public class BulkJobList extends BaseApiBean {
  private List<BulkJob> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="bulkJobs")
  @XmlElement(name="bulkJob")
  public List<BulkJob> getItems() {
     return this.items;
  }

  public void setItems(List<BulkJob> items) {
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


  @Path("bulkjob")
  @XmlRootElement(name = "results")
  public static class BulkJobListList extends BaseApiListBean<BulkJobList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<BulkJobList> getItems() {
      return items;
    }

    public void setItems(List<BulkJobList> items) {
      this.items = items;
    }
  }
}
