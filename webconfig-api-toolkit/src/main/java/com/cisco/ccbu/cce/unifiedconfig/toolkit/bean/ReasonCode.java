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


@Path("reasoncode")
@XmlRootElement(name="reasonCode")
public class ReasonCode extends BaseApiBean {
  private Integer changeStamp;
  private Integer code;
  private String correlationId;
  private ReferenceBean department;
  private String description;
  private Boolean markDeletable;
  private String refURL;
  private String text;

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public Integer getCode() {
     return this.code;
  }

  public void setCode(Integer code) {
     this.code = code;
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

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public String getText() {
     return this.text;
  }

  public void setText(String text) {
     this.text = text;
  }


  @Path("reasoncode")
  @XmlRootElement(name = "results")
  public static class ReasonCodeList extends BaseApiListBean<ReasonCode> {
    @XmlElementWrapper(name = "reasonCodes")
    @XmlElement(name = "reasonCode")
    public List<ReasonCode> getItems() {
      return items;
    }

    public void setItems(List<ReasonCode> items) {
      this.items = items;
    }
  }
}
