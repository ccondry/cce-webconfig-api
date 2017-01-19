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


@Path("operation")
@XmlRootElement(name="errorDetail")
public class ResourceErrorDetail extends BaseApiBean {
  private ApiErrors apiErrors;
  private ChangeSetElement changeSetElement;
  private String refURL;

  public ApiErrors getApiErrors() {
     return this.apiErrors;
  }

  public void setApiErrors(ApiErrors apiErrors) {
     this.apiErrors = apiErrors;
  }

  public ChangeSetElement getChangeSetElement() {
     return this.changeSetElement;
  }

  public void setChangeSetElement(ChangeSetElement changeSetElement) {
     this.changeSetElement = changeSetElement;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("operation")
  @XmlRootElement(name = "results")
  public static class ResourceErrorDetailList extends BaseApiListBean<ResourceErrorDetail> {
    @XmlElementWrapper(name = "errorDetails")
    @XmlElement(name = "errorDetail")
    public List<ResourceErrorDetail> getItems() {
      return items;
    }

    public void setItems(List<ResourceErrorDetail> items) {
      this.items = items;
    }
  }
}
