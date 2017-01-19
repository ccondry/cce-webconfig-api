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
@XmlRootElement(name="peripheralGateway")
public class PeripheralGateway extends BaseApiBean {
  private Integer changeStamp;
  private Short clientType;
  private String correlationId;
  private ReferenceBean department;
  private Integer logicalControllerId;
  private Short logicalControllerType;
  private Boolean markDeletable;
  private String name;
  private List<PeripheralWithRoutingClient> peripherals;
  private String primaryCtiAddress;
  private String refURL;
  private String secondaryCtiAddress;

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

  public Integer getLogicalControllerId() {
     return this.logicalControllerId;
  }

  public void setLogicalControllerId(Integer logicalControllerId) {
     this.logicalControllerId = logicalControllerId;
  }

  public Short getLogicalControllerType() {
     return this.logicalControllerType;
  }

  public void setLogicalControllerType(Short logicalControllerType) {
     this.logicalControllerType = logicalControllerType;
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

  @XmlElementWrapper(name="peripherals")
  @XmlElement(name="peripheral")
  public List<PeripheralWithRoutingClient> getPeripherals() {
     return this.peripherals;
  }

  public void setPeripherals(List<PeripheralWithRoutingClient> peripherals) {
     this.peripherals = peripherals;
  }

  public String getPrimaryCtiAddress() {
     return this.primaryCtiAddress;
  }

  public void setPrimaryCtiAddress(String primaryCtiAddress) {
     this.primaryCtiAddress = primaryCtiAddress;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public String getSecondaryCtiAddress() {
     return this.secondaryCtiAddress;
  }

  public void setSecondaryCtiAddress(String secondaryCtiAddress) {
     this.secondaryCtiAddress = secondaryCtiAddress;
  }


  @Path("peripheralgateway")
  @XmlRootElement(name = "results")
  public static class PeripheralGatewayList extends BaseApiListBean<PeripheralGateway> {
    @XmlElementWrapper(name = "peripheralGateways")
    @XmlElement(name = "peripheralGateway")
    public List<PeripheralGateway> getItems() {
      return items;
    }

    public void setItems(List<PeripheralGateway> items) {
      this.items = items;
    }
  }
}
