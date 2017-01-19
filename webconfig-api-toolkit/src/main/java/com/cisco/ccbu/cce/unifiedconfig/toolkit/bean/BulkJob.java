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


@Path("bulkjob")
@XmlRootElement(name="bulkJob")
public class BulkJob extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private Date createDateTime;
  private FileRef csvFile;
  private ReferenceBean department;
  private String description;
  private Date endDateTime;
  private String fileContent;
  private String jobHostName;
  private Short jobState;
  private Short jobType;
  private FileRef logFile;
  private String refURL;
  private Date startDateTime;

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

  public Date getCreateDateTime() {
     return this.createDateTime;
  }

  public void setCreateDateTime(Date createDateTime) {
     this.createDateTime = createDateTime;
  }

  public FileRef getCsvFile() {
     return this.csvFile;
  }

  public void setCsvFile(FileRef csvFile) {
     this.csvFile = csvFile;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public Date getEndDateTime() {
     return this.endDateTime;
  }

  public void setEndDateTime(Date endDateTime) {
     this.endDateTime = endDateTime;
  }

  public String getFileContent() {
     return this.fileContent;
  }

  public void setFileContent(String fileContent) {
     this.fileContent = fileContent;
  }

  public String getJobHostName() {
     return this.jobHostName;
  }

  public void setJobHostName(String jobHostName) {
     this.jobHostName = jobHostName;
  }

  public Short getJobState() {
     return this.jobState;
  }

  public void setJobState(Short jobState) {
     this.jobState = jobState;
  }

  public Short getJobType() {
     return this.jobType;
  }

  public void setJobType(Short jobType) {
     this.jobType = jobType;
  }

  public FileRef getLogFile() {
     return this.logFile;
  }

  public void setLogFile(FileRef logFile) {
     this.logFile = logFile;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Date getStartDateTime() {
     return this.startDateTime;
  }

  public void setStartDateTime(Date startDateTime) {
     this.startDateTime = startDateTime;
  }


  @Path("bulkjob")
  @XmlRootElement(name = "results")
  public static class BulkJobList extends BaseApiListBean<BulkJob> {
    @XmlElementWrapper(name = "bulkJobs")
    @XmlElement(name = "bulkJob")
    public List<BulkJob> getItems() {
      return items;
    }

    public void setItems(List<BulkJob> items) {
      this.items = items;
    }
  }
}
