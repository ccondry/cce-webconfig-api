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


public class AttributeValueWithAttribute extends BaseApiBean {
  private ReferenceBean attribute;
  private String attributeValue;
  private String description;

  public ReferenceBean getAttribute() {
     return this.attribute;
  }

  public void setAttribute(ReferenceBean attribute) {
     this.attribute = attribute;
  }

  public String getAttributeValue() {
     return this.attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
     this.attributeValue = attributeValue;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }


}
