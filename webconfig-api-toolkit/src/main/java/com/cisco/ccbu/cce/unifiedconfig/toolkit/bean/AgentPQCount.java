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


@XmlRootElement(name="AgentPQCount")
public class AgentPQCount extends BaseApiBean {
  private String refURL;
  private Integer pqCount;
  private List<PQName> pqNameList;

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getpqCount() {
     return this.pqCount;
  }

  public void setpqCount(Integer pqCount) {
     this.pqCount = pqCount;
  }

  @XmlElementWrapper(name="pqNameList")
  @XmlElement(name="pqName")
  public List<PQName> getpqNameList() {
     return this.pqNameList;
  }

  public void setpqNameList(List<PQName> pqNameList) {
     this.pqNameList = pqNameList;
  }


}
