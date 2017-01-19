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


@Path("timezone")
@XmlRootElement(name="timeZone")
public class TimeZone extends BaseApiBean {
  private Integer bias;
  private String displayName;
  private String dstName;
  private boolean dstObserved;
  private String name;
  private String refURL;
  private String stdName;

  @XmlElement(name="bias")
  public Integer getBias() {
     return this.bias;
  }

  public void setBias(Integer bias) {
     this.bias = bias;
  }

  @XmlElement(name="displayName")
  public String getDisplayName() {
     return this.displayName;
  }

  public void setDisplayName(String displayName) {
     this.displayName = displayName;
  }

  @XmlElement(name="dstName")
  public String getDstName() {
     return this.dstName;
  }

  public void setDstName(String dstName) {
     this.dstName = dstName;
  }

  @XmlElement(name="dstObserved")
  public boolean getDstObserved() {
     return this.dstObserved;
  }

  public void setDstObserved(boolean dstObserved) {
     this.dstObserved = dstObserved;
  }

  @XmlElement(name="name")
  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  @XmlElement(name="refURL")
  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  @XmlElement(name="stdName")
  public String getStdName() {
     return this.stdName;
  }

  public void setStdName(String stdName) {
     this.stdName = stdName;
  }


  @Path("timezone")
  @XmlRootElement(name = "results")
  public static class TimeZoneList extends BaseApiListBean<TimeZone> {
    @XmlElementWrapper(name = "timeZones")
    @XmlElement(name = "timeZone")
    public List<TimeZone> getItems() {
      return items;
    }

    public void setItems(List<TimeZone> items) {
      this.items = items;
    }
  }
}
