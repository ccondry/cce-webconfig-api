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


@XmlRootElement(name="pqName")
public class PQName extends BaseApiBean {
  private String enterpriseName;
  private Integer pqID;
  private String pqURL;

  public String getEnterpriseName() {
     return this.enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
     this.enterpriseName = enterpriseName;
  }

  public Integer getpqID() {
     return this.pqID;
  }

  public void setpqID(Integer pqID) {
     this.pqID = pqID;
  }

  public String getpqURL() {
     return this.pqURL;
  }

  public void setpqURL(String pqURL) {
     this.pqURL = pqURL;
  }


}
