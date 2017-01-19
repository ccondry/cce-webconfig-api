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


@Path("role")
@XmlRootElement(name="role")
public class Role extends BaseApiBean {
  private List<ReferenceBean> administrators;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private List<Feature> features;
  private String name;
  private String refURL;
  private Boolean systemDefined;

  @XmlElementWrapper(name="administrators")
  @XmlElement(name="administrator")
  public List<ReferenceBean> getAdministrators() {
     return this.administrators;
  }

  public void setAdministrators(List<ReferenceBean> administrators) {
     this.administrators = administrators;
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

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  @XmlElementWrapper(name="accessList")
  @XmlElement(name="feature")
  public List<Feature> getFeatures() {
     return this.features;
  }

  public void setFeatures(List<Feature> features) {
     this.features = features;
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

  public Boolean getSystemDefined() {
     return this.systemDefined;
  }

  public void setSystemDefined(Boolean systemDefined) {
     this.systemDefined = systemDefined;
  }


  @Path("role")
  @XmlRootElement(name = "results")
  public static class RoleList extends BaseApiListBean<Role> {
    @XmlElementWrapper(name = "roles")
    @XmlElement(name = "role")
    public List<Role> getItems() {
      return items;
    }

    public void setItems(List<Role> items) {
      this.items = items;
    }
  }
}
