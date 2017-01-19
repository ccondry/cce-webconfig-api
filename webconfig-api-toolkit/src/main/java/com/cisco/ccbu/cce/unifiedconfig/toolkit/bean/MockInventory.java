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
@XmlRootElement(name="mockInventory")
public class MockInventory extends BaseApiBean {
  private boolean enableMockMode;
  private List<VMData> vmDataList;

  public boolean getEnableMockMode() {
     return this.enableMockMode;
  }

  public void setEnableMockMode(boolean enableMockMode) {
     this.enableMockMode = enableMockMode;
  }

  @XmlElementWrapper(name="machines")
  @XmlElement(name="machine")
  public List<VMData> getVmDataList() {
     return this.vmDataList;
  }

  public void setVmDataList(List<VMData> vmDataList) {
     this.vmDataList = vmDataList;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MockInventoryList extends BaseApiListBean<MockInventory> {
    @XmlElementWrapper(name = "mockInventorys")
    @XmlElement(name = "mockInventory")
    public List<MockInventory> getItems() {
      return items;
    }

    public void setItems(List<MockInventory> items) {
      this.items = items;
    }
  }
}
