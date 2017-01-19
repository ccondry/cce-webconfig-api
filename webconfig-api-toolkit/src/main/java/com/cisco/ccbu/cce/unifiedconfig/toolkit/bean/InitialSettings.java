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


@Path("initialize")
@XmlRootElement(name="##default")
public class InitialSettings extends BaseApiBean {
  private ReferenceBean cmSideA;
  private ReferenceBean cmSideB;
  private String correlationId;
  private ReferenceBean department;
  private String mobileAgentCodec;
  private String refURL;
  private String serviceAccountPassword;
  private String serviceAccountUserName;

  public ReferenceBean getCmSideA() {
     return this.cmSideA;
  }

  public void setCmSideA(ReferenceBean cmSideA) {
     this.cmSideA = cmSideA;
  }

  public ReferenceBean getCmSideB() {
     return this.cmSideB;
  }

  public void setCmSideB(ReferenceBean cmSideB) {
     this.cmSideB = cmSideB;
  }

  public String getCorrelationId() {
     return this.correlationId;
  }

  public void setCorrelationId(String correlationId) {
     this.correlationId = correlationId;
  }

  public ReferenceBean getDepartment() {
     return this.department;
  }

  public void setDepartment(ReferenceBean department) {
     this.department = department;
  }

  public String getMobileAgentCodec() {
     return this.mobileAgentCodec;
  }

  public void setMobileAgentCodec(String mobileAgentCodec) {
     this.mobileAgentCodec = mobileAgentCodec;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public String getServiceAccountPassword() {
     return this.serviceAccountPassword;
  }

  public void setServiceAccountPassword(String serviceAccountPassword) {
     this.serviceAccountPassword = serviceAccountPassword;
  }

  public String getServiceAccountUserName() {
     return this.serviceAccountUserName;
  }

  public void setServiceAccountUserName(String serviceAccountUserName) {
     this.serviceAccountUserName = serviceAccountUserName;
  }


  @Path("initialize")
  @XmlRootElement(name = "results")
  public static class InitialSettingsList extends BaseApiListBean<InitialSettings> {
    @XmlElementWrapper(name = "##defaults")
    @XmlElement(name = "##default")
    public List<InitialSettings> getItems() {
      return items;
    }

    public void setItems(List<InitialSettings> items) {
      this.items = items;
    }
  }
}
