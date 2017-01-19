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


@XmlRootElement(name="version")
public class VersionInfo extends BaseApiBean {
  private UcceVersion ucceVersion;

  @XmlElement(name="ucceVersion")
  public UcceVersion getUcceVersion() {
     return this.ucceVersion;
  }

  public void setUcceVersion(UcceVersion ucceVersion) {
     this.ucceVersion = ucceVersion;
  }


}
