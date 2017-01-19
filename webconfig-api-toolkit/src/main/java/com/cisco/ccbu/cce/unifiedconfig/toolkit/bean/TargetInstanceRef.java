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


@Path("contactsharequeue")
@XmlRootElement(name="targetInstance")
public class TargetInstanceRef extends BaseApiBean {
  private Integer id;
  private String name;

  public Integer getId() {
     return this.id;
  }

  public void setId(Integer id) {
     this.id = id;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }


  @Path("contactsharequeue")
  @XmlRootElement(name = "results")
  public static class TargetInstanceRefList extends BaseApiListBean<TargetInstanceRef> {
    @XmlElementWrapper(name = "targetInstances")
    @XmlElement(name = "targetInstance")
    public List<TargetInstanceRef> getItems() {
      return items;
    }

    public void setItems(List<TargetInstanceRef> items) {
      this.items = items;
    }
  }
}
