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


@Path("logcollection")
@XmlRootElement(name="logCollection")
public class LogCollection extends BaseApiBean {
  private Set components;
  private String description;
  private Long endDateTime;
  private String refURL;
  private FileRefWithSize resultsFile;
  private Long startDateTime;
  private Status status;

  @XmlElementWrapper(name="components")
  @XmlElement(name="component")
  public Set getComponents() {
     return this.components;
  }

  public void setComponents(Set components) {
     this.components = components;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public Long getEndDateTime() {
     return this.endDateTime;
  }

  public void setEndDateTime(Long endDateTime) {
     this.endDateTime = endDateTime;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElement(name="##default")
  public FileRefWithSize getResultsFile() {
     return this.resultsFile;
  }

  public void setResultsFile(FileRefWithSize resultsFile) {
     this.resultsFile = resultsFile;
  }

  public Long getStartDateTime() {
     return this.startDateTime;
  }

  public void setStartDateTime(Long startDateTime) {
     this.startDateTime = startDateTime;
  }

  public Status getStatus() {
     return this.status;
  }

  public void setStatus(Status status) {
     this.status = status;
  }


  @Path("logcollection")
  @XmlRootElement(name = "results")
  public static class LogCollectionList extends BaseApiListBean<LogCollection> {
    @XmlElementWrapper(name = "logCollections")
    @XmlElement(name = "logCollection")
    public List<LogCollection> getItems() {
      return items;
    }

    public void setItems(List<LogCollection> items) {
      this.items = items;
    }
  }
}
