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


@Path("role")
@XmlRootElement(name="feature")
public class Feature extends BaseApiBean {
  private String category;
  private String name;

  @XmlElement(name="category")
  public String getCategory() {
     return this.category;
  }

  public void setCategory(String category) {
     this.category = category;
  }

  @XmlElement(name="name")
  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }


  @Path("role")
  @XmlRootElement(name = "results")
  public static class FeatureList extends BaseApiListBean<Feature> {
    @XmlElementWrapper(name = "features")
    @XmlElement(name = "feature")
    public List<Feature> getItems() {
      return items;
    }

    public void setItems(List<Feature> items) {
      this.items = items;
    }
  }
}
