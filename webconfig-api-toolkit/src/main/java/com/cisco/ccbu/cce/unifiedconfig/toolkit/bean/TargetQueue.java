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
@XmlRootElement(name="targetQueue")
public class TargetQueue extends BaseApiBean {
  private Integer id;

  public Integer getId() {
     return this.id;
  }

  public void setId(Integer id) {
     this.id = id;
  }


  @Path("contactsharequeue")
  @XmlRootElement(name = "results")
  public static class TargetQueueList extends BaseApiListBean<TargetQueue> {
    @XmlElementWrapper(name = "targetQueues")
    @XmlElement(name = "targetQueue")
    public List<TargetQueue> getItems() {
      return items;
    }

    public void setItems(List<TargetQueue> items) {
      this.items = items;
    }
  }
}
