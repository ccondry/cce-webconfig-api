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


public class ApiError extends BaseApiBean {
  private String errorData;
  private ApiErrorDetail errorDetail;
  private String errorMessage;
  private String errorType;

  public String getErrorData() {
     return this.errorData;
  }

  public void setErrorData(String errorData) {
     this.errorData = errorData;
  }

  public ApiErrorDetail getErrorDetail() {
     return this.errorDetail;
  }

  public void setErrorDetail(ApiErrorDetail errorDetail) {
     this.errorDetail = errorDetail;
  }

  public String getErrorMessage() {
     return this.errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
     this.errorMessage = errorMessage;
  }

  public String getErrorType() {
     return this.errorType;
  }

  public void setErrorType(String errorType) {
     this.errorType = errorType;
  }


}
