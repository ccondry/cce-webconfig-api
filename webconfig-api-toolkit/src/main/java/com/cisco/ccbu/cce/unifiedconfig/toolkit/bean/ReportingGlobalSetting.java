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


@Path("globalsetting")
@XmlRootElement(name="reporting")
public class ReportingGlobalSetting extends BaseApiBean {
  private Integer reportingInterval;

  public Integer getReportingInterval() {
     return this.reportingInterval;
  }

  public void setReportingInterval(Integer reportingInterval) {
     this.reportingInterval = reportingInterval;
  }


  @Path("globalsetting")
  @XmlRootElement(name = "results")
  public static class ReportingGlobalSettingList extends BaseApiListBean<ReportingGlobalSetting> {
    @XmlElementWrapper(name = "reportings")
    @XmlElement(name = "reporting")
    public List<ReportingGlobalSetting> getItems() {
      return items;
    }

    public void setItems(List<ReportingGlobalSetting> items) {
      this.items = items;
    }
  }
}
