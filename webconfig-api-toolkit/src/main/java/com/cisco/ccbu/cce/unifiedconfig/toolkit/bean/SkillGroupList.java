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


@Path("skillgroup")
@XmlRootElement(name="results")
public class SkillGroupList extends BaseApiBean {
  private List<SkillGroupBase> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="skillGroups")
  @XmlElement(name="skillGroup")
  public List<SkillGroupBase> getItems() {
     return this.items;
  }

  public void setItems(List<SkillGroupBase> items) {
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


  @Path("skillgroup")
  @XmlRootElement(name = "results")
  public static class SkillGroupListList extends BaseApiListBean<SkillGroupList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<SkillGroupList> getItems() {
      return items;
    }

    public void setItems(List<SkillGroupList> items) {
      this.items = items;
    }
  }
}
