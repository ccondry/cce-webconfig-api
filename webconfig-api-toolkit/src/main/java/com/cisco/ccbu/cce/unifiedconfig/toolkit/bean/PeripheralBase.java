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


@Path("deploymenttypeinfo")
@XmlSeeAlso({PeripheralWithRoutingClient.class})
public class PeripheralBase extends BaseApiBean {
  private Integer changeStamp;
  private Short clientType;
  private String correlationId;
  private ReferenceBean defaultDeskSetting;
  private ReferenceBean department;
  private String hostName1;
  private String hostName2;
  private Integer hostPort1;
  private Integer hostPort2;
  private Short logicalControllerId;
  private Boolean markDeletable;
  private String name;
  private Integer networkTargetID;
  private String peripheralName;
  private String refURL;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public Short getClientType() {
     return this.clientType;
  }

  public void setClientType(Short clientType) {
     this.clientType = clientType;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  public ReferenceBean getDefaultDeskSetting() {
     return this.defaultDeskSetting;
  }

  public void setDefaultDeskSetting(ReferenceBean defaultDeskSetting) {
     this.defaultDeskSetting = defaultDeskSetting;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getHostName1() {
     return this.hostName1;
  }

  public void setHostName1(String hostName1) {
     this.hostName1 = hostName1;
  }

  public String getHostName2() {
     return this.hostName2;
  }

  public void setHostName2(String hostName2) {
     this.hostName2 = hostName2;
  }

  public Integer getHostPort1() {
     return this.hostPort1;
  }

  public void setHostPort1(Integer hostPort1) {
     this.hostPort1 = hostPort1;
  }

  public Integer getHostPort2() {
     return this.hostPort2;
  }

  public void setHostPort2(Integer hostPort2) {
     this.hostPort2 = hostPort2;
  }

  public Short getLogicalControllerId() {
     return this.logicalControllerId;
  }

  public void setLogicalControllerId(Short logicalControllerId) {
     this.logicalControllerId = logicalControllerId;
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

  public Integer getNetworkTargetID() {
     return this.networkTargetID;
  }

  public void setNetworkTargetID(Integer networkTargetID) {
     this.networkTargetID = networkTargetID;
  }

  public String getPeripheralName() {
     return this.peripheralName;
  }

  public void setPeripheralName(String peripheralName) {
     this.peripheralName = peripheralName;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


}
