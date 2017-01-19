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


public class Term extends BaseApiBean {
  private ReferenceBean attribute;
  private Integer attributeRelation;
  private Integer parenCount;
  private String refURL;
  private Integer termRelation;
  private String value1;

  public ReferenceBean getAttribute() {
     return this.attribute;
  }

  public void setAttribute(ReferenceBean attribute) {
     this.attribute = attribute;
  }

  public Integer getAttributeRelation() {
     return this.attributeRelation;
  }

  public void setAttributeRelation(Integer attributeRelation) {
     this.attributeRelation = attributeRelation;
  }

  public Integer getParenCount() {
     return this.parenCount;
  }

  public void setParenCount(Integer parenCount) {
     this.parenCount = parenCount;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getTermRelation() {
     return this.termRelation;
  }

  public void setTermRelation(Integer termRelation) {
     this.termRelation = termRelation;
  }

  public String getValue1() {
     return this.value1;
  }

  public void setValue1(String value1) {
     this.value1 = value1;
  }


}
