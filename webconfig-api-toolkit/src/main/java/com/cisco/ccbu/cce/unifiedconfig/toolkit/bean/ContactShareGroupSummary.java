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


@Path("contactsharegroup")
@XmlRootElement(name="contactShareGroupSummary")
public class ContactShareGroupSummary extends BaseApiBean {
  private String acceptQueueIf;
  private Integer changeStamp;
  private ReferenceBean contactShareRule;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private String name;
  private Integer queueCount;
  private String refURL;

  public String getAcceptQueueIf() {
     return this.acceptQueueIf;
  }

  public void setAcceptQueueIf(String acceptQueueIf) {
     this.acceptQueueIf = acceptQueueIf;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public ReferenceBean getContactShareRule() {
     return this.contactShareRule;
  }

  public void setContactShareRule(ReferenceBean contactShareRule) {
     this.contactShareRule = contactShareRule;
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

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public Integer getQueueCount() {
     return this.queueCount;
  }

  public void setQueueCount(Integer queueCount) {
     this.queueCount = queueCount;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("contactsharegroup")
  @XmlRootElement(name = "results")
  public static class ContactShareGroupSummaryList extends BaseApiListBean<ContactShareGroupSummary> {
    @XmlElementWrapper(name = "contactShareGroupSummarys")
    @XmlElement(name = "contactShareGroupSummary")
    public List<ContactShareGroupSummary> getItems() {
      return items;
    }

    public void setItems(List<ContactShareGroupSummary> items) {
      this.items = items;
    }
  }
}
