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
@XmlRootElement(name="errorDetail")
public class ContactShareExpressionErrorDetail extends BaseApiBean {
  private List<ContactShareExpressionErrorDetailMessage> expressionErrors;

  @XmlElementWrapper(name="expressionErrors")
  @XmlElement(name="expressionError")
  public List<ContactShareExpressionErrorDetailMessage> getExpressionErrors() {
     return this.expressionErrors;
  }

  public void setExpressionErrors(List<ContactShareExpressionErrorDetailMessage> expressionErrors) {
     this.expressionErrors = expressionErrors;
  }


  @Path("contactsharerule")
  @XmlRootElement(name = "results")
  public static class ContactShareExpressionErrorDetailList extends BaseApiListBean<ContactShareExpressionErrorDetail> {
    @XmlElementWrapper(name = "errorDetails")
    @XmlElement(name = "errorDetail")
    public List<ContactShareExpressionErrorDetail> getItems() {
      return items;
    }

    public void setItems(List<ContactShareExpressionErrorDetail> items) {
      this.items = items;
    }
  }
}
