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


@XmlRootElement(name="reference")
public class ScriptReference extends BaseApiBean {
  private Boolean deleted;
  private Integer id;
  private String name;
  private List<Integer> versions;

  public Boolean getDeleted() {
     return this.deleted;
  }

  public void setDeleted(Boolean deleted) {
     this.deleted = deleted;
  }

  public Integer getId() {
     return this.id;
  }

  public void setId(Integer id) {
     this.id = id;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  @XmlElement(name="##default")
  public List<Integer> getVersions() {
     return this.versions;
  }

  public void setVersions(List<Integer> versions) {
     this.versions = versions;
  }


}
