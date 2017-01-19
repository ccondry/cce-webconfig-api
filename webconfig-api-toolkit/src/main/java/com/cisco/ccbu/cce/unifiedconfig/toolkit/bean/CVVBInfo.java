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


@XmlRootElement(name="vvbInfo")
public class CVVBInfo extends BaseApiBean {
  private String status;
  private String version;

  @XmlElement(name="vvbStatus")
  public String getStatus() {
     return this.status;
  }

  public void setStatus(String status) {
     this.status = status;
  }

  @XmlElement(name="vvbVersion")
  public String getVersion() {
     return this.version;
  }

  public void setVersion(String version) {
     this.version = version;
  }


}
