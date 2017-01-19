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


@Path("bucketinterval")
@XmlRootElement(name="bucketInterval")
public class BucketInterval extends BaseApiBean {
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private Boolean markDeletable;
  private String name;
  private String refURL;
  private Integer upperBound1;
  private Integer upperBound2;
  private Integer upperBound3;
  private Integer upperBound4;
  private Integer upperBound5;
  private Integer upperBound6;
  private Integer upperBound7;
  private Integer upperBound8;
  private Integer upperBound9;

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

  public Boolean getMarkDeletable() {
     return this.markDeletable;
  }

  public void setMarkDeletable(Boolean markDeletable) {
     this.markDeletable = markDeletable;
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

  public Integer getUpperBound1() {
     return this.upperBound1;
  }

  public void setUpperBound1(Integer upperBound1) {
     this.upperBound1 = upperBound1;
  }

  public Integer getUpperBound2() {
     return this.upperBound2;
  }

  public void setUpperBound2(Integer upperBound2) {
     this.upperBound2 = upperBound2;
  }

  public Integer getUpperBound3() {
     return this.upperBound3;
  }

  public void setUpperBound3(Integer upperBound3) {
     this.upperBound3 = upperBound3;
  }

  public Integer getUpperBound4() {
     return this.upperBound4;
  }

  public void setUpperBound4(Integer upperBound4) {
     this.upperBound4 = upperBound4;
  }

  public Integer getUpperBound5() {
     return this.upperBound5;
  }

  public void setUpperBound5(Integer upperBound5) {
     this.upperBound5 = upperBound5;
  }

  public Integer getUpperBound6() {
     return this.upperBound6;
  }

  public void setUpperBound6(Integer upperBound6) {
     this.upperBound6 = upperBound6;
  }

  public Integer getUpperBound7() {
     return this.upperBound7;
  }

  public void setUpperBound7(Integer upperBound7) {
     this.upperBound7 = upperBound7;
  }

  public Integer getUpperBound8() {
     return this.upperBound8;
  }

  public void setUpperBound8(Integer upperBound8) {
     this.upperBound8 = upperBound8;
  }

  public Integer getUpperBound9() {
     return this.upperBound9;
  }

  public void setUpperBound9(Integer upperBound9) {
     this.upperBound9 = upperBound9;
  }


  @Path("bucketinterval")
  @XmlRootElement(name = "results")
  public static class BucketIntervalList extends BaseApiListBean<BucketInterval> {
    @XmlElementWrapper(name = "bucketIntervals")
    @XmlElement(name = "bucketInterval")
    public List<BucketInterval> getItems() {
      return items;
    }

    public void setItems(List<BucketInterval> items) {
      this.items = items;
    }
  }
}
