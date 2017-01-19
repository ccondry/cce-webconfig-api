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


@Path("contactsharerule")
@XmlRootElement(name="results")
public class ContactShareRuleList extends BaseApiBean {
  private List<ContactShareRule> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="contactShareRules")
  @XmlElement(name="contactShareRule")
  public List<ContactShareRule> getItems() {
     return this.items;
  }

  public void setItems(List<ContactShareRule> items) {
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


  @Path("contactsharerule")
  @XmlRootElement(name = "results")
  public static class ContactShareRuleListList extends BaseApiListBean<ContactShareRuleList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ContactShareRuleList> getItems() {
      return items;
    }

    public void setItems(List<ContactShareRuleList> items) {
      this.items = items;
    }
  }
}
