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


@XmlRootElement(name="dataSources")
public class CuicDataSources extends BaseApiBean {
  private List<CuicDataSourceRef> items;

  @XmlElement(name="dataSource")
  public List<CuicDataSourceRef> getItems() {
     return this.items;
  }

  public void setItems(List<CuicDataSourceRef> items) {
     this.items = items;
  }


}
