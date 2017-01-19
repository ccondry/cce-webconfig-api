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


@Path("tracelevel")
@XmlRootElement(name="results")
public class TraceLevelsList extends BaseApiBean {
  private PermissionInfo permissionInfo;
  private TraceLevels traceLevels;

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  @XmlElement(name="traceLevels")
  public TraceLevels getTraceLevels() {
     return this.traceLevels;
  }

  public void setTraceLevels(TraceLevels traceLevels) {
     this.traceLevels = traceLevels;
  }


  @Path("tracelevel")
  @XmlRootElement(name = "results")
  public static class TraceLevelsListList extends BaseApiListBean<TraceLevelsList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<TraceLevelsList> getItems() {
      return items;
    }

    public void setItems(List<TraceLevelsList> items) {
      this.items = items;
    }
  }
}
