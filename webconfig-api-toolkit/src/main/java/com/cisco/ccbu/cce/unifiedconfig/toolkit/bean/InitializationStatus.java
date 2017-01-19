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


@Path("initialize")
@XmlRootElement(name="initializationStatus")
public class InitializationStatus extends BaseApiBean {
  private List<ApiError> apiErrors;
  private StateEnum state;
  private String stateString;
  private String taskName;

  @XmlElementWrapper(name="apiErrors")
  @XmlElement(name="apiError")
  public List<ApiError> getApiErrors() {
     return this.apiErrors;
  }

  public void setApiErrors(List<ApiError> apiErrors) {
     this.apiErrors = apiErrors;
  }

  public StateEnum getState() {
     return this.state;
  }

  public void setState(StateEnum state) {
     this.state = state;
  }

  public String getStateString() {
     return this.stateString;
  }

  public void setStateString(String stateString) {
     this.stateString = stateString;
  }

  @XmlElement(name="name")
  public String getTaskName() {
     return this.taskName;
  }

  public void setTaskName(String taskName) {
     this.taskName = taskName;
  }


  @Path("initialize")
  @XmlRootElement(name = "results")
  public static class InitializationStatusList extends BaseApiListBean<InitializationStatus> {
    @XmlElementWrapper(name = "initializationStatuss")
    @XmlElement(name = "initializationStatus")
    public List<InitializationStatus> getItems() {
      return items;
    }

    public void setItems(List<InitializationStatus> items) {
      this.items = items;
    }
  }
}
