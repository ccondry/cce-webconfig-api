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


public class VMLayoutResult extends BaseApiBean {
  private List<String> hostsWithoutProfiles;
  private String layoutName;
  private List<String> profilesWithoutHosts;
  private List<VMServerData> results;
  private Boolean valid;

  public List<String> getHostsWithoutProfiles() {
     return this.hostsWithoutProfiles;
  }

  public void setHostsWithoutProfiles(List<String> hostsWithoutProfiles) {
     this.hostsWithoutProfiles = hostsWithoutProfiles;
  }

  public String getLayoutName() {
     return this.layoutName;
  }

  public void setLayoutName(String layoutName) {
     this.layoutName = layoutName;
  }

  public List<String> getProfilesWithoutHosts() {
     return this.profilesWithoutHosts;
  }

  public void setProfilesWithoutHosts(List<String> profilesWithoutHosts) {
     this.profilesWithoutHosts = profilesWithoutHosts;
  }

  @XmlElementWrapper(name="vmResults")
  @XmlElement(name="vmResult")
  public List<VMServerData> getResults() {
     return this.results;
  }

  public void setResults(List<VMServerData> results) {
     this.results = results;
  }

  public Boolean getValid() {
     return this.valid;
  }

  public void setValid(Boolean valid) {
     this.valid = valid;
  }


}
