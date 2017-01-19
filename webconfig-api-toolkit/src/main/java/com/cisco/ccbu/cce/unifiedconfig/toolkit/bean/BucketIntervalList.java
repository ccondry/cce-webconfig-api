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


@Path("bucketinterval")
@XmlRootElement(name="results")
public class BucketIntervalList extends BaseApiBean {
  private List<BucketInterval> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="bucketIntervals")
  @XmlElement(name="bucketInterval")
  public List<BucketInterval> getItems() {
     return this.items;
  }

  public void setItems(List<BucketInterval> items) {
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


  @Path("bucketinterval")
  @XmlRootElement(name = "results")
  public static class BucketIntervalListList extends BaseApiListBean<BucketIntervalList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<BucketIntervalList> getItems() {
      return items;
    }

    public void setItems(List<BucketIntervalList> items) {
      this.items = items;
    }
  }
}
