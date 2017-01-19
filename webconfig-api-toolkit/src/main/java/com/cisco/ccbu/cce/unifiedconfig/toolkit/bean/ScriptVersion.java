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


@Path("masterscript")
@XmlRootElement(name="scriptVersion")
public class ScriptVersion extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private Date dateTime;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private String refURL;
  private List<ScriptCrossReference> references;
  private Integer version;

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

  public Date getDateTime() {
     return this.dateTime;
  }

  public void setDateTime(Date dateTime) {
     this.dateTime = dateTime;
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

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElementWrapper(name="##default")
  @XmlElement(name="reference")
  public List<ScriptCrossReference> getReferences() {
     return this.references;
  }

  public void setReferences(List<ScriptCrossReference> references) {
     this.references = references;
  }

  public Integer getVersion() {
     return this.version;
  }

  public void setVersion(Integer version) {
     this.version = version;
  }


  @Path("masterscript")
  @XmlRootElement(name = "results")
  public static class ScriptVersionList extends BaseApiListBean<ScriptVersion> {
    @XmlElementWrapper(name = "scriptVersions")
    @XmlElement(name = "scriptVersion")
    public List<ScriptVersion> getItems() {
      return items;
    }

    public void setItems(List<ScriptVersion> items) {
      this.items = items;
    }
  }
}
