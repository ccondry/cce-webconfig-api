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
@XmlRootElement(name="address")
public class MachineAddress extends BaseApiBean {
  private String address;
  private List<MachineService> machineServices;
  private AddressType type;

  public String getAddress() {
     return this.address;
  }

  public void setAddress(String address) {
     this.address = address;
  }

  @XmlElementWrapper(name="services")
  @XmlElement(name="service")
  public List<MachineService> getMachineServices() {
     return this.machineServices;
  }

  public void setMachineServices(List<MachineService> machineServices) {
     this.machineServices = machineServices;
  }

  public AddressType getType() {
     return this.type;
  }

  public void setType(AddressType type) {
     this.type = type;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MachineAddressList extends BaseApiListBean<MachineAddress> {
    @XmlElementWrapper(name = "addresss")
    @XmlElement(name = "address")
    public List<MachineAddress> getItems() {
      return items;
    }

    public void setItems(List<MachineAddress> items) {
      this.items = items;
    }
  }
}
