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
@XmlRootElement(name="results")
public class ActiveDirectoryDomainList extends BaseApiBean {


  @Path("activedirectorydomain")
  @XmlRootElement(name = "results")
  public static class ActiveDirectoryDomainListList extends BaseApiListBean<ActiveDirectoryDomainList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ActiveDirectoryDomainList> getItems() {
      return items;
    }

    public void setItems(List<ActiveDirectoryDomainList> items) {
      this.items = items;
    }
  }
}
