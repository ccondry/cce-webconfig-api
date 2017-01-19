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


@Path("awstatus")
@XmlRootElement(name="awStatus")
public class AwStatus extends BaseApiBean {
  private Double lastRetrievalKey;

  @XmlElement(name="##default")
  public Double getLastRetrievalKey() {
     return this.lastRetrievalKey;
  }

  public void setLastRetrievalKey(Double lastRetrievalKey) {
     this.lastRetrievalKey = lastRetrievalKey;
  }


  @Path("awstatus")
  @XmlRootElement(name = "results")
  public static class AwStatusList extends BaseApiListBean<AwStatus> {
    @XmlElementWrapper(name = "awStatuss")
    @XmlElement(name = "awStatus")
    public List<AwStatus> getItems() {
      return items;
    }

    public void setItems(List<AwStatus> items) {
      this.items = items;
    }
  }
}
