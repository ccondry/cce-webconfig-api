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


@Path("contextservice")
@XmlRootElement(name="contextServiceConfig")
public class ContextServiceConfig extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private Boolean labMode;
  private Integer maxRetries;
  private PermissionInfo permissionInfo;
  private String proxyUrl;
  private String refURL;
  private Integer timeout;

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

  public Boolean getLabMode() {
     return this.labMode;
  }

  public void setLabMode(Boolean labMode) {
     this.labMode = labMode;
  }

  public Integer getMaxRetries() {
     return this.maxRetries;
  }

  public void setMaxRetries(Integer maxRetries) {
     this.maxRetries = maxRetries;
  }

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }

  public String getProxyUrl() {
     return this.proxyUrl;
  }

  public void setProxyUrl(String proxyUrl) {
     this.proxyUrl = proxyUrl;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getTimeout() {
     return this.timeout;
  }

  public void setTimeout(Integer timeout) {
     this.timeout = timeout;
  }


  @Path("contextservice")
  @XmlRootElement(name = "results")
  public static class ContextServiceConfigList extends BaseApiListBean<ContextServiceConfig> {
    @XmlElementWrapper(name = "contextServiceConfigs")
    @XmlElement(name = "contextServiceConfig")
    public List<ContextServiceConfig> getItems() {
      return items;
    }

    public void setItems(List<ContextServiceConfig> items) {
      this.items = items;
    }
  }
}
