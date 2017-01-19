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


@XmlRootElement(name="peripheralGateway")
public class WebsetupPG extends BaseApiBean {
  private String logicalId;
  private String pgId;
  private List<WebsetupPim> pims;
  private String routerSideAPublicAddress;
  private String routerSideBPublicAddress;
  private String side;
  private String sideAPrivateAddress;
  private String sideAPublicAddress;
  private String sideBPrivateAddress;
  private String sideBPublicAddress;

  public String getLogicalId() {
     return this.logicalId;
  }

  public void setLogicalId(String logicalId) {
     this.logicalId = logicalId;
  }

  public String getPgId() {
     return this.pgId;
  }

  public void setPgId(String pgId) {
     this.pgId = pgId;
  }

  @XmlElementWrapper(name="pims")
  @XmlElement(name="pim")
  public List<WebsetupPim> getPims() {
     return this.pims;
  }

  public void setPims(List<WebsetupPim> pims) {
     this.pims = pims;
  }

  public String getRouterSideAPublicAddress() {
     return this.routerSideAPublicAddress;
  }

  public void setRouterSideAPublicAddress(String routerSideAPublicAddress) {
     this.routerSideAPublicAddress = routerSideAPublicAddress;
  }

  public String getRouterSideBPublicAddress() {
     return this.routerSideBPublicAddress;
  }

  public void setRouterSideBPublicAddress(String routerSideBPublicAddress) {
     this.routerSideBPublicAddress = routerSideBPublicAddress;
  }

  public String getSide() {
     return this.side;
  }

  public void setSide(String side) {
     this.side = side;
  }

  public String getSideAPrivateAddress() {
     return this.sideAPrivateAddress;
  }

  public void setSideAPrivateAddress(String sideAPrivateAddress) {
     this.sideAPrivateAddress = sideAPrivateAddress;
  }

  public String getSideAPublicAddress() {
     return this.sideAPublicAddress;
  }

  public void setSideAPublicAddress(String sideAPublicAddress) {
     this.sideAPublicAddress = sideAPublicAddress;
  }

  public String getSideBPrivateAddress() {
     return this.sideBPrivateAddress;
  }

  public void setSideBPrivateAddress(String sideBPrivateAddress) {
     this.sideBPrivateAddress = sideBPrivateAddress;
  }

  public String getSideBPublicAddress() {
     return this.sideBPublicAddress;
  }

  public void setSideBPublicAddress(String sideBPublicAddress) {
     this.sideBPublicAddress = sideBPublicAddress;
  }


}
