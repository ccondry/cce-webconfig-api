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


@Path("notifications")
@XmlRootElement(name="##default")
public class Notification extends BaseApiBean {
  private Category category;
  private int count;

  public Category getCategory() {
     return this.category;
  }

  public void setCategory(Category category) {
     this.category = category;
  }

  public int getCount() {
     return this.count;
  }

  public void setCount(int count) {
     this.count = count;
  }


  @Path("notifications")
  @XmlRootElement(name = "results")
  public static class NotificationList extends BaseApiListBean<Notification> {
    @XmlElementWrapper(name = "##defaults")
    @XmlElement(name = "##default")
    public List<Notification> getItems() {
      return items;
    }

    public void setItems(List<Notification> items) {
      this.items = items;
    }
  }
}
