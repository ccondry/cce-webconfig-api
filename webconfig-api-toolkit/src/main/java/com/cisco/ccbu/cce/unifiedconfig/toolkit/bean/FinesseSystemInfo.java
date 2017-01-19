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


@Path("status")
@XmlRootElement(name="SystemInfo")
public class FinesseSystemInfo extends BaseApiBean {
  private String status;

  @XmlElement(name="##default")
  public String getStatus() {
     return this.status;
  }

  public void setStatus(String status) {
     this.status = status;
  }


  @Path("status")
  @XmlRootElement(name = "results")
  public static class FinesseSystemInfoList extends BaseApiListBean<FinesseSystemInfo> {
    @XmlElementWrapper(name = "SystemInfos")
    @XmlElement(name = "SystemInfo")
    public List<FinesseSystemInfo> getItems() {
      return items;
    }

    public void setItems(List<FinesseSystemInfo> items) {
      this.items = items;
    }
  }
}
