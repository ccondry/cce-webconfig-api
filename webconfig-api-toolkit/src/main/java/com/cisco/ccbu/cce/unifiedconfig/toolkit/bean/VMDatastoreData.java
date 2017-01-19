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


public class VMDatastoreData extends BaseApiBean {
  private String name;
  private Long sizeInGB;

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public Long getSizeInGB() {
     return this.sizeInGB;
  }

  public void setSizeInGB(Long sizeInGB) {
     this.sizeInGB = sizeInGB;
  }


}
