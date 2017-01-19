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
@XmlRootElement(name="script")
public class ScriptGlobalSetting extends BaseApiBean {
  private Short retainScriptVersion;

  public Short getRetainScriptVersion() {
     return this.retainScriptVersion;
  }

  public void setRetainScriptVersion(Short retainScriptVersion) {
     this.retainScriptVersion = retainScriptVersion;
  }


  @Path("globalsetting")
  @XmlRootElement(name = "results")
  public static class ScriptGlobalSettingList extends BaseApiListBean<ScriptGlobalSetting> {
    @XmlElementWrapper(name = "scripts")
    @XmlElement(name = "script")
    public List<ScriptGlobalSetting> getItems() {
      return items;
    }

    public void setItems(List<ScriptGlobalSetting> items) {
      this.items = items;
    }
  }
}
