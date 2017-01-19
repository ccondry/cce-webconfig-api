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
@XmlRootElement(name="operationsResult")
public class OperationsResult extends BaseApiBean {
  private ApiErrors apiErrors;
  private ChangeSet createdObjects;
  private StatusType status;

  public ApiErrors getApiErrors() {
     return this.apiErrors;
  }

  public void setApiErrors(ApiErrors apiErrors) {
     this.apiErrors = apiErrors;
  }

  public ChangeSet getCreatedObjects() {
     return this.createdObjects;
  }

  public void setCreatedObjects(ChangeSet createdObjects) {
     this.createdObjects = createdObjects;
  }

  public StatusType getStatus() {
     return this.status;
  }

  public void setStatus(StatusType status) {
     this.status = status;
  }


  @Path("operation")
  @XmlRootElement(name = "results")
  public static class OperationsResultList extends BaseApiListBean<OperationsResult> {
    @XmlElementWrapper(name = "operationsResults")
    @XmlElement(name = "operationsResult")
    public List<OperationsResult> getItems() {
      return items;
    }

    public void setItems(List<OperationsResult> items) {
      this.items = items;
    }
  }
}
