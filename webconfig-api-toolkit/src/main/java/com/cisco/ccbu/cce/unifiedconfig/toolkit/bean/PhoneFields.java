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


public class PhoneFields extends BaseApiBean {
  private int callResult;
  private boolean dstObserved;
  private int gmtOffset;
  private String number;

  public int getCallResult() {
     return this.callResult;
  }

  public void setCallResult(int callResult) {
     this.callResult = callResult;
  }

  public boolean getDstObserved() {
     return this.dstObserved;
  }

  public void setDstObserved(boolean dstObserved) {
     this.dstObserved = dstObserved;
  }

  public int getGmtOffset() {
     return this.gmtOffset;
  }

  public void setGmtOffset(int gmtOffset) {
     this.gmtOffset = gmtOffset;
  }

  public String getNumber() {
     return this.number;
  }

  public void setNumber(String number) {
     this.number = number;
  }


}
