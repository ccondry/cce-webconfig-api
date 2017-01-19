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


public class ScriptCrossReference extends BaseApiBean {
  private Integer foreignKey;
  private Integer targetType;

  public Integer getForeignKey() {
     return this.foreignKey;
  }

  public void setForeignKey(Integer foreignKey) {
     this.foreignKey = foreignKey;
  }

  public Integer getTargetType() {
     return this.targetType;
  }

  public void setTargetType(Integer targetType) {
     this.targetType = targetType;
  }


}
