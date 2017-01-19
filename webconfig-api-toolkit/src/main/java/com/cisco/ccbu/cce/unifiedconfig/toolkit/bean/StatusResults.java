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
@XmlRootElement(name="results")
public class StatusResults extends BaseApiBean {
  private List<Status> statuses;

  @XmlElementWrapper(name="statuses")
  @XmlElement(name="status")
  public List<Status> getStatuses() {
     return this.statuses;
  }

  public void setStatuses(List<Status> statuses) {
     this.statuses = statuses;
  }


  @Path("status")
  @XmlRootElement(name = "results")
  public static class StatusResultsList extends BaseApiListBean<StatusResults> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<StatusResults> getItems() {
      return items;
    }

    public void setItems(List<StatusResults> items) {
      this.items = items;
    }
  }
}
