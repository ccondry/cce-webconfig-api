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


@Path("campaign")
@XmlRootElement(name="dnc")
public class ImportRule extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private String filePath;
  private Boolean markDeletable;
  private String name;
  private Boolean overwriteEnabled;
  private String refURL;
  private Boolean renameEnabled;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  @XmlElement(name="filePath")
  public String getFilePath() {
     return this.filePath;
  }

  public void setFilePath(String filePath) {
     this.filePath = filePath;
  }

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  @XmlElement(name="name")
  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  @XmlElement(name="overwrite")
  public Boolean getOverwriteEnabled() {
     return this.overwriteEnabled;
  }

  public void setOverwriteEnabled(Boolean overwriteEnabled) {
     this.overwriteEnabled = overwriteEnabled;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElement(name="renameFileAfterImport")
  public Boolean getRenameEnabled() {
     return this.renameEnabled;
  }

  public void setRenameEnabled(Boolean renameEnabled) {
     this.renameEnabled = renameEnabled;
  }


  @Path("dnc")
  @XmlRootElement(name = "results")
  public static class ImportRuleList extends BaseApiListBean<ImportRule> {
    @XmlElementWrapper(name = "dncs")
    @XmlElement(name = "dnc")
    public List<ImportRule> getItems() {
      return items;
    }

    public void setItems(List<ImportRule> items) {
      this.items = items;
    }
  }
}
