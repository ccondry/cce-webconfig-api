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


@Path("expandedcallvariable")
@XmlRootElement(name="expandedCallVariable")
public class ExpandedCallVariable extends BaseApiBean {
  private Integer bytesRequired;
  private Integer bytesRequiredInCtiServer;
  private Integer changeStamp;
  private Boolean ciscoProvided;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean eccArray;
  private Boolean enabled;
  private Boolean markDeletable;
  private Integer maximumArraySize;
  private Integer maximumLength;
  private String name;
  private Boolean persistent;
  private String refURL;

  public Integer getBytesRequired() {
     return this.bytesRequired;
  }

  public void setBytesRequired(Integer bytesRequired) {
     this.bytesRequired = bytesRequired;
  }

  public Integer getBytesRequiredInCtiServer() {
     return this.bytesRequiredInCtiServer;
  }

  public void setBytesRequiredInCtiServer(Integer bytesRequiredInCtiServer) {
     this.bytesRequiredInCtiServer = bytesRequiredInCtiServer;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public Boolean getCiscoProvided() {
     return this.ciscoProvided;
  }

  public void setCiscoProvided(Boolean ciscoProvided) {
     this.ciscoProvided = ciscoProvided;
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

  public Boolean getEccArray() {
     return this.eccArray;
  }

  public void setEccArray(Boolean eccArray) {
     this.eccArray = eccArray;
  }

  public Boolean getEnabled() {
     return this.enabled;
  }

  public void setEnabled(Boolean enabled) {
     this.enabled = enabled;
  }

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public Integer getMaximumArraySize() {
     return this.maximumArraySize;
  }

  public void setMaximumArraySize(Integer maximumArraySize) {
     this.maximumArraySize = maximumArraySize;
  }

  public Integer getMaximumLength() {
     return this.maximumLength;
  }

  public void setMaximumLength(Integer maximumLength) {
     this.maximumLength = maximumLength;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public Boolean getPersistent() {
     return this.persistent;
  }

  public void setPersistent(Boolean persistent) {
     this.persistent = persistent;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("expandedcallvariable")
  @XmlRootElement(name = "results")
  public static class ExpandedCallVariableList extends BaseApiListBean<ExpandedCallVariable> {
    @XmlElementWrapper(name = "expandedCallVariables")
    @XmlElement(name = "expandedCallVariable")
    public List<ExpandedCallVariable> getItems() {
      return items;
    }

    public void setItems(List<ExpandedCallVariable> items) {
      this.items = items;
    }
  }
}
