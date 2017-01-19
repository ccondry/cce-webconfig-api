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


@Path("logcollection")
@XmlRootElement(name="results")
public class LogCollectionList extends BaseApiBean {
  private PermissionInfo permissionInfo;

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }


  @Path("logcollection")
  @XmlRootElement(name = "results")
  public static class LogCollectionListList extends BaseApiListBean<LogCollectionList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<LogCollectionList> getItems() {
      return items;
    }

    public void setItems(List<LogCollectionList> items) {
      this.items = items;
    }
  }
}
