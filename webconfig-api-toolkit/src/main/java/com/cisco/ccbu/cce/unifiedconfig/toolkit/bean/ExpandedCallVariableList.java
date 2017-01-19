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


@Path("expandedcallvariable")
@XmlRootElement(name="results")
public class ExpandedCallVariableList extends BaseApiBean {
  private ExpandedCallVariableGlobalInfo globalInfo;
  private List<ExpandedCallVariable> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  public ExpandedCallVariableGlobalInfo getGlobalInfo() {
     return this.globalInfo;
  }

  public void setGlobalInfo(ExpandedCallVariableGlobalInfo globalInfo) {
     this.globalInfo = globalInfo;
  }

  @XmlElementWrapper(name="expandedCallVariables")
  @XmlElement(name="expandedCallVariable")
  public List<ExpandedCallVariable> getItems() {
     return this.items;
  }

  public void setItems(List<ExpandedCallVariable> items) {
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


  @Path("expandedcallvariable")
  @XmlRootElement(name = "results")
  public static class ExpandedCallVariableListList extends BaseApiListBean<ExpandedCallVariableList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ExpandedCallVariableList> getItems() {
      return items;
    }

    public void setItems(List<ExpandedCallVariableList> items) {
      this.items = items;
    }
  }
}
