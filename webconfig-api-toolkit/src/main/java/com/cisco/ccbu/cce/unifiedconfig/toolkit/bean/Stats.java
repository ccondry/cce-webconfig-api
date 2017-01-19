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


@Path("stats")
@XmlRootElement(name="stats")
public class Stats extends BaseApiBean {
  private int numberOfAgentsLoggedIn;

  @XmlElement(name="numberOfAgentsLoggedIn")
  public int getNumberOfAgentsLoggedIn() {
     return this.numberOfAgentsLoggedIn;
  }

  public void setNumberOfAgentsLoggedIn(int numberOfAgentsLoggedIn) {
     this.numberOfAgentsLoggedIn = numberOfAgentsLoggedIn;
  }


  @Path("stats")
  @XmlRootElement(name = "results")
  public static class StatsList extends BaseApiListBean<Stats> {
    @XmlElementWrapper(name = "statss")
    @XmlElement(name = "stats")
    public List<Stats> getItems() {
      return items;
    }

    public void setItems(List<Stats> items) {
      this.items = items;
    }
  }
}
