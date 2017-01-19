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
@XmlRootElement(name="versionInfo")
public class MachineVersion extends BaseApiBean {
  private Date buildDate;
  private String buildNumber;
  private String dropNumber;
  private String esNumber;
  private String patchVersion;
  private String srNumber;
  private String version;

  @XmlElement(name="buildDate")
  public Date getBuildDate() {
     return this.buildDate;
  }

  public void setBuildDate(Date buildDate) {
     this.buildDate = buildDate;
  }

  @XmlElement(name="buildNumber")
  public String getBuildNumber() {
     return this.buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
     this.buildNumber = buildNumber;
  }

  @XmlElement(name="dropNumber")
  public String getDropNumber() {
     return this.dropNumber;
  }

  public void setDropNumber(String dropNumber) {
     this.dropNumber = dropNumber;
  }

  @XmlElement(name="esNumber")
  public String getEsNumber() {
     return this.esNumber;
  }

  public void setEsNumber(String esNumber) {
     this.esNumber = esNumber;
  }

  @XmlElement(name="patchVersion")
  public String getPatchVersion() {
     return this.patchVersion;
  }

  public void setPatchVersion(String patchVersion) {
     this.patchVersion = patchVersion;
  }

  @XmlElement(name="srNumber")
  public String getSrNumber() {
     return this.srNumber;
  }

  public void setSrNumber(String srNumber) {
     this.srNumber = srNumber;
  }

  @XmlElement(name="version")
  public String getVersion() {
     return this.version;
  }

  public void setVersion(String version) {
     this.version = version;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MachineVersionList extends BaseApiListBean<MachineVersion> {
    @XmlElementWrapper(name = "versionInfos")
    @XmlElement(name = "versionInfo")
    public List<MachineVersion> getItems() {
      return items;
    }

    public void setItems(List<MachineVersion> items) {
      this.items = items;
    }
  }
}
