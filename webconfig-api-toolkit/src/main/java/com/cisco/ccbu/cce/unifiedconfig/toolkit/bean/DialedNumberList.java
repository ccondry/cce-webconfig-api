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


@Path("dialednumber")
@XmlRootElement(name="results")
public class DialedNumberList extends BaseApiBean {
  private List<DialedNumber> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="dialedNumbers")
  @XmlElement(name="dialedNumber")
  public List<DialedNumber> getItems() {
     return this.items;
  }

  public void setItems(List<DialedNumber> items) {
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


  @Path("dialednumber")
  @XmlRootElement(name = "results")
  public static class DialedNumberListList extends BaseApiListBean<DialedNumberList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<DialedNumberList> getItems() {
      return items;
    }

    public void setItems(List<DialedNumberList> items) {
      this.items = items;
    }
  }
}
