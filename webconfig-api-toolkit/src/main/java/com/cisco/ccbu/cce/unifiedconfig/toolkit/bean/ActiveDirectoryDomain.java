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


@Path("activedirectorydomain")
@XmlRootElement(name="activeDirectoryDomain")
public class ActiveDirectoryDomain extends BaseApiBean {
  private String name;
  private boolean systemDomain;

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public boolean getSystemDomain() {
     return this.systemDomain;
  }

  public void setSystemDomain(boolean systemDomain) {
     this.systemDomain = systemDomain;
  }


  @Path("activedirectorydomain")
  @XmlRootElement(name = "results")
  public static class ActiveDirectoryDomainList extends BaseApiListBean<ActiveDirectoryDomain> {
    @XmlElementWrapper(name = "activeDirectoryDomains")
    @XmlElement(name = "activeDirectoryDomain")
    public List<ActiveDirectoryDomain> getItems() {
      return items;
    }

    public void setItems(List<ActiveDirectoryDomain> items) {
      this.items = items;
    }
  }
}
