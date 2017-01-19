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


public class ScriptSchedule extends BaseApiBean {
  private String baseUrl;
  private Integer day;
  private DayPosition dayPosition;
  private DayType dayType;
  private String description;
  private Date endDate;
  private Date endTime;
  private ReferenceBean masterScript;
  private Integer month;
  private ScheduleType scheduleType;
  private Date startDate;
  private Date startTime;
  private List<Integer> weekDays;

  public String getBaseUrl() {
     return this.baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
     this.baseUrl = baseUrl;
  }

  public Integer getDay() {
     return this.day;
  }

  public void setDay(Integer day) {
     this.day = day;
  }

  public DayPosition getDayPosition() {
     return this.dayPosition;
  }

  public void setDayPosition(DayPosition dayPosition) {
     this.dayPosition = dayPosition;
  }

  public DayType getDayType() {
     return this.dayType;
  }

  public void setDayType(DayType dayType) {
     this.dayType = dayType;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public Date getEndDate() {
     return this.endDate;
  }

  public void setEndDate(Date endDate) {
     this.endDate = endDate;
  }

  public Date getEndTime() {
     return this.endTime;
  }

  public void setEndTime(Date endTime) {
     this.endTime = endTime;
  }

  public ReferenceBean getMasterScript() {
     return this.masterScript;
  }

  public void setMasterScript(ReferenceBean masterScript) {
     this.masterScript = masterScript;
  }

  public Integer getMonth() {
     return this.month;
  }

  public void setMonth(Integer month) {
     this.month = month;
  }

  public ScheduleType getScheduleType() {
     return this.scheduleType;
  }

  public void setScheduleType(ScheduleType scheduleType) {
     this.scheduleType = scheduleType;
  }

  public Date getStartDate() {
     return this.startDate;
  }

  public void setStartDate(Date startDate) {
     this.startDate = startDate;
  }

  public Date getStartTime() {
     return this.startTime;
  }

  public void setStartTime(Date startTime) {
     this.startTime = startTime;
  }

  @XmlElementWrapper(name="weekDays")
  @XmlElement(name="weekDay")
  public List<Integer> getWeekDays() {
     return this.weekDays;
  }

  public void setWeekDays(List<Integer> weekDays) {
     this.weekDays = weekDays;
  }


}
