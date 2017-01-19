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
@XmlRootElement(name="errorDetail")
public class InvalidFeaturesErrorDetail extends BaseApiBean {
  private List<Feature> invalidFeatures;

  @XmlElementWrapper(name="invalidFeatures")
  @XmlElement(name="invalidFeature")
  public List<Feature> getInvalidFeatures() {
     return this.invalidFeatures;
  }

  public void setInvalidFeatures(List<Feature> invalidFeatures) {
     this.invalidFeatures = invalidFeatures;
  }


  @Path("role")
  @XmlRootElement(name = "results")
  public static class InvalidFeaturesErrorDetailList extends BaseApiListBean<InvalidFeaturesErrorDetail> {
    @XmlElementWrapper(name = "errorDetails")
    @XmlElement(name = "errorDetail")
    public List<InvalidFeaturesErrorDetail> getItems() {
      return items;
    }

    public void setItems(List<InvalidFeaturesErrorDetail> items) {
      this.items = items;
    }
  }
}
