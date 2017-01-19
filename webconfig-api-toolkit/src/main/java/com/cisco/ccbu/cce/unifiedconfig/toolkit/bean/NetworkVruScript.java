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


@Path("networkvruscript")
@XmlRootElement(name="networkVruScript")
public class NetworkVruScript extends BaseApiBean {
  private Integer changeStamp;
  private String configParam;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean interruptible;
  private String name;
  private String refURL;
  private Integer routingType;
  private Integer timeout;
  private String vruScriptName;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getConfigParam() {
     return this.configParam;
  }

  public void setConfigParam(String configParam) {
     this.configParam = configParam;
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

  public Boolean getInterruptible() {
     return this.interruptible;
  }

  public void setInterruptible(Boolean interruptible) {
     this.interruptible = interruptible;
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

  public Integer getRoutingType() {
     return this.routingType;
  }

  public void setRoutingType(Integer routingType) {
     this.routingType = routingType;
  }

  public Integer getTimeout() {
     return this.timeout;
  }

  public void setTimeout(Integer timeout) {
     this.timeout = timeout;
  }

  public String getVruScriptName() {
     return this.vruScriptName;
  }

  public void setVruScriptName(String vruScriptName) {
     this.vruScriptName = vruScriptName;
  }


  @Path("networkvruscript")
  @XmlRootElement(name = "results")
  public static class NetworkVruScriptList extends BaseApiListBean<NetworkVruScript> {
    @XmlElementWrapper(name = "networkVruScripts")
    @XmlElement(name = "networkVruScript")
    public List<NetworkVruScript> getItems() {
      return items;
    }

    public void setItems(List<NetworkVruScript> items) {
      this.items = items;
    }
  }
}
