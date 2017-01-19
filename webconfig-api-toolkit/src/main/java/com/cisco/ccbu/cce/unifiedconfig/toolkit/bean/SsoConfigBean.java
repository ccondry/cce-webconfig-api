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
@XmlRootElement(name="SsoConfig")
public class SsoConfigBean extends BaseApiBean {
  private String client_id;
  private String client_secret;
  private String cluster_mode;
  private String cluster_name;
  private String default_ids_ref;
  private String ids1_url;
  private String ids2_url;
  private String name;
  private String redirect_base_uri;
  private String resource_id;
  private String resource_secret;

  public String getClient_id() {
     return this.client_id;
  }

  public void setClient_id(String client_id) {
     this.client_id = client_id;
  }

  public String getClient_secret() {
     return this.client_secret;
  }

  public void setClient_secret(String client_secret) {
     this.client_secret = client_secret;
  }

  public String getCluster_mode() {
     return this.cluster_mode;
  }

  public void setCluster_mode(String cluster_mode) {
     this.cluster_mode = cluster_mode;
  }

  public String getCluster_name() {
     return this.cluster_name;
  }

  public void setCluster_name(String cluster_name) {
     this.cluster_name = cluster_name;
  }

  public String getDefault_ids_ref() {
     return this.default_ids_ref;
  }

  public void setDefault_ids_ref(String default_ids_ref) {
     this.default_ids_ref = default_ids_ref;
  }

  public String getIds1_url() {
     return this.ids1_url;
  }

  public void setIds1_url(String ids1_url) {
     this.ids1_url = ids1_url;
  }

  public String getIds2_url() {
     return this.ids2_url;
  }

  public void setIds2_url(String ids2_url) {
     this.ids2_url = ids2_url;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getRedirect_base_uri() {
     return this.redirect_base_uri;
  }

  public void setRedirect_base_uri(String redirect_base_uri) {
     this.redirect_base_uri = redirect_base_uri;
  }

  public String getResource_id() {
     return this.resource_id;
  }

  public void setResource_id(String resource_id) {
     this.resource_id = resource_id;
  }

  public String getResource_secret() {
     return this.resource_secret;
  }

  public void setResource_secret(String resource_secret) {
     this.resource_secret = resource_secret;
  }


  @Path("sso")
  @XmlRootElement(name = "results")
  public static class SsoConfigBeanList extends BaseApiListBean<SsoConfigBean> {
    @XmlElementWrapper(name = "SsoConfigs")
    @XmlElement(name = "SsoConfig")
    public List<SsoConfigBean> getItems() {
      return items;
    }

    public void setItems(List<SsoConfigBean> items) {
      this.items = items;
    }
  }
}
