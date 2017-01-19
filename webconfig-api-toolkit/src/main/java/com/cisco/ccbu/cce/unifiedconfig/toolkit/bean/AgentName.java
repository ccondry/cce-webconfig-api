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


@XmlRootElement(name="agentName")
public class AgentName extends BaseApiBean {
  private Integer agentId;
  private String agentURL;
  private String enterpriseName;

  public Integer getAgentId() {
     return this.agentId;
  }

  public void setAgentId(Integer agentId) {
     this.agentId = agentId;
  }

  public String getAgentURL() {
     return this.agentURL;
  }

  public void setAgentURL(String agentURL) {
     this.agentURL = agentURL;
  }

  public String getEnterpriseName() {
     return this.enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
     this.enterpriseName = enterpriseName;
  }


}
