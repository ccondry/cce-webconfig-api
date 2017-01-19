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
@XmlRootElement(name="results")
public class WebsetupInstanceList extends BaseApiBean {


  @Path("instance")
  @XmlRootElement(name = "results")
  public static class WebsetupInstanceListList extends BaseApiListBean<WebsetupInstanceList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<WebsetupInstanceList> getItems() {
      return items;
    }

    public void setItems(List<WebsetupInstanceList> items) {
      this.items = items;
    }
  }
}
