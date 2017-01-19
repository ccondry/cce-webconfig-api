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


@Path("personalcallback")
@XmlRootElement(name="personalCallback")
public class PersonalCallback extends BaseApiBean {
  private String delimiter;
  private String fileContent;
  private boolean overwriteData;

  public String getDelimiter() {
     return this.delimiter;
  }

  public void setDelimiter(String delimiter) {
     this.delimiter = delimiter;
  }

  public String getFileContent() {
     return this.fileContent;
  }

  public void setFileContent(String fileContent) {
     this.fileContent = fileContent;
  }

  public boolean getOverwriteData() {
     return this.overwriteData;
  }

  public void setOverwriteData(boolean overwriteData) {
     this.overwriteData = overwriteData;
  }


  @Path("personalcallback")
  @XmlRootElement(name = "results")
  public static class PersonalCallbackList extends BaseApiListBean<PersonalCallback> {
    @XmlElementWrapper(name = "personalCallbacks")
    @XmlElement(name = "personalCallback")
    public List<PersonalCallback> getItems() {
      return items;
    }

    public void setItems(List<PersonalCallback> items) {
      this.items = items;
    }
  }
}
