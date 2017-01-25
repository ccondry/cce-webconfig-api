// ----------------------------------------------
package com.cisco.ccbu.cce.unifiedconfig.toolkit.bean;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBeanWithName;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import java.util.Date;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiListBean;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlElementWrapper;


@Path("dialednumber")
@XmlRootElement(name="dialedNumber")
public class DialedNumber extends BaseApiBeanWithName {
  private ReferenceBean callType;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private List<DialedNumberRecord> dialedNumberRecords;
  private String dialedNumberString;
  private Boolean markDeletable;
  private ReferenceBean mediaRoutingDomain;
  private String name;
  private String refURL;
  private Integer routingType;

  public ReferenceBean getCallType() {
     return this.callType;
  }

  public void setCallType(ReferenceBean callType) {
     this.callType = callType;
  }

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

  @XmlElementWrapper(name="dialedNumberRecords")
  @XmlElement(name="dialedNumberRecord")
  public List<DialedNumberRecord> getDialedNumberRecords() {
     return this.dialedNumberRecords;
  }

  public void setDialedNumberRecords(List<DialedNumberRecord> dialedNumberRecords) {
     this.dialedNumberRecords = dialedNumberRecords;
  }

  public String getDialedNumberString() {
     return this.dialedNumberString;
  }

  public void setDialedNumberString(String dialedNumberString) {
     this.dialedNumberString = dialedNumberString;
  }

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public ReferenceBean getMediaRoutingDomain() {
     return this.mediaRoutingDomain;
  }

  public void setMediaRoutingDomain(ReferenceBean mediaRoutingDomain) {
     this.mediaRoutingDomain = mediaRoutingDomain;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Integer getRoutingType() {
     return this.routingType;
  }

  public void setRoutingType(Integer routingType) {
     this.routingType = routingType;
  }


  @Path("dialednumber")
  @XmlRootElement(name = "results")
  public static class DialedNumberList extends BaseApiListBean<DialedNumber> {
    @XmlElementWrapper(name = "dialedNumbers")
    @XmlElement(name = "dialedNumber")
    public List<DialedNumber> getItems() {
      return items;
    }

    public void setItems(List<DialedNumber> items) {
      this.items = items;
    }
  }
}
