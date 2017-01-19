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
@XmlRootElement(name="campaign")
public class Campaign extends BaseApiBean {
  private Boolean abandonEnabled;
  private Float abandonPercent;
  private Integer amdTreatmentMode;
  private String campaignPrefix;
  private Integer campaignPurposeType;
  private Integer changeStamp;
  private String correlationId;
  private CampaignCPAFields cpaFields;
  private ReferenceBean department;
  private String description;
  private DialingMode dialingMode;
  private Boolean enabled;
  private Date endDate;
  private String endTime;
  private Boolean ipAmdEnabled;
  private Boolean ipTerminatingBeepDetect;
  private Float linesPerAgent;
  private Boolean markDeletable;
  private Integer maxAttempts;
  private Float maximumLinesPerAgent;
  private Integer minimumCallDuration;
  private String name;
  private Integer noAnswerRingLimit;
  private Boolean personalizedCallbackEnabled;
  private Integer predictiveCorrectionPace;
  private Float predictiveGain;
  private String refURL;
  private Integer rescheduleCallbackMode;
  private Integer reservationPercentage;
  private CampaignRetryFields retries;
  private List<CampaignSkillGroupInfo> skillGroupInfos;
  private List<CampaignSkillGroupInfo> skillGroupInfosAdded;
  private List<CampaignSkillGroupInfo> skillGroupInfosRemoved;
  private Date startDate;
  private String startTime;
  private TimeZoneRef timeZone;

  public Boolean getAbandonEnabled() {
     return this.abandonEnabled;
  }

  public void setAbandonEnabled(Boolean abandonEnabled) {
     this.abandonEnabled = abandonEnabled;
  }

  public Float getAbandonPercent() {
     return this.abandonPercent;
  }

  public void setAbandonPercent(Float abandonPercent) {
     this.abandonPercent = abandonPercent;
  }

  public Integer getAmdTreatmentMode() {
     return this.amdTreatmentMode;
  }

  public void setAmdTreatmentMode(Integer amdTreatmentMode) {
     this.amdTreatmentMode = amdTreatmentMode;
  }

  @XmlElement(name="campaignPrefix")
  public String getCampaignPrefix() {
     return this.campaignPrefix;
  }

  public void setCampaignPrefix(String campaignPrefix) {
     this.campaignPrefix = campaignPrefix;
  }

  public Integer getCampaignPurposeType() {
     return this.campaignPurposeType;
  }

