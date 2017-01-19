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


public class Operation extends BaseApiBean {
  private ChangeSet changeSet;
  private OperationType operationType;
  private List<String> refUrls;

  public ChangeSet getChangeSet() {
     return this.changeSet;
  }

  public void setChangeSet(ChangeSet changeSet) {
     this.changeSet = changeSet;
  }

  public OperationType getOperationType() {
     return this.operationType;
  }

  public void setOperationType(OperationType operationType) {
     this.operationType = operationType;
  }

  @XmlElementWrapper(name="refURLs")
  @XmlElement(name="refURL")
  public List<String> getRefUrls() {
     return this.refUrls;
  }

  public void setRefUrls(List<String> refUrls) {
     this.refUrls = refUrls;
  }


}
