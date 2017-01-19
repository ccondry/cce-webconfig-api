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


public class Timestamp extends BaseApiBean {
  private int date;
  private int hours;
  private int minutes;
  private int month;
  private int nanos;
  private int seconds;
  private long time;
  private int year;

  public int getDate() {
     return this.date;
  }

  public void setDate(int date) {
     this.date = date;
  }

  public int getHours() {
     return this.hours;
  }

  public void setHours(int hours) {
     this.hours = hours;
  }

  public int getMinutes() {
     return this.minutes;
  }

  public void setMinutes(int minutes) {
     this.minutes = minutes;
  }

  public int getMonth() {
     return this.month;
  }

  public void setMonth(int month) {
     this.month = month;
  }

  public int getNanos() {
     return this.nanos;
  }

  public void setNanos(int nanos) {
     this.nanos = nanos;
  }

  public int getSeconds() {
     return this.seconds;
  }

  public void setSeconds(int seconds) {
     this.seconds = seconds;
  }

  public long getTime() {
     return this.time;
  }

  public void setTime(long time) {
     this.time = time;
  }

  public int getYear() {
     return this.year;
  }

  public void setYear(int year) {
     this.year = year;
  }


}
