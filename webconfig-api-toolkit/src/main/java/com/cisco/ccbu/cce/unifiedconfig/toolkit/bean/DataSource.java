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


@XmlRootElement(name="##default")
public class DataSource extends BaseApiBean {
  private List<ConnectionParams> connectionParams;
  private String dataSourceType;
  private String description;
  private boolean failoverEnabled;
  private GroupPermissions groupPermissions;
  private String id;
  private String name;
  private String timezone;

  public List<ConnectionParams> getConnectionParams() {
     return this.connectionParams;
  }

  public void setConnectionParams(List<ConnectionParams> connectionParams) {
     this.connectionParams = connectionParams;
  }

  public String getDataSourceType() {
     return this.dataSourceType;
  }

  public void setDataSourceType(String dataSourceType) {
     this.dataSourceType = dataSourceType;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public boolean getFailoverEnabled() {
     return this.failoverEnabled;
  }

  public void setFailoverEnabled(boolean failoverEnabled) {
     this.failoverEnabled = failoverEnabled;
  }

  public GroupPermissions getGroupPermissions() {
     return this.groupPermissions;
  }

  public void setGroupPermissions(GroupPermissions groupPermissions) {
     this.groupPermissions = groupPermissions;
  }

  public String getId() {
     return this.id;
  }

  public void setId(String id) {
     this.id = id;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getTimezone() {
     return this.timezone;
  }

  public void setTimezone(String timezone) {
     this.timezone = timezone;
  }


}
