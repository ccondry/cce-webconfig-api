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


@Path("contactsharerule")
@XmlRootElement(name="contactShareRule")
public class ContactShareRule extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private String name;
  private String refURL;
  private String ruleExpression;

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

  public String getRuleExpression() {
     return this.ruleExpression;
  }

  public void setRuleExpression(String ruleExpression) {
     this.ruleExpression = ruleExpression;
  }


  @Path("contactsharerule")
  @XmlRootElement(name = "results")
  public static class ContactShareRuleList extends BaseApiListBean<ContactShareRule> {
    @XmlElementWrapper(name = "contactShareRules")
    @XmlElement(name = "contactShareRule")
    public List<ContactShareRule> getItems() {
      return items;
    }

    public void setItems(List<ContactShareRule> items) {
      this.items = items;
    }
  }
}
