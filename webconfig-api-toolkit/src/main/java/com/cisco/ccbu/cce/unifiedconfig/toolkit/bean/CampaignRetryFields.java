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


public class CampaignRetryFields extends BaseApiBean {
  private Integer answeringMachineDelay;
  private Integer busySignalDelay;
  private Integer customerAbandonedDelay;
  private Integer customerNotHomeDelay;
  private Integer dialerAbandonedDelay;
  private Integer noAnswerDelay;

  public Integer getAnsweringMachineDelay() {
     return this.answeringMachineDelay;
  }

  public void setAnsweringMachineDelay(Integer answeringMachineDelay) {
     this.answeringMachineDelay = answeringMachineDelay;
  }

  public Integer getBusySignalDelay() {
     return this.busySignalDelay;
  }

  public void setBusySignalDelay(Integer busySignalDelay) {
     this.busySignalDelay = busySignalDelay;
  }

  public Integer getCustomerAbandonedDelay() {
     return this.customerAbandonedDelay;
  }

  public void setCustomerAbandonedDelay(Integer customerAbandonedDelay) {
     this.customerAbandonedDelay = customerAbandonedDelay;
  }

  public Integer getCustomerNotHomeDelay() {
     return this.customerNotHomeDelay;
  }

  public void setCustomerNotHomeDelay(Integer customerNotHomeDelay) {
     this.customerNotHomeDelay = customerNotHomeDelay;
  }

  public Integer getDialerAbandonedDelay() {
     return this.dialerAbandonedDelay;
  }

  public void setDialerAbandonedDelay(Integer dialerAbandonedDelay) {
     this.dialerAbandonedDelay = dialerAbandonedDelay;
  }

  public Integer getNoAnswerDelay() {
     return this.noAnswerDelay;
  }

  public void setNoAnswerDelay(Integer noAnswerDelay) {
     this.noAnswerDelay = noAnswerDelay;
  }


}
