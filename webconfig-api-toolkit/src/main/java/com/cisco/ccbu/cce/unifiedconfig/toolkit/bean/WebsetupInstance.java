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


@Path("instance")
@XmlRootElement(name="instance")
public class WebsetupInstance extends BaseApiBean {
  private String facilityName;
  private String instanceName;
  private String refURL;

  public String getFacilityName() {
     return this.facilityName;
  }

  public void setFacilityName(String facilityName) {
     this.facilityName = facilityName;
  }

  public String getInstanceName() {
     return this.instanceName;
  }

  public void setInstanceName(String instanceName) {
     this.instanceName = instanceName;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("instance")
  @XmlRootElement(name = "results")
  public static class WebsetupInstanceList extends BaseApiListBean<WebsetupInstance> {
    @XmlElementWrapper(name = "instances")
    @XmlElement(name = "instance")
    public List<WebsetupInstance> getItems() {
      return items;
    }

    public void setItems(List<WebsetupInstance> items) {
      this.items = items;
    }
  }
}