  public void setCampaignPurposeType(Integer campaignPurposeType) {
     this.campaignPurposeType = campaignPurposeType;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  @XmlElement(name="callProgressAnalysis")
  public CampaignCPAFields getCpaFields() {
     return this.cpaFields;
  }

  public void setCpaFields(CampaignCPAFields cpaFields) {
     this.cpaFields = cpaFields;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public DialingMode getDialingMode() {
     return this.dialingMode;
  }

  public void setDialingMode(DialingMode dialingMode) {
     this.dialingMode = dialingMode;
  }

  public Boolean getEnabled() {
     return this.enabled;
  }

  public void setEnabled(Boolean enabled) {
     this.enabled = enabled;
  }

  public Date getEndDate() {
     return this.endDate;
  }

  public void setEndDate(Date endDate) {
     this.endDate = endDate;
  }

  public String getEndTime() {
     return this.endTime;
  }

  public void setEndTime(String endTime) {
     this.endTime = endTime;
  }

  public Boolean getIpAmdEnabled() {
     return this.ipAmdEnabled;
  }

  public void setIpAmdEnabled(Boolean ipAmdEnabled) {
     this.ipAmdEnabled = ipAmdEnabled;
  }

  public Boolean getIpTerminatingBeepDetect() {
     return this.ipTerminatingBeepDetect;
  }

  public void setIpTerminatingBeepDetect(Boolean ipTerminatingBeepDetect) {
     this.ipTerminatingBeepDetect = ipTerminatingBeepDetect;
  }

  public Float getLinesPerAgent() {
     return this.linesPerAgent;
  }

  public void setLinesPerAgent(Float linesPerAgent) {
     this.linesPerAgent = linesPerAgent;
  }

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public Integer getMaxAttempts() {
     return this.maxAttempts;
  }

  public void setMaxAttempts(Integer maxAttempts) {
     this.maxAttempts = maxAttempts;
  }

  public Float getMaximumLinesPerAgent() {
     return this.maximumLinesPerAgent;
  }

  public void setMaximumLinesPerAgent(Float maximumLinesPerAgent) {
     this.maximumLinesPerAgent = maximumLinesPerAgent;
  }

  public Integer getMinimumCallDuration() {
     return this.minimumCallDuration;
  }

  public void setMinimumCallDuration(Integer minimumCallDuration) {
     this.minimumCallDuration = minimumCallDuration;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public Integer getNoAnswerRingLimit() {
     return this.noAnswerRingLimit;
  }

  public void setNoAnswerRingLimit(Integer noAnswerRingLimit) {
     this.noAnswerRingLimit = noAnswerRingLimit;
  }

  public Boolean getPersonalizedCallbackEnabled() {
     return this.personalizedCallbackEnabled;
  }

  public void setPersonalizedCallbackEnabled(Boolean personalizedCallbackEnabled) {
     this.personalizedCallbackEnabled = personalizedCallbackEnabled;
  }

  public Integer getPredictiveCorrectionPace() {
     return this.predictiveCorrectionPace;
  }

  public void setPredictiveCorrectionPace(Integer predictiveCorrectionPace) {
     this.predictiveCorrectionPace = predictiveCorrectionPace;
  }

  public Float getPredictiveGain() {
     return this.predictiveGain;
  }

  public void setPredictiveGain(Float predictiveGain) {
     this.predictiveGain = predictiveGain;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getRescheduleCallbackMode() {
     return this.rescheduleCallbackMode;
  }

  public void setRescheduleCallbackMode(Integer rescheduleCallbackMode) {
     this.rescheduleCallbackMode = rescheduleCallbackMode;
  }

  public Integer getReservationPercentage() {
     return this.reservationPercentage;
  }

  public void setReservationPercentage(Integer reservationPercentage) {
     this.reservationPercentage = reservationPercentage;
  }

  public CampaignRetryFields getRetries() {
     return this.retries;
  }

  public void setRetries(CampaignRetryFields retries) {
     this.retries = retries;
  }

  @XmlElementWrapper(name="skillGroupInfos")
  @XmlElement(name="skillGroupInfo")
  public List<CampaignSkillGroupInfo> getSkillGroupInfos() {
     return this.skillGroupInfos;
  }

  public void setSkillGroupInfos(List<CampaignSkillGroupInfo> skillGroupInfos) {
     this.skillGroupInfos = skillGroupInfos;
  }

  @XmlElementWrapper(name="skillGroupInfosAdded")
  @XmlElement(name="skillGroupInfo")
  public List<CampaignSkillGroupInfo> getSkillGroupInfosAdded() {
     return this.skillGroupInfosAdded;
  }

  public void setSkillGroupInfosAdded(List<CampaignSkillGroupInfo> skillGroupInfosAdded) {
     this.skillGroupInfosAdded = skillGroupInfosAdded;
  }

  @XmlElementWrapper(name="skillGroupInfosRemoved")
  @XmlElement(name="skillGroupInfo")
  public List<CampaignSkillGroupInfo> getSkillGroupInfosRemoved() {
     return this.skillGroupInfosRemoved;
  }

  public void setSkillGroupInfosRemoved(List<CampaignSkillGroupInfo> skillGroupInfosRemoved) {
     this.skillGroupInfosRemoved = skillGroupInfosRemoved;
  }

  public Date getStartDate() {
     return this.startDate;
  }

  public void setStartDate(Date startDate) {
     this.startDate = startDate;
  }

  public String getStartTime() {
     return this.startTime;
  }

  public void setStartTime(String startTime) {
     this.startTime = startTime;
  }

  public TimeZoneRef getTimeZone() {
     return this.timeZone;
  }

  public void setTimeZone(TimeZoneRef timeZone) {
     this.timeZone = timeZone;
  }


  @Path("campaign")
  @XmlRootElement(name = "results")
  public static class CampaignList extends BaseApiListBean<Campaign> {
    @XmlElementWrapper(name = "campaigns")
    @XmlElement(name = "campaign")
    public List<Campaign> getItems() {
      return items;
    }

    public void setItems(List<Campaign> items) {
      this.items = items;
    }
  }
}
