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
@XmlRootElement(name="traceLevels")
public class TraceLevels extends BaseApiBean {
  private List<Component> components;

  @XmlElement(name="component")
  public List<Component> getComponents() {
     return this.components;
  }

  public void setComponents(List<Component> components) {
     this.components = components;
  }


  @Path("tracelevel")
  @XmlRootElement(name = "results")
  public static class TraceLevelsList extends BaseApiListBean<TraceLevels> {
    @XmlElementWrapper(name = "traceLevelss")
    @XmlElement(name = "traceLevels")
    public List<TraceLevels> getItems() {
      return items;
    }

    public void setItems(List<TraceLevels> items) {
      this.items = items;
    }
  }
}
