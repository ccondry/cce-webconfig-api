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


@Path("/agentteam")
@XmlSeeAlso({AgentTeamSummary.class, AgentTeam.class})
public class AgentTeamBase extends BaseApiBean {
  private Integer agentCount;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private ReferenceBean dialedNumber;
  private String name;
  private Short peripheralId;
  private String refURL;
  private Integer supervisorCount;

  public Integer getAgentCount() {
     return this.agentCount;
  }

  public void setAgentCount(Integer agentCount) {
     this.agentCount = agentCount;
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

  public ReferenceBean getDialedNumber() {
     return this.dialedNumber;
  }

  public void setDialedNumber(ReferenceBean dialedNumber) {
     this.dialedNumber = dialedNumber;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public Short getPeripheralId() {
     return this.peripheralId;
  }

  public void setPeripheralId(Short peripheralId) {
     this.peripheralId = peripheralId;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getSupervisorCount() {
     return this.supervisorCount;
  }

  public void setSupervisorCount(Integer supervisorCount) {
     this.supervisorCount = supervisorCount;
  }


}
