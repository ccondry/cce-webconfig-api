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


@Path("dialednumber")
@XmlRootElement(name="dialedNumberRecord")
public class DialedNumberRecord extends BaseApiBean {
  private Integer id;
  private String name;

  public Integer getId() {
     return this.id;
  }

  public void setId(Integer id) {
     this.id = id;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }


  @Path("dialednumber")
  @XmlRootElement(name = "results")
  public static class DialedNumberRecordList extends BaseApiListBean<DialedNumberRecord> {
    @XmlElementWrapper(name = "dialedNumberRecords")
    @XmlElement(name = "dialedNumberRecord")
    public List<DialedNumberRecord> getItems() {
      return items;
    }

    public void setItems(List<DialedNumberRecord> items) {
      this.items = items;
    }
  }
}
