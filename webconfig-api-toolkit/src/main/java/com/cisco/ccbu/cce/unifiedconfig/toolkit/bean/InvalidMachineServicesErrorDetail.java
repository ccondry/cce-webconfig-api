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
public class InvalidMachineServicesErrorDetail extends BaseApiBean {
  private List<MachineService> servicesFound;
  private List<MachineService> servicesRequired;

  @XmlElementWrapper(name="servicesFound")
  @XmlElement(name="service")
  public List<MachineService> getServicesFound() {
     return this.servicesFound;
  }

  public void setServicesFound(List<MachineService> servicesFound) {
     this.servicesFound = servicesFound;
  }

  @XmlElementWrapper(name="servicesRequired")
  @XmlElement(name="service")
  public List<MachineService> getServicesRequired() {
     return this.servicesRequired;
  }

  public void setServicesRequired(List<MachineService> servicesRequired) {
     this.servicesRequired = servicesRequired;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class InvalidMachineServicesErrorDetailList extends BaseApiListBean<InvalidMachineServicesErrorDetail> {
    @XmlElementWrapper(name = "errorDetails")
    @XmlElement(name = "errorDetail")
    public List<InvalidMachineServicesErrorDetail> getItems() {
      return items;
    }

    public void setItems(List<InvalidMachineServicesErrorDetail> items) {
      this.items = items;
    }
  }
}
