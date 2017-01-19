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


@XmlRootElement(name="importContactSummary")
public class ImportContactSummary extends BaseApiBean {
  private String accountNumber;
  private int callResultOverall;
  private CallStatusEnum callStatusEnum;
  private String correlationId;
  private ReferenceBean department;
  private String firstName;
  private Integer id;
  private String lastName;
  private String refURL;

  public String getAccountNumber() {
     return this.accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
     this.accountNumber = accountNumber;
  }

  public int getCallResultOverall() {
     return this.callResultOverall;
  }

  public void setCallResultOverall(int callResultOverall) {
     this.callResultOverall = callResultOverall;
  }

  @XmlElement(name="callStatus")
  public CallStatusEnum getCallStatusEnum() {
     return this.callStatusEnum;
  }

  public void setCallStatusEnum(CallStatusEnum callStatusEnum) {
     this.callStatusEnum = callStatusEnum;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getFirstName() {
     return this.firstName;
  }

  public void setFirstName(String firstName) {
     this.firstName = firstName;
  }

  public Integer getId() {
     return this.id;
  }

  public void setId(Integer id) {
     this.id = id;
  }

  public String getLastName() {
     return this.lastName;
  }

  public void setLastName(String lastName) {
     this.lastName = lastName;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


}
