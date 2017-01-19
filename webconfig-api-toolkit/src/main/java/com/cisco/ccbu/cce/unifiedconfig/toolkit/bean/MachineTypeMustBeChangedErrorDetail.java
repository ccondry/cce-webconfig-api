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
public class MachineTypeMustBeChangedErrorDetail extends BaseApiBean {
  private MachineType type;
  private List<MachineType> validMachineTypes;

  public MachineType getType() {
     return this.type;
  }

  public void setType(MachineType type) {
     this.type = type;
  }

  @XmlElementWrapper(name="validMachineTypes")
  @XmlElement(name="type")
  public List<MachineType> getValidMachineTypes() {
     return this.validMachineTypes;
  }

  public void setValidMachineTypes(List<MachineType> validMachineTypes) {
     this.validMachineTypes = validMachineTypes;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MachineTypeMustBeChangedErrorDetailList extends BaseApiListBean<MachineTypeMustBeChangedErrorDetail> {
    @XmlElementWrapper(name = "errorDetails")
    @XmlElement(name = "errorDetail")
    public List<MachineTypeMustBeChangedErrorDetail> getItems() {
      return items;
    }

    public void setItems(List<MachineTypeMustBeChangedErrorDetail> items) {
      this.items = items;
    }
  }
}
