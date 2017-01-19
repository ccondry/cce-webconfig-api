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


@XmlRootElement(name="serverStatus")
public class VMServerData extends BaseApiBean {
  private Boolean biosValid;
  private Boolean dataStoresValid;
  private String id;
  private List<VMData> optionalProfilesNotMatched;
  private Boolean propertiesValid;
  private List<VMData> requiredProfilesNotMatched;
  private VMHost vMHost;
  private VMHostData vMHostData;
  private Boolean vmLayoutValid;
  private List<VMData> vmsMatched;
  private List<VMData> vmsNotMatched;

  public Boolean getBiosValid() {
     return this.biosValid;
  }

  public void setBiosValid(Boolean biosValid) {
     this.biosValid = biosValid;
  }

  public Boolean getDataStoresValid() {
     return this.dataStoresValid;
  }

  public void setDataStoresValid(Boolean dataStoresValid) {
     this.dataStoresValid = dataStoresValid;
  }

  public String getId() {
     return this.id;
  }

  public void setId(String id) {
     this.id = id;
  }

  @XmlElementWrapper(name="optionalProfilesNotMatched")
  @XmlElement(name="profile")
  public List<VMData> getOptionalProfilesNotMatched() {
     return this.optionalProfilesNotMatched;
  }

  public void setOptionalProfilesNotMatched(List<VMData> optionalProfilesNotMatched) {
     this.optionalProfilesNotMatched = optionalProfilesNotMatched;
  }

  public Boolean getPropertiesValid() {
     return this.propertiesValid;
  }

  public void setPropertiesValid(Boolean propertiesValid) {
     this.propertiesValid = propertiesValid;
  }

  @XmlElementWrapper(name="requiredProfilesNotMatched")
  @XmlElement(name="profile")
  public List<VMData> getRequiredProfilesNotMatched() {
     return this.requiredProfilesNotMatched;
  }

  public void setRequiredProfilesNotMatched(List<VMData> requiredProfilesNotMatched) {
     this.requiredProfilesNotMatched = requiredProfilesNotMatched;
  }

  public VMHost getVMHost() {
     return this.vMHost;
  }

  public void setVMHost(VMHost vMHost) {
     this.vMHost = vMHost;
  }

  public VMHostData getVMHostData() {
     return this.vMHostData;
  }

  public void setVMHostData(VMHostData vMHostData) {
     this.vMHostData = vMHostData;
  }

  public Boolean getVmLayoutValid() {
     return this.vmLayoutValid;
  }

  public void setVmLayoutValid(Boolean vmLayoutValid) {
     this.vmLayoutValid = vmLayoutValid;
  }

  @XmlElementWrapper(name="vmsMatched")
  @XmlElement(name="vm")
  public List<VMData> getVmsMatched() {
     return this.vmsMatched;
  }

  public void setVmsMatched(List<VMData> vmsMatched) {
     this.vmsMatched = vmsMatched;
  }

  @XmlElementWrapper(name="vmsNotMatched")
  @XmlElement(name="vm")
  public List<VMData> getVmsNotMatched() {
     return this.vmsNotMatched;
  }

  public void setVmsNotMatched(List<VMData> vmsNotMatched) {
     this.vmsNotMatched = vmsNotMatched;
  }


}
