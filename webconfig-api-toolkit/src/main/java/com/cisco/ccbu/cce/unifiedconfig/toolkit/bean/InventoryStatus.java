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


@Path("machineinventory")
@XmlRootElement(name="status")
public class InventoryStatus extends BaseApiBean {
  private List<Alert> alerts;
  private ScanInfo scanInfo;

  @XmlElementWrapper(name="alerts")
  @XmlElement(name="alert")
  public List<Alert> getAlerts() {
     return this.alerts;
  }

  public void setAlerts(List<Alert> alerts) {
     this.alerts = alerts;
  }

  public ScanInfo getScanInfo() {
     return this.scanInfo;
  }

  public void setScanInfo(ScanInfo scanInfo) {
     this.scanInfo = scanInfo;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class InventoryStatusList extends BaseApiListBean<InventoryStatus> {
    @XmlElementWrapper(name = "statuss")
    @XmlElement(name = "status")
    public List<InventoryStatus> getItems() {
      return items;
    }

    public void setItems(List<InventoryStatus> items) {
      this.items = items;
    }
  }
}
