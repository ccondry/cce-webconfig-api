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


@Path("validobjects")
@XmlRootElement(name="validObjects")
public class ValidObjects extends BaseApiBean {
  private Access access;
  private List<Integer> ids;
  private String type;

  public Access getAccess() {
     return this.access;
  }

  public void setAccess(Access access) {
     this.access = access;
  }

  public List<Integer> getIds() {
     return this.ids;
  }

  public void setIds(List<Integer> ids) {
     this.ids = ids;
  }

  public String getType() {
     return this.type;
  }

  public void setType(String type) {
     this.type = type;
  }


  @Path("validobjects")
  @XmlRootElement(name = "results")
  public static class ValidObjectsList extends BaseApiListBean<ValidObjects> {
    @XmlElementWrapper(name = "validObjectss")
    @XmlElement(name = "validObjects")
    public List<ValidObjects> getItems() {
      return items;
    }

    public void setItems(List<ValidObjects> items) {
      this.items = items;
    }
  }
}
