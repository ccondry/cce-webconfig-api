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


@XmlRootElement(name="NotificationRule")
public class NotificationRule extends BaseApiBean {
  private String campaignUrl;
  private Integer changeStamp;
  private String description;
  private String name;
  private String refURL;
  private List<String> tags;
  private String type;

  public String getCampaignUrl() {
     return this.campaignUrl;
  }

  public void setCampaignUrl(String campaignUrl) {
     this.campaignUrl = campaignUrl;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
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

  @XmlElementWrapper(name="tags")
  @XmlElement(name="tag")
  public List<String> getTags() {
     return this.tags;
  }

  public void setTags(List<String> tags) {
     this.tags = tags;
  }

  public String getType() {
     return this.type;
  }

  public void setType(String type) {
     this.type = type;
  }


}
