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


@Path("machineinventory")
@XmlRootElement(name="errorDetail")
public class InvalidMachineAddressesErrorDetail extends BaseApiBean {
  private List<MachineAddress> networksFound;
  private List<MachineAddress> networksRequired;

  @XmlElementWrapper(name="networksFound")
  @XmlElement(name="network")
  public List<MachineAddress> getNetworksFound() {
     return this.networksFound;
  }

  public void setNetworksFound(List<MachineAddress> networksFound) {
     this.networksFound = networksFound;
  }

  @XmlElementWrapper(name="networksRequired")
  @XmlElement(name="network")
  public List<MachineAddress> getNetworksRequired() {
     return this.networksRequired;
  }

  public void setNetworksRequired(List<MachineAddress> networksRequired) {
     this.networksRequired = networksRequired;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class InvalidMachineAddressesErrorDetailList extends BaseApiListBean<InvalidMachineAddressesErrorDetail> {
    @XmlElementWrapper(name = "errorDetails")
    @XmlElement(name = "errorDetail")
    public List<InvalidMachineAddressesErrorDetail> getItems() {
      return items;
    }

    public void setItems(List<InvalidMachineAddressesErrorDetail> items) {
      this.items = items;
    }
  }
}
