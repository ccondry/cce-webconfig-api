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


@Path("contactsharerule")
@XmlRootElement(name="expressionError")
public class ContactShareExpressionErrorDetailMessage extends BaseApiBean {
  private String data;
  private String type;

  public String getData() {
     return this.data;
  }

  public void setData(String data) {
     this.data = data;
  }

  public String getType() {
     return this.type;
  }

  public void setType(String type) {
     this.type = type;
  }


  @Path("contactsharerule")
  @XmlRootElement(name = "results")
  public static class ContactShareExpressionErrorDetailMessageList extends BaseApiListBean<ContactShareExpressionErrorDetailMessage> {
    @XmlElementWrapper(name = "expressionErrors")
    @XmlElement(name = "expressionError")
    public List<ContactShareExpressionErrorDetailMessage> getItems() {
      return items;
    }

    public void setItems(List<ContactShareExpressionErrorDetailMessage> items) {
      this.items = items;
    }
  }
}
