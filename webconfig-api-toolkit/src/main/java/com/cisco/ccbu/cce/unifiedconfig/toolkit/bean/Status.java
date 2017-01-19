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


public class Status extends BaseApiBean {
  private ApiError apiError;
  private State state;

  public ApiError getApiError() {
     return this.apiError;
  }

  public void setApiError(ApiError apiError) {
     this.apiError = apiError;
  }

  public State getState() {
     return this.state;
  }

  public void setState(State state) {
     this.state = state;
  }


}
