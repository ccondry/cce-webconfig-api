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


@Path("operation")
@XmlRootElement(name="operations")
public class Operations extends BaseApiBean {
  private List<Operation> operations;

  @XmlElement(name="operation")
  public List<Operation> getOperations() {
     return this.operations;
  }

  public void setOperations(List<Operation> operations) {
     this.operations = operations;
  }


  @Path("operation")
  @XmlRootElement(name = "results")
  public static class OperationsList extends BaseApiListBean<Operations> {
    @XmlElementWrapper(name = "operationss")
    @XmlElement(name = "operations")
    public List<Operations> getItems() {
      return items;
    }

    public void setItems(List<Operations> items) {
      this.items = items;
    }
  }
}
