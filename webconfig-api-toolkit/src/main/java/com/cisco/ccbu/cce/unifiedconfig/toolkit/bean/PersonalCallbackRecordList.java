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


@Path("personalcallback")
@XmlRootElement(name="results")
public class PersonalCallbackRecordList extends BaseApiBean {
  private List<PersonalCallbackRecord> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="personalCallbacks")
  @XmlElement(name="personalCallback")
  public List<PersonalCallbackRecord> getItems() {
     return this.items;
  }

  public void setItems(List<PersonalCallbackRecord> items) {
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


  @Path("personalcallback")
  @XmlRootElement(name = "results")
  public static class PersonalCallbackRecordListList extends BaseApiListBean<PersonalCallbackRecordList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<PersonalCallbackRecordList> getItems() {
      return items;
    }

    public void setItems(List<PersonalCallbackRecordList> items) {
      this.items = items;
    }
  }
}
