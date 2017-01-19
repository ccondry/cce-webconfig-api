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
@XmlRootElement(name="masterScript")
public class MasterScript extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private Integer currentVersion;
  private ReferenceBean department;
  private String description;
  private String name;
  private String refURL;
  private ScriptVersion script;
  private Integer scriptType;
  private List<ReferenceBean> scriptVersions;

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

  public Integer getCurrentVersion() {
     return this.currentVersion;
  }

  public void setCurrentVersion(Integer currentVersion) {
     this.currentVersion = currentVersion;
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

  public ScriptVersion getScript() {
     return this.script;
  }

  public void setScript(ScriptVersion script) {
     this.script = script;
  }

  public Integer getScriptType() {
     return this.scriptType;
  }

  public void setScriptType(Integer scriptType) {
     this.scriptType = scriptType;
  }

  @XmlElementWrapper(name="##default")
  @XmlElement(name="scriptVersion")
  public List<ReferenceBean> getScriptVersions() {
     return this.scriptVersions;
  }

  public void setScriptVersions(List<ReferenceBean> scriptVersions) {
     this.scriptVersions = scriptVersions;
  }


  @Path("masterscript")
  @XmlRootElement(name = "results")
  public static class MasterScriptList extends BaseApiListBean<MasterScript> {
    @XmlElementWrapper(name = "masterScripts")
    @XmlElement(name = "masterScript")
    public List<MasterScript> getItems() {
      return items;
    }

    public void setItems(List<MasterScript> items) {
      this.items = items;
    }
  }
}
