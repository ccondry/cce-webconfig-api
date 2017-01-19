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


@Path("attribute")
@XmlRootElement(name="results")
public class AttributeList extends BaseApiBean {
  private List<AttributeBase> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="attributes")
  @XmlElement(name="attribute")
  public List<AttributeBase> getItems() {
     return this.items;
  }

  public void setItems(List<AttributeBase> items) {
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


  @Path("attribute")
  @XmlRootElement(name = "results")
  public static class AttributeListList extends BaseApiListBean<AttributeList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<AttributeList> getItems() {
      return items;
    }

    public void setItems(List<AttributeList> items) {
      this.items = items;
    }
  }
}
