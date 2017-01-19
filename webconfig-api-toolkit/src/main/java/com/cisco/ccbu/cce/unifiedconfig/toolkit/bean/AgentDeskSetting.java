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


@Path("agentdesksetting")
@XmlRootElement(name="agentDeskSetting")
public class AgentDeskSetting extends BaseApiBean {
  private AgentStateAfterRONAEnum agentStateAfterRONA;
  private Boolean autoAnswerEnabled;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Integer emergencyCallMethod;
  private Boolean idleReasonRequired;
  private Integer logoutNonActivityTime;
  private Boolean logoutReasonRequired;
  private String name;
  private String refURL;
  private Integer remoteAgentType;
  private Integer supervisorAssistCallMethod;
  private Integer workModeTimer;
  private Integer wrapupDataIncomingMode;
  private Integer wrapupDataOutgoingMode;

  public AgentStateAfterRONAEnum getAgentStateAfterRONA() {
     return this.agentStateAfterRONA;
  }

  public void setAgentStateAfterRONA(AgentStateAfterRONAEnum agentStateAfterRONA) {
     this.agentStateAfterRONA = agentStateAfterRONA;
  }

  public Boolean getAutoAnswerEnabled() {
     return this.autoAnswerEnabled;
  }

  public void setAutoAnswerEnabled(Boolean autoAnswerEnabled) {
     this.autoAnswerEnabled = autoAnswerEnabled;
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

  public Integer getEmergencyCallMethod() {
     return this.emergencyCallMethod;
  }

  public void setEmergencyCallMethod(Integer emergencyCallMethod) {
     this.emergencyCallMethod = emergencyCallMethod;
  }

  public Boolean getIdleReasonRequired() {
     return this.idleReasonRequired;
  }

  public void setIdleReasonRequired(Boolean idleReasonRequired) {
     this.idleReasonRequired = idleReasonRequired;
  }

  public Integer getLogoutNonActivityTime() {
     return this.logoutNonActivityTime;
  }

  public void setLogoutNonActivityTime(Integer logoutNonActivityTime) {
     this.logoutNonActivityTime = logoutNonActivityTime;
  }

  public Boolean getLogoutReasonRequired() {
     return this.logoutReasonRequired;
  }

  public void setLogoutReasonRequired(Boolean logoutReasonRequired) {
     this.logoutReasonRequired = logoutReasonRequired;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getRemoteAgentType() {
     return this.remoteAgentType;
  }

  public void setRemoteAgentType(Integer remoteAgentType) {
     this.remoteAgentType = remoteAgentType;
  }

  public Integer getSupervisorAssistCallMethod() {
     return this.supervisorAssistCallMethod;
  }

  public void setSupervisorAssistCallMethod(Integer supervisorAssistCallMethod) {
     this.supervisorAssistCallMethod = supervisorAssistCallMethod;
  }

  public Integer getWorkModeTimer() {
     return this.workModeTimer;
  }

  public void setWorkModeTimer(Integer workModeTimer) {
     this.workModeTimer = workModeTimer;
  }

  public Integer getWrapupDataIncomingMode() {
     return this.wrapupDataIncomingMode;
  }

  public void setWrapupDataIncomingMode(Integer wrapupDataIncomingMode) {
     this.wrapupDataIncomingMode = wrapupDataIncomingMode;
  }

  public Integer getWrapupDataOutgoingMode() {
     return this.wrapupDataOutgoingMode;
  }

  public void setWrapupDataOutgoingMode(Integer wrapupDataOutgoingMode) {
     this.wrapupDataOutgoingMode = wrapupDataOutgoingMode;
  }


  @Path("agentdesksetting")
  @XmlRootElement(name = "results")
  public static class AgentDeskSettingList extends BaseApiListBean<AgentDeskSetting> {
    @XmlElementWrapper(name = "agentDeskSettings")
    @XmlElement(name = "agentDeskSetting")
    public List<AgentDeskSetting> getItems() {
      return items;
    }

    public void setItems(List<AgentDeskSetting> items) {
      this.items = items;
    }
  }
}
