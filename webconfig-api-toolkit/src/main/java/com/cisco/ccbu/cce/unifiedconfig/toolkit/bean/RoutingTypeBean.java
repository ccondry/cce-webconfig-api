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


@Path("routingtype")
@XmlRootElement(name="routingType")
public class RoutingTypeBean extends BaseApiBean {
  private String machineType;
  private State state;
  private Integer type;

  public String getMachineType() {
     return this.machineType;
  }

  public void setMachineType(String machineType) {
     this.machineType = machineType;
  }

  public State getState() {
     return this.state;
  }

  public void setState(State state) {
     this.state = state;
  }

  public Integer getType() {
     return this.type;
  }

  public void setType(Integer type) {
     this.type = type;
  }


  @Path("routingtype")
  @XmlRootElement(name = "results")
  public static class RoutingTypeBeanList extends BaseApiListBean<RoutingTypeBean> {
    @XmlElementWrapper(name = "routingTypes")
    @XmlElement(name = "routingType")
    public List<RoutingTypeBean> getItems() {
      return items;
    }

    public void setItems(List<RoutingTypeBean> items) {
      this.items = items;
    }
  }
}
