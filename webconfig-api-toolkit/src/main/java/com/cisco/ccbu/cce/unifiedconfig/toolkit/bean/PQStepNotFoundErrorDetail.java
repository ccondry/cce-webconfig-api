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


@XmlRootElement(name="errorDetail")
public class PQStepNotFoundErrorDetail extends BaseApiBean {
  private String pqName;
  private Integer step;

  public String getPqName() {
     return this.pqName;
  }

  public void setPqName(String pqName) {
     this.pqName = pqName;
  }

  public Integer getStep() {
     return this.step;
  }

  public void setStep(Integer step) {
     this.step = step;
  }


}
