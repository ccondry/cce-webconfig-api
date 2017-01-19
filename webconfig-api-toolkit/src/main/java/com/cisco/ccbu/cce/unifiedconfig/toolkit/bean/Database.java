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


@Path("database")
@XmlRootElement(name="database")
public class Database extends BaseApiBean {
  private Integer dataFileSizeMB;
  private DbType databaseType;
  private String drive;
  private Integer logFileSizeMB;
  private String refURL;
  private Side side;

  public Integer getDataFileSizeMB() {
     return this.dataFileSizeMB;
  }

  public void setDataFileSizeMB(Integer dataFileSizeMB) {
     this.dataFileSizeMB = dataFileSizeMB;
  }

  public DbType getDatabaseType() {
     return this.databaseType;
  }

  public void setDatabaseType(DbType databaseType) {
     this.databaseType = databaseType;
  }

  public String getDrive() {
     return this.drive;
  }

  public void setDrive(String drive) {
     this.drive = drive;
  }

  public Integer getLogFileSizeMB() {
     return this.logFileSizeMB;
  }

  public void setLogFileSizeMB(Integer logFileSizeMB) {
     this.logFileSizeMB = logFileSizeMB;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }

  public Side getSide() {
     return this.side;
  }

  public void setSide(Side side) {
     this.side = side;
  }


  @Path("database")
  @XmlRootElement(name = "results")
  public static class DatabaseList extends BaseApiListBean<Database> {
    @XmlElementWrapper(name = "databases")
    @XmlElement(name = "database")
    public List<Database> getItems() {
      return items;
    }

    public void setItems(List<Database> items) {
      this.items = items;
    }
  }
}
