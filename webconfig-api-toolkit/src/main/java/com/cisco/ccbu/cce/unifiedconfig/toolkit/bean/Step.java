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


@Path("precisionqueue")
@XmlRootElement(name="step")
public class Step extends BaseApiBean {
  private Integer agentCount;
  private String considerIf;
  private String description;
  private String refURL;
  private List<Term> terms;
  private Integer waitTime;

  public Integer getAgentCount() {
     return this.agentCount;
  }

  public void setAgentCount(Integer agentCount) {
     this.agentCount = agentCount;
  }

  public String getConsiderIf() {
     return this.considerIf;
  }

  public void setConsiderIf(String considerIf) {
     this.considerIf = considerIf;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElementWrapper(name="terms")
  @XmlElement(name="term")
  public List<Term> getTerms() {
     return this.terms;
  }

  public void setTerms(List<Term> terms) {
     this.terms = terms;
  }

  public Integer getWaitTime() {
     return this.waitTime;
  }

  public void setWaitTime(Integer waitTime) {
     this.waitTime = waitTime;
  }


  @Path("precisionqueue")
  @XmlRootElement(name = "results")
  public static class StepList extends BaseApiListBean<Step> {
    @XmlElementWrapper(name = "steps")
    @XmlElement(name = "step")
    public List<Step> getItems() {
      return items;
    }

    public void setItems(List<Step> items) {
      this.items = items;
    }
  }
}
