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


@Path("enterpriseroute")
@XmlRootElement(name="enterpriseSkillGroup")
public class EnterpriseSkillGroup extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private int entityID;
  private String name;
  private String refURL;

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

  public int getEntityID() {
     return this.entityID;
  }

  public void setEntityID(int entityID) {
     this.entityID = entityID;
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


  @Path("enterpriseroute")
  @XmlRootElement(name = "results")
  public static class EnterpriseSkillGroupList extends BaseApiListBean<EnterpriseSkillGroup> {
    @XmlElementWrapper(name = "enterpriseSkillGroups")
    @XmlElement(name = "enterpriseSkillGroup")
    public List<EnterpriseSkillGroup> getItems() {
      return items;
    }

    public void setItems(List<EnterpriseSkillGroup> items) {
      this.items = items;
    }
  }
}
