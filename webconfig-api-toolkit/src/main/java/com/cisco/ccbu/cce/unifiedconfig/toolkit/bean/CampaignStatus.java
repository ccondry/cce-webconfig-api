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


@Path("campaign")
@XmlRootElement(name="runtimeStatus")
public class CampaignStatus extends BaseApiBean {
  private Integer abandonDetectCount;
  private Integer abandonToIVRCount;
  private Integer agentClosedCount;
  private Integer agentRejectedCount;
  private Integer answeringMachineCount;
  private Integer attemptedCount;
  private Integer busyCount;
  private Integer callBackCount;
  private Integer cancelledDetectCount;
  private Integer closedCount;
  private Integer customerAbandonDetectCount;
  private Integer customerNotHomeCount;
  private Date dateTime;
  private Integer faxDetectCount;
  private Integer networkAnsMachineCount;
  private Integer noAnswerDetectCount;
  private Integer noDialToneDetectCount;
  private Integer noRingBackDetectCount;
  private Integer personalCallbackCount;
  private Integer sitToneDetectCount;
  private Integer talkTimeCount;
  private Integer totalCount;
  private Integer totalVoiceCount;
  private Integer voiceCount;
  private Integer wrapupTimeCount;
  private Integer wrongNumberCount;

  public Integer getAbandonDetectCount() {
     return this.abandonDetectCount;
  }

  public void setAbandonDetectCount(Integer abandonDetectCount) {
     this.abandonDetectCount = abandonDetectCount;
  }

  @XmlElement(name="abandonToIvrCount")
  public Integer getAbandonToIVRCount() {
     return this.abandonToIVRCount;
  }

  public void setAbandonToIVRCount(Integer abandonToIVRCount) {
     this.abandonToIVRCount = abandonToIVRCount;
  }

  public Integer getAgentClosedCount() {
     return this.agentClosedCount;
  }

  public void setAgentClosedCount(Integer agentClosedCount) {
     this.agentClosedCount = agentClosedCount;
  }

  public Integer getAgentRejectedCount() {
     return this.agentRejectedCount;
  }

  public void setAgentRejectedCount(Integer agentRejectedCount) {
     this.agentRejectedCount = agentRejectedCount;
  }

  public Integer getAnsweringMachineCount() {
     return this.answeringMachineCount;
  }

  public void setAnsweringMachineCount(Integer answeringMachineCount) {
     this.answeringMachineCount = answeringMachineCount;
  }

  public Integer getAttemptedCount() {
     return this.attemptedCount;
  }

  public void setAttemptedCount(Integer attemptedCount) {
     this.attemptedCount = attemptedCount;
  }

  public Integer getBusyCount() {
     return this.busyCount;
  }

  public void setBusyCount(Integer busyCount) {
     this.busyCount = busyCount;
  }

  public Integer getCallBackCount() {
     return this.callBackCount;
  }

  public void setCallBackCount(Integer callBackCount) {
     this.callBackCount = callBackCount;
  }

  public Integer getCancelledDetectCount() {
     return this.cancelledDetectCount;
  }

  public void setCancelledDetectCount(Integer cancelledDetectCount) {
     this.cancelledDetectCount = cancelledDetectCount;
  }

  public Integer getClosedCount() {
     return this.closedCount;
  }

  public void setClosedCount(Integer closedCount) {
     this.closedCount = closedCount;
  }

  public Integer getCustomerAbandonDetectCount() {
     return this.customerAbandonDetectCount;
  }

  public void setCustomerAbandonDetectCount(Integer customerAbandonDetectCount) {
     this.customerAbandonDetectCount = customerAbandonDetectCount;
  }

  public Integer getCustomerNotHomeCount() {
     return this.customerNotHomeCount;
  }

  public void setCustomerNotHomeCount(Integer customerNotHomeCount) {
     this.customerNotHomeCount = customerNotHomeCount;
  }

  public Date getDateTime() {
     return this.dateTime;
  }

  public void setDateTime(Date dateTime) {
     this.dateTime = dateTime;
  }

  public Integer getFaxDetectCount() {
     return this.faxDetectCount;
  }

  public void setFaxDetectCount(Integer faxDetectCount) {
     this.faxDetectCount = faxDetectCount;
  }

  public Integer getNetworkAnsMachineCount() {
     return this.networkAnsMachineCount;
  }

  public void setNetworkAnsMachineCount(Integer networkAnsMachineCount) {
     this.networkAnsMachineCount = networkAnsMachineCount;
  }

  public Integer getNoAnswerDetectCount() {
     return this.noAnswerDetectCount;
  }

  public void setNoAnswerDetectCount(Integer noAnswerDetectCount) {
     this.noAnswerDetectCount = noAnswerDetectCount;
  }

  public Integer getNoDialToneDetectCount() {
     return this.noDialToneDetectCount;
  }

  public void setNoDialToneDetectCount(Integer noDialToneDetectCount) {
     this.noDialToneDetectCount = noDialToneDetectCount;
  }

  public Integer getNoRingBackDetectCount() {
     return this.noRingBackDetectCount;
  }

  public void setNoRingBackDetectCount(Integer noRingBackDetectCount) {
     this.noRingBackDetectCount = noRingBackDetectCount;
  }

  public Integer getPersonalCallbackCount() {
     return this.personalCallbackCount;
  }

  public void setPersonalCallbackCount(Integer personalCallbackCount) {
     this.personalCallbackCount = personalCallbackCount;
  }

  public Integer getSitToneDetectCount() {
     return this.sitToneDetectCount;
  }

  public void setSitToneDetectCount(Integer sitToneDetectCount) {
     this.sitToneDetectCount = sitToneDetectCount;
  }

  public Integer getTalkTimeCount() {
     return this.talkTimeCount;
  }

  public void setTalkTimeCount(Integer talkTimeCount) {
     this.talkTimeCount = talkTimeCount;
  }

  public Integer getTotalCount() {
     return this.totalCount;
  }

  public void setTotalCount(Integer totalCount) {
     this.totalCount = totalCount;
  }

  public Integer getTotalVoiceCount() {
     return this.totalVoiceCount;
  }

  public void setTotalVoiceCount(Integer totalVoiceCount) {
     this.totalVoiceCount = totalVoiceCount;
  }

  public Integer getVoiceCount() {
     return this.voiceCount;
  }

  public void setVoiceCount(Integer voiceCount) {
     this.voiceCount = voiceCount;
  }

  public Integer getWrapupTimeCount() {
     return this.wrapupTimeCount;
  }

  public void setWrapupTimeCount(Integer wrapupTimeCount) {
     this.wrapupTimeCount = wrapupTimeCount;
  }

  public Integer getWrongNumberCount() {
     return this.wrongNumberCount;
  }

  public void setWrongNumberCount(Integer wrongNumberCount) {
     this.wrongNumberCount = wrongNumberCount;
  }


  @Path("campaign")
  @XmlRootElement(name = "results")
  public static class CampaignStatusList extends BaseApiListBean<CampaignStatus> {
    @XmlElementWrapper(name = "runtimeStatuss")
    @XmlElement(name = "runtimeStatus")
    public List<CampaignStatus> getItems() {
      return items;
    }

    public void setItems(List<CampaignStatus> items) {
      this.items = items;
    }
  }
}
