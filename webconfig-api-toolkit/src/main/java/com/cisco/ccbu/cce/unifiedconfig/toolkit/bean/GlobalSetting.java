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


@Path("globalsetting")
@XmlRootElement(name="globalSettings")
public class GlobalSetting extends BaseApiBean {
  private AgentGlobalSetting agent;
  private CallGlobalSetting callReporting;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private NetworkLabelGlobalSetting labels;
  private PermissionInfo permissionInfo;
  private String refURL;
  private ReportingGlobalSetting reporting;
  private ScriptGlobalSetting script;

  public AgentGlobalSetting getAgent() {
     return this.agent;
  }

  public void setAgent(AgentGlobalSetting agent) {
     this.agent = agent;
  }

  public CallGlobalSetting getCallReporting() {
     return this.callReporting;
  }

  public void setCallReporting(CallGlobalSetting callReporting) {
     this.callReporting = callReporting;
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

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public NetworkLabelGlobalSetting getLabels() {
     return this.labels;
  }

  public void setLabels(NetworkLabelGlobalSetting labels) {
     this.labels = labels;
  }

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public ReportingGlobalSetting getReporting() {
     return this.reporting;
  }

  public void setReporting(ReportingGlobalSetting reporting) {
     this.reporting = reporting;
  }

  public ScriptGlobalSetting getScript() {
     return this.script;
  }

  public void setScript(ScriptGlobalSetting script) {
     this.script = script;
  }


  @Path("globalsetting")
  @XmlRootElement(name = "results")
  public static class GlobalSettingList extends BaseApiListBean<GlobalSetting> {
    @XmlElementWrapper(name = "globalSettingss")
    @XmlElement(name = "globalSettings")
    public List<GlobalSetting> getItems() {
      return items;
    }

    public void setItems(List<GlobalSetting> items) {
      this.items = items;
    }
  }
}
