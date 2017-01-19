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


@Path("agenttargetingrule")
@XmlRootElement(name="range")
public class AgentTargetingRuleRange extends BaseApiBean {
  private String highExtension;
  private String lowExtension;

  public String getHighExtension() {
     return this.highExtension;
  }

  public void setHighExtension(String highExtension) {
     this.highExtension = highExtension;
  }

  public String getLowExtension() {
     return this.lowExtension;
  }

  public void setLowExtension(String lowExtension) {
     this.lowExtension = lowExtension;
  }


  @Path("agenttargetingrule")
  @XmlRootElement(name = "results")
  public static class AgentTargetingRuleRangeList extends BaseApiListBean<AgentTargetingRuleRange> {
    @XmlElementWrapper(name = "ranges")
    @XmlElement(name = "range")
    public List<AgentTargetingRuleRange> getItems() {
      return items;
    }

    public void setItems(List<AgentTargetingRuleRange> items) {
      this.items = items;
    }
  }
}
