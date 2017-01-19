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


@XmlRootElement(name="errorDetail")
public class FloatOutOfRangeApiErrorDetail extends BaseApiBean {
  private Float max;
  private Float min;

  public Float getMax() {
     return this.max;
  }

  public void setMax(Float max) {
     this.max = max;
  }

  public Float getMin() {
     return this.min;
  }

  public void setMin(Float min) {
     this.min = min;
  }


}
