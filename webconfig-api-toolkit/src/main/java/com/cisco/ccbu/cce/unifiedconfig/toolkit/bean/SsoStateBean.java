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


@Path("sso")
@XmlRootElement(name="SsoState")
public class SsoStateBean extends BaseApiBean {
  private String active_ids;
  private String caching;
  private String client_id;
  private String default_ids_ref;
  private String ids1_state;
  private String ids2_state;
  private String name;
  private SsoLocalEnabledState sso_mode;
  private Long timestamp;

  public String getActive_ids() {
     return this.active_ids;
  }

  public void setActive_ids(String active_ids) {
     this.active_ids = active_ids;
  }

  public String getCaching() {
     return this.caching;
  }

  public void setCaching(String caching) {
     this.caching = caching;
  }

  public String getClient_id() {
     return this.client_id;
  }

  public void setClient_id(String client_id) {
     this.client_id = client_id;
  }

  public String getDefault_ids_ref() {
     return this.default_ids_ref;
  }

  public void setDefault_ids_ref(String default_ids_ref) {
     this.default_ids_ref = default_ids_ref;
  }

  public String getIds1_state() {
     return this.ids1_state;
  }

  public void setIds1_state(String ids1_state) {
     this.ids1_state = ids1_state;
  }

  public String getIds2_state() {
     return this.ids2_state;
  }

  public void setIds2_state(String ids2_state) {
     this.ids2_state = ids2_state;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public SsoLocalEnabledState getSso_mode() {
     return this.sso_mode;
  }

  public void setSso_mode(SsoLocalEnabledState sso_mode) {
     this.sso_mode = sso_mode;
  }

  public Long getTimestamp() {
     return this.timestamp;
  }

  public void setTimestamp(Long timestamp) {
     this.timestamp = timestamp;
  }


  @Path("sso")
  @XmlRootElement(name = "results")
  public static class SsoStateBeanList extends BaseApiListBean<SsoStateBean> {
    @XmlElementWrapper(name = "SsoStates")
    @XmlElement(name = "SsoState")
    public List<SsoStateBean> getItems() {
      return items;
    }

    public void setItems(List<SsoStateBean> items) {
      this.items = items;
    }
  }
}
