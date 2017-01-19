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


@Path("peripheralgateway")
@XmlRootElement(name="routingClient")
public class RoutingClient extends BaseApiBean {
  private Integer changeStamp;
  private Short clientType;
  private String correlationId;
  private ReferenceBean department;
  private Short lateThreshold;
  private Integer logicalControllerId;
  private Boolean markDeletable;
  private String name;
  private Integer peripheralId;
  private String refURL;
  private Short timeoutLimit;
  private Short timeoutThreshold;

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

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public Short getLateThreshold() {
     return this.lateThreshold;
  }

  public void setLateThreshold(Short lateThreshold) {
     this.lateThreshold = lateThreshold;
  }

  public Integer getLogicalControllerId() {
     return this.logicalControllerId;
  }

  public void setLogicalControllerId(Integer logicalControllerId) {
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

  public Integer getPeripheralId() {
     return this.peripheralId;
  }

  public void setPeripheralId(Integer peripheralId) {
     this.peripheralId = peripheralId;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Short getTimeoutLimit() {
     return this.timeoutLimit;
  }

  public void setTimeoutLimit(Short timeoutLimit) {
     this.timeoutLimit = timeoutLimit;
  }

  public Short getTimeoutThreshold() {
     return this.timeoutThreshold;
  }

  public void setTimeoutThreshold(Short timeoutThreshold) {
     this.timeoutThreshold = timeoutThreshold;
  }


  @Path("peripheralgateway")
  @XmlRootElement(name = "results")
  public static class RoutingClientList extends BaseApiListBean<RoutingClient> {
    @XmlElementWrapper(name = "routingClients")
    @XmlElement(name = "routingClient")
    public List<RoutingClient> getItems() {
      return items;
    }

    public void setItems(List<RoutingClient> items) {
      this.items = items;
    }
  }
}
