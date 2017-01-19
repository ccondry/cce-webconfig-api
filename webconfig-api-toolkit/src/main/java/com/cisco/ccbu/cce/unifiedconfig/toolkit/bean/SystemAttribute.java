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


@Path("systemattribute")
@XmlRootElement(name="systemAttribute")
public class SystemAttribute extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String name;
  private String refURL;
  private Object value;
  private String valueString;

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

  public Object getValue() {
     return this.value;
  }

  public void setValue(Object value) {
     this.value = value;
  }

  public String getValueString() {
     return this.valueString;
  }

  public void setValueString(String valueString) {
     this.valueString = valueString;
  }


  @Path("systemattribute")
  @XmlRootElement(name = "results")
  public static class SystemAttributeList extends BaseApiListBean<SystemAttribute> {
    @XmlElementWrapper(name = "systemAttributes")
    @XmlElement(name = "systemAttribute")
    public List<SystemAttribute> getItems() {
      return items;
    }

    public void setItems(List<SystemAttribute> items) {
      this.items = items;
    }
  }
}
