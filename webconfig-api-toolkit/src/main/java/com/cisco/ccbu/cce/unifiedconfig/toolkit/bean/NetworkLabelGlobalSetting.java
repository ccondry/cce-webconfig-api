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


public class NetworkLabelGlobalSetting extends BaseApiBean {
  private String cMLabel;
  private List<CVPLabel> cVPLabels;
  private String outboundLabel;

  @XmlElement(name="cmLabel")
  public String getCMLabel() {
     return this.cMLabel;
  }

  public void setCMLabel(String cMLabel) {
     this.cMLabel = cMLabel;
  }

  @XmlElementWrapper(name="cvpLabels")
  @XmlElement(name="cvpLabel")
  public List<CVPLabel> getCVPLabels() {
     return this.cVPLabels;
  }

  public void setCVPLabels(List<CVPLabel> cVPLabels) {
     this.cVPLabels = cVPLabels;
  }

  @XmlElement(name="outboundLabel")
  public String getOutboundLabel() {
     return this.outboundLabel;
  }

  public void setOutboundLabel(String outboundLabel) {
     this.outboundLabel = outboundLabel;
  }


}
