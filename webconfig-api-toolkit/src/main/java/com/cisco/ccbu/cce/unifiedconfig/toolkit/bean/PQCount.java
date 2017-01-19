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


@XmlRootElement(name="PQAgentCount")
public class PQCount extends BaseApiBean {
  private Integer agentCount;
  private List<AgentName> agentNameList;
  private String refURL;

  public Integer getAgentCount() {
     return this.agentCount;
  }

  public void setAgentCount(Integer agentCount) {
     this.agentCount = agentCount;
  }

  @XmlElementWrapper(name="agentNameList")
  @XmlElement(name="agentName")
  public List<AgentName> getAgentNameList() {
     return this.agentNameList;
  }

  public void setAgentNameList(List<AgentName> agentNameList) {
     this.agentNameList = agentNameList;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


}
