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


public class CampaignSkillGroupInfo extends BaseApiBean {
  private String abandonedRoutePoint;
  private String dialedNumber;
  private Integer ivrPorts;
  private String ivrRoutePoint;
  private Integer overflowAgents;
  private Integer recordsToCache;
  private ReferenceBean skillGroupRef;

  @XmlElement(name="abandonedRoutePoint")
  public String getAbandonedRoutePoint() {
     return this.abandonedRoutePoint;
  }

  public void setAbandonedRoutePoint(String abandonedRoutePoint) {
     this.abandonedRoutePoint = abandonedRoutePoint;
  }

  @XmlElement(name="dialedNumber")
  public String getDialedNumber() {
     return this.dialedNumber;
  }

  public void setDialedNumber(String dialedNumber) {
     this.dialedNumber = dialedNumber;
  }

  @XmlElement(name="ivrPorts")
  public Integer getIvrPorts() {
     return this.ivrPorts;
  }

  public void setIvrPorts(Integer ivrPorts) {
     this.ivrPorts = ivrPorts;
  }

  @XmlElement(name="ivrRoutePoint")
  public String getIvrRoutePoint() {
     return this.ivrRoutePoint;
  }

  public void setIvrRoutePoint(String ivrRoutePoint) {
     this.ivrRoutePoint = ivrRoutePoint;
  }

  @XmlElement(name="overflowAgents")
  public Integer getOverflowAgents() {
     return this.overflowAgents;
  }

  public void setOverflowAgents(Integer overflowAgents) {
     this.overflowAgents = overflowAgents;
  }

  @XmlElement(name="recordsToCache")
  public Integer getRecordsToCache() {
     return this.recordsToCache;
  }

  public void setRecordsToCache(Integer recordsToCache) {
     this.recordsToCache = recordsToCache;
  }

  @XmlElement(name="skillGroup")
  public ReferenceBean getSkillGroupRef() {
     return this.skillGroupRef;
  }

  public void setSkillGroupRef(ReferenceBean skillGroupRef) {
     this.skillGroupRef = skillGroupRef;
  }


}
