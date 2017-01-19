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


@XmlRootElement(name="MRconfig")
public class MRConfig extends BaseApiBean {
  private boolean enabled;
  private String hostA;
  private String hostB;
  private int port;

  public boolean getEnabled() {
     return this.enabled;
  }

  public void setEnabled(boolean enabled) {
     this.enabled = enabled;
  }

  public String getHostA() {
     return this.hostA;
  }

  public void setHostA(String hostA) {
     this.hostA = hostA;
  }

  public String getHostB() {
     return this.hostB;
  }

  public void setHostB(String hostB) {
     this.hostB = hostB;
  }

  public int getPort() {
     return this.port;
  }

  public void setPort(int port) {
     this.port = port;
  }


}
