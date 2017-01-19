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


@Path("initialize")
@XmlRootElement(name="results")
public class InitializationStatusResults extends BaseApiBean {
  private StateEnum state;
  private List<InitializationStatus> statusList;

  @XmlElement(name="state")
  public StateEnum getState() {
     return this.state;
  }

  public void setState(StateEnum state) {
     this.state = state;
  }

  @XmlElementWrapper(name="initializationStatuses")
  @XmlElement(name="initializationStatus")
  public List<InitializationStatus> getStatusList() {
     return this.statusList;
  }

  public void setStatusList(List<InitializationStatus> statusList) {
     this.statusList = statusList;
  }


  @Path("initialize")
  @XmlRootElement(name = "results")
  public static class InitializationStatusResultsList extends BaseApiListBean<InitializationStatusResults> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<InitializationStatusResults> getItems() {
      return items;
    }

    public void setItems(List<InitializationStatusResults> items) {
      this.items = items;
    }
  }
}
