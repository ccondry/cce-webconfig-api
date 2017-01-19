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


@Path("personalcallback")
@XmlRootElement(name="personalCallback")
public class PersonalCallbackRecord extends BaseApiBean {
  private String accountNumber;
  private ReferenceBean agent;
  private String agentId;
  private Short callResult;
  private CallStatusEnum callStatusEnum;
  private Date callbackDateTime;
  private ReferenceBean campaign;
  private String campaignDn;
  private Integer campaignId;
  private String correlationId;
  private ReferenceBean department;
  private String firstName;
  private Integer id;
  private String lastName;
  private Integer maxAttempts;
  private Short peripheralId;
  private String phone;
  private String refURL;

  public String getAccountNumber() {
     return this.accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
     this.accountNumber = accountNumber;
  }

  public ReferenceBean getAgent() {
     return this.agent;
  }

  public void setAgent(ReferenceBean agent) {
     this.agent = agent;
  }

  public String getAgentId() {
     return this.agentId;
  }

  public void setAgentId(String agentId) {
     this.agentId = agentId;
  }

  public Short getCallResult() {
     return this.callResult;
  }

  public void setCallResult(Short callResult) {
     this.callResult = callResult;
  }

  @XmlElement(name="callStatus")
  public CallStatusEnum getCallStatusEnum() {
     return this.callStatusEnum;
  }

  public void setCallStatusEnum(CallStatusEnum callStatusEnum) {
     this.callStatusEnum = callStatusEnum;
  }

  public Date getCallbackDateTime() {
     return this.callbackDateTime;
  }

  public void setCallbackDateTime(Date callbackDateTime) {
     this.callbackDateTime = callbackDateTime;
  }

  public ReferenceBean getCampaign() {
     return this.campaign;
  }

  public void setCampaign(ReferenceBean campaign) {
     this.campaign = campaign;
  }

  public String getCampaignDn() {
     return this.campaignDn;
  }

  public void setCampaignDn(String campaignDn) {
     this.campaignDn = campaignDn;
  }

  public Integer getCampaignId() {
     return this.campaignId;
  }

  public void setCampaignId(Integer campaignId) {
     this.campaignId = campaignId;
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

  public Integer getMaxAttempts() {
     return this.maxAttempts;
  }

  public void setMaxAttempts(Integer maxAttempts) {
     this.maxAttempts = maxAttempts;
  }

  public Short getPeripheralId() {
     return this.peripheralId;
  }

  public void setPeripheralId(Short peripheralId) {
     this.peripheralId = peripheralId;
  }

  public String getPhone() {
     return this.phone;
  }

  public void setPhone(String phone) {
     this.phone = phone;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("personalcallback")
  @XmlRootElement(name = "results")
  public static class PersonalCallbackRecordList extends BaseApiListBean<PersonalCallbackRecord> {
    @XmlElementWrapper(name = "personalCallbacks")
    @XmlElement(name = "personalCallback")
    public List<PersonalCallbackRecord> getItems() {
      return items;
    }

    public void setItems(List<PersonalCallbackRecord> items) {
      this.items = items;
    }
  }
}
