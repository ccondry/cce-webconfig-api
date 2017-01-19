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


public class TraceMachine extends BaseApiBean {
  private String refURL;
  private List<TraceProcess> traceProcesses;

  @XmlElement(name="refURL")
  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElementWrapper(name="traceProcesses")
  @XmlElement(name="traceProcess")
  public List<TraceProcess> getTraceProcesses() {
     return this.traceProcesses;
  }

  public void setTraceProcesses(List<TraceProcess> traceProcesses) {
     this.traceProcesses = traceProcesses;
  }


}
