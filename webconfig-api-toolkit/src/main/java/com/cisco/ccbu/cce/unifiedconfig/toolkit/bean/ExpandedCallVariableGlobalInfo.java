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


@Path("expandedcallvariable")
@XmlRootElement(name="globalInfo")
public class ExpandedCallVariableGlobalInfo extends BaseApiBean {
  private Integer totalVariableCtiSize;
  private Integer totalVariableSize;

  public Integer getTotalVariableCtiSize() {
     return this.totalVariableCtiSize;
  }

  public void setTotalVariableCtiSize(Integer totalVariableCtiSize) {
     this.totalVariableCtiSize = totalVariableCtiSize;
  }

  public Integer getTotalVariableSize() {
     return this.totalVariableSize;
  }

  public void setTotalVariableSize(Integer totalVariableSize) {
     this.totalVariableSize = totalVariableSize;
  }


  @Path("expandedcallvariable")
  @XmlRootElement(name = "results")
  public static class ExpandedCallVariableGlobalInfoList extends BaseApiListBean<ExpandedCallVariableGlobalInfo> {
    @XmlElementWrapper(name = "globalInfos")
    @XmlElement(name = "globalInfo")
    public List<ExpandedCallVariableGlobalInfo> getItems() {
      return items;
    }

    public void setItems(List<ExpandedCallVariableGlobalInfo> items) {
      this.items = items;
    }
  }
}
