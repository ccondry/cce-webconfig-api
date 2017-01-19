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


@Path("skillgroup")
@XmlRootElement(name="skillGroupSummary")
public class SkillGroupSummary extends BaseApiBean {
  private Integer agentCount;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private String name;
  private PeripheralRef peripheral;
  private Integer peripheralNumber;
  private String refURL;
  private Integer selectedAgentCount;

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

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public PeripheralRef getPeripheral() {
     return this.peripheral;
  }

  public void setPeripheral(PeripheralRef peripheral) {
     this.peripheral = peripheral;
  }

  public Integer getPeripheralNumber() {
     return this.peripheralNumber;
  }

  public void setPeripheralNumber(Integer peripheralNumber) {
     this.peripheralNumber = peripheralNumber;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getSelectedAgentCount() {
     return this.selectedAgentCount;
  }

  public void setSelectedAgentCount(Integer selectedAgentCount) {
     this.selectedAgentCount = selectedAgentCount;
  }


  @Path("skillgroup")
  @XmlRootElement(name = "results")
  public static class SkillGroupSummaryList extends BaseApiListBean<SkillGroupSummary> {
    @XmlElementWrapper(name = "skillGroupSummarys")
    @XmlElement(name = "skillGroupSummary")
    public List<SkillGroupSummary> getItems() {
      return items;
    }

    public void setItems(List<SkillGroupSummary> items) {
      this.items = items;
    }
  }
}
