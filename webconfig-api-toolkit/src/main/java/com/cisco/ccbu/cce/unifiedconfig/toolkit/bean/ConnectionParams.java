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
@XmlSeeAlso({DBConnectionParams.class, StreamingConnectionParams.class, JMSConnectionParams.class})
public class ConnectionParams extends BaseApiBean {
  private Integer maxPoolSize;
  private Integer minPoolSize;
  private String password;
  private String userId;

  public Integer getMaxPoolSize() {
     return this.maxPoolSize;
  }

  public void setMaxPoolSize(Integer maxPoolSize) {
     this.maxPoolSize = maxPoolSize;
  }

  public Integer getMinPoolSize() {
     return this.minPoolSize;
  }

  public void setMinPoolSize(Integer minPoolSize) {
     this.minPoolSize = minPoolSize;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public String getUserId() {
     return this.userId;
  }

  public void setUserId(String userId) {
     this.userId = userId;
  }


}
