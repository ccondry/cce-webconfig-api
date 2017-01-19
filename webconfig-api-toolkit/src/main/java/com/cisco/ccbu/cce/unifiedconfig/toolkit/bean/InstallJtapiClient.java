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


@Path("installjtapiclient")
@XmlRootElement(name="installJtapiClient")
public class InstallJtapiClient extends BaseApiBean {
  private String callManagerPublisherAddress;

  public String getCallManagerPublisherAddress() {
     return this.callManagerPublisherAddress;
  }

  public void setCallManagerPublisherAddress(String callManagerPublisherAddress) {
     this.callManagerPublisherAddress = callManagerPublisherAddress;
  }


  @Path("installjtapiclient")
  @XmlRootElement(name = "results")
  public static class InstallJtapiClientList extends BaseApiListBean<InstallJtapiClient> {
    @XmlElementWrapper(name = "installJtapiClients")
    @XmlElement(name = "installJtapiClient")
    public List<InstallJtapiClient> getItems() {
      return items;
    }

    public void setItems(List<InstallJtapiClient> items) {
      this.items = items;
    }
  }
}
