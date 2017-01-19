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


@Path("configurationlimit")
@XmlRootElement(name="configurationLimit")
public class ConfigurationLimit extends BaseApiBean {
  private Integer changeStamp;
  private Integer configLimitCurrentValue;
  private Integer configLimitDefaultValue;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private String name;
  private String refURL;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public Integer getConfigLimitCurrentValue() {
     return this.configLimitCurrentValue;
  }

  public void setConfigLimitCurrentValue(Integer configLimitCurrentValue) {
     this.configLimitCurrentValue = configLimitCurrentValue;
  }

  public Integer getConfigLimitDefaultValue() {
     return this.configLimitDefaultValue;
  }

  public void setConfigLimitDefaultValue(Integer configLimitDefaultValue) {
     this.configLimitDefaultValue = configLimitDefaultValue;
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


  @Path("configurationlimit")
  @XmlRootElement(name = "results")
  public static class ConfigurationLimitList extends BaseApiListBean<ConfigurationLimit> {
    @XmlElementWrapper(name = "configurationLimits")
    @XmlElement(name = "configurationLimit")
    public List<ConfigurationLimit> getItems() {
      return items;
    }

    public void setItems(List<ConfigurationLimit> items) {
      this.items = items;
    }
  }
}
