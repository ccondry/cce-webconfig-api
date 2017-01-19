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


@Path("sso")
@XmlRootElement(name="idsStatus")
public class IdsStatus extends BaseApiBean {
  private String state;

  public String getState() {
     return this.state;
  }

  public void setState(String state) {
     this.state = state;
  }


  @Path("sso")
  @XmlRootElement(name = "results")
  public static class IdsStatusList extends BaseApiListBean<IdsStatus> {
    @XmlElementWrapper(name = "idsStatuss")
    @XmlElement(name = "idsStatus")
    public List<IdsStatus> getItems() {
      return items;
    }

    public void setItems(List<IdsStatus> items) {
      this.items = items;
    }
  }
}
