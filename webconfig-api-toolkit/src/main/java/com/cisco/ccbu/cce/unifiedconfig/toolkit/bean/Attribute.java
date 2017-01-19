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


@Path("attribute")
@XmlRootElement(name="attribute")
public class Attribute extends BaseApiBean {
  private List<AttributeValueWithAgent> agentAttributes;
  private List<AttributeValueWithAgent> agentAttributesAdded;
  private List<AttributeValueWithAgent> agentAttributesRemoved;
  private Integer agentCount;
  private Integer changeStamp;
  private String correlationId;
  private Integer dataType;
  private String defaultValue;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private String name;
  private String refURL;
  private Integer selectedAgentCount;

  @XmlElementWrapper(name="agentAttributes")
  @XmlElement(name="agentAttribute")
  public List<AttributeValueWithAgent> getAgentAttributes() {
     return this.agentAttributes;
  }

  public void setAgentAttributes(List<AttributeValueWithAgent> agentAttributes) {
     this.agentAttributes = agentAttributes;
  }

  @XmlElementWrapper(name="agentAttributesAdded")
  @XmlElement(name="agentAttribute")
  public List<AttributeValueWithAgent> getAgentAttributesAdded() {
     return this.agentAttributesAdded;
  }

  public void setAgentAttributesAdded(List<AttributeValueWithAgent> agentAttributesAdded) {
     this.agentAttributesAdded = agentAttributesAdded;
  }

  @XmlElementWrapper(name="agentAttributesRemoved")
  @XmlElement(name="agentAttribute")
  public List<AttributeValueWithAgent> getAgentAttributesRemoved() {
     return this.agentAttributesRemoved;
  }

  public void setAgentAttributesRemoved(List<AttributeValueWithAgent> agentAttributesRemoved) {
     this.agentAttributesRemoved = agentAttributesRemoved;
  }

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

  public Integer getDataType() {
     return this.dataType;
  }

  public void setDataType(Integer dataType) {
     this.dataType = dataType;
  }

  public String getDefaultValue() {
     return this.defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
     this.defaultValue = defaultValue;
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


  @Path("attribute")
  @XmlRootElement(name = "results")
  public static class AttributeList extends BaseApiListBean<Attribute> {
    @XmlElementWrapper(name = "attributes")
    @XmlElement(name = "attribute")
    public List<Attribute> getItems() {
      return items;
    }

    public void setItems(List<Attribute> items) {
      this.items = items;
    }
  }
}
