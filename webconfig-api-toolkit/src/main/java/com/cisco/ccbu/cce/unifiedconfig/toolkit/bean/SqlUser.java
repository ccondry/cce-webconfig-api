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


@Path("sqluser")
@XmlRootElement(name="sqlUser")
public class SqlUser extends BaseApiBean {
  private String loginName;
  private String password;

  public String getLoginName() {
     return this.loginName;
  }

  public void setLoginName(String loginName) {
     this.loginName = loginName;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }


  @Path("sqluser")
  @XmlRootElement(name = "results")
  public static class SqlUserList extends BaseApiListBean<SqlUser> {
    @XmlElementWrapper(name = "sqlUsers")
    @XmlElement(name = "sqlUser")
    public List<SqlUser> getItems() {
      return items;
    }

    public void setItems(List<SqlUser> items) {
      this.items = items;
    }
  }
}
