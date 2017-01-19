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


@Path("internetscripteditor")
@XmlRootElement(name="##default")
public class InternetScriptEditor extends BaseApiBean {
  private String downloadLink;
  private boolean enabled;

  public String getDownloadLink() {
     return this.downloadLink;
  }

  public void setDownloadLink(String downloadLink) {
     this.downloadLink = downloadLink;
  }

  public boolean getEnabled() {
     return this.enabled;
  }

  public void setEnabled(boolean enabled) {
     this.enabled = enabled;
  }


  @Path("internetscripteditor")
  @XmlRootElement(name = "results")
  public static class InternetScriptEditorList extends BaseApiListBean<InternetScriptEditor> {
    @XmlElementWrapper(name = "##defaults")
    @XmlElement(name = "##default")
    public List<InternetScriptEditor> getItems() {
      return items;
    }

    public void setItems(List<InternetScriptEditor> items) {
      this.items = items;
    }
  }
}
