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


@Path("agentdistribution")
@XmlRootElement(name="agentDistribution")
public class AgentDistribution extends BaseApiBean {
  private Boolean agentHistoricalData;
  private Boolean agentRealTimeData;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String name;
  private Short peripheralId;
  private String refURL;

  public Boolean getAgentHistoricalData() {
     return this.agentHistoricalData;
  }

  public void setAgentHistoricalData(Boolean agentHistoricalData) {
     this.agentHistoricalData = agentHistoricalData;
  }

  public Boolean getAgentRealTimeData() {
     return this.agentRealTimeData;
  }

  public void setAgentRealTimeData(Boolean agentRealTimeData) {
     this.agentRealTimeData = agentRealTimeData;
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


  @Path("agentdistribution")
  @XmlRootElement(name = "results")
  public static class AgentDistributionList extends BaseApiListBean<AgentDistribution> {
    @XmlElementWrapper(name = "agentDistributions")
    @XmlElement(name = "agentDistribution")
    public List<AgentDistribution> getItems() {
      return items;
    }

    public void setItems(List<AgentDistribution> items) {
      this.items = items;
    }
  }
}
