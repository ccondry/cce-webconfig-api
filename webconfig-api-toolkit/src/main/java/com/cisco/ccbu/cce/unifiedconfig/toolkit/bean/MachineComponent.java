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


@Path("machineinventory")
@XmlRootElement(name="component")
public class MachineComponent extends BaseApiBean {
  private String name;
  private String refURL;

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MachineComponentList extends BaseApiListBean<MachineComponent> {
    @XmlElementWrapper(name = "components")
    @XmlElement(name = "component")
    public List<MachineComponent> getItems() {
      return items;
    }

    public void setItems(List<MachineComponent> items) {
      this.items = items;
    }
  }
}
