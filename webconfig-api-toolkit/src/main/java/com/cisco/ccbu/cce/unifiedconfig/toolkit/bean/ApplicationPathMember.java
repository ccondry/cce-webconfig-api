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


@Path("applicationpath")
@XmlRootElement(name="applicationPathMember")
public class ApplicationPathMember extends BaseApiBean {
  private Integer applicationPathId;
  private Integer mrDomainId;
  private Short peripheralId;

  public Integer getApplicationPathId() {
     return this.applicationPathId;
  }

  public void setApplicationPathId(Integer applicationPathId) {
     this.applicationPathId = applicationPathId;
  }

  public Integer getMrDomainId() {
     return this.mrDomainId;
  }

  public void setMrDomainId(Integer mrDomainId) {
     this.mrDomainId = mrDomainId;
  }

  public Short getPeripheralId() {
     return this.peripheralId;
  }

  public void setPeripheralId(Short peripheralId) {
     this.peripheralId = peripheralId;
  }


  @Path("applicationpath")
  @XmlRootElement(name = "results")
  public static class ApplicationPathMemberList extends BaseApiListBean<ApplicationPathMember> {
    @XmlElementWrapper(name = "applicationPathMembers")
    @XmlElement(name = "applicationPathMember")
    public List<ApplicationPathMember> getItems() {
      return items;
    }

    public void setItems(List<ApplicationPathMember> items) {
      this.items = items;
    }
  }
}
