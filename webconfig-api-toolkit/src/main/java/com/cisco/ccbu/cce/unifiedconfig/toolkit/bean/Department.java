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


@Path("/department")
@XmlRootElement(name="department")
public class Department extends BaseApiBean {
  private List<ReferenceBean> administrators;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private String name;
  private String refURL;

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

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("/department")
  @XmlRootElement(name = "results")
  public static class DepartmentList extends BaseApiListBean<Department> {
    @XmlElementWrapper(name = "departments")
    @XmlElement(name = "department")
    public List<Department> getItems() {
      return items;
    }

    public void setItems(List<Department> items) {
      this.items = items;
    }
  }
}
