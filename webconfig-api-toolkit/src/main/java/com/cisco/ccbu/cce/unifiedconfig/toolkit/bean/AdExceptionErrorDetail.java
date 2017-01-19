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
public class AdExceptionErrorDetail extends BaseApiBean {
  private int code;
  private String key;
  private String value;

  public int getCode() {
     return this.code;
  }

  public void setCode(int code) {
     this.code = code;
  }

  public String getKey() {
     return this.key;
  }

  public void setKey(String key) {
     this.key = key;
  }

  public String getValue() {
     return this.value;
  }

  public void setValue(String value) {
     this.value = value;
  }


}
