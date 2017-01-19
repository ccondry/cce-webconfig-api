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


@XmlRootElement(name="importContact")
public class ImportContactRecord extends BaseApiBean {
  private String accountNumber;
  private int callResultOverall;
  private CallStatusEnum callStatusEnum;
  private int callsMade;
  private String correlationId;
  private ReferenceBean department;
  private String firstName;
  private Integer id;
  private Date importDate;
  private String lastName;
  private PhoneFields phone01Fields;
  private PhoneFields phone02Fields;
  private PhoneFields phone03Fields;
  private PhoneFields phone04Fields;
  private PhoneFields phone05Fields;
  private PhoneFields phone06Fields;
  private PhoneFields phone07Fields;
  private PhoneFields phone08Fields;
  private PhoneFields phone09Fields;
  private PhoneFields phone10Fields;
  private String refURL;

  public String getAccountNumber() {
     return this.accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
     this.accountNumber = accountNumber;
  }

  public int getCallResultOverall() {
     return this.callResultOverall;
  }

  public void setCallResultOverall(int callResultOverall) {
     this.callResultOverall = callResultOverall;
  }

  @XmlElement(name="callStatus")
  public CallStatusEnum getCallStatusEnum() {
     return this.callStatusEnum;
  }

  public void setCallStatusEnum(CallStatusEnum callStatusEnum) {
     this.callStatusEnum = callStatusEnum;
  }

  public int getCallsMade() {
     return this.callsMade;
  }

  public void setCallsMade(int callsMade) {
     this.callsMade = callsMade;
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

  public String getFirstName() {
     return this.firstName;
  }

  public void setFirstName(String firstName) {
     this.firstName = firstName;
  }

  public Integer getId() {
     return this.id;
  }

  public void setId(Integer id) {
     this.id = id;
  }

  public Date getImportDate() {
     return this.importDate;
  }

  public void setImportDate(Date importDate) {
     this.importDate = importDate;
  }

  public String getLastName() {
     return this.lastName;
  }

  public void setLastName(String lastName) {
     this.lastName = lastName;
  }

  @XmlElement(name="phone01")
  public PhoneFields getPhone01Fields() {
     return this.phone01Fields;
  }

  public void setPhone01Fields(PhoneFields phone01Fields) {
     this.phone01Fields = phone01Fields;
  }

  @XmlElement(name="phone02")
  public PhoneFields getPhone02Fields() {
     return this.phone02Fields;
  }

  public void setPhone02Fields(PhoneFields phone02Fields) {
     this.phone02Fields = phone02Fields;
  }

  @XmlElement(name="phone03")
  public PhoneFields getPhone03Fields() {
     return this.phone03Fields;
  }

  public void setPhone03Fields(PhoneFields phone03Fields) {
     this.phone03Fields = phone03Fields;
  }

  @XmlElement(name="phone04")
  public PhoneFields getPhone04Fields() {
     return this.phone04Fields;
  }

  public void setPhone04Fields(PhoneFields phone04Fields) {
     this.phone04Fields = phone04Fields;
  }

  @XmlElement(name="phone05")
  public PhoneFields getPhone05Fields() {
     return this.phone05Fields;
  }

  public void setPhone05Fields(PhoneFields phone05Fields) {
     this.phone05Fields = phone05Fields;
  }

  @XmlElement(name="phone06")
  public PhoneFields getPhone06Fields() {
     return this.phone06Fields;
  }

  public void setPhone06Fields(PhoneFields phone06Fields) {
     this.phone06Fields = phone06Fields;
  }

  @XmlElement(name="phone07")
  public PhoneFields getPhone07Fields() {
     return this.phone07Fields;
  }

  public void setPhone07Fields(PhoneFields phone07Fields) {
     this.phone07Fields = phone07Fields;
  }

  @XmlElement(name="phone08")
  public PhoneFields getPhone08Fields() {
     return this.phone08Fields;
  }

  public void setPhone08Fields(PhoneFields phone08Fields) {
     this.phone08Fields = phone08Fields;
  }

  @XmlElement(name="phone09")
  public PhoneFields getPhone09Fields() {
     return this.phone09Fields;
  }

  public void setPhone09Fields(PhoneFields phone09Fields) {
     this.phone09Fields = phone09Fields;
  }

  @XmlElement(name="phone10")
  public PhoneFields getPhone10Fields() {
     return this.phone10Fields;
  }

  public void setPhone10Fields(PhoneFields phone10Fields) {
     this.phone10Fields = phone10Fields;
  }

  public String getRefURL() {
     return this.refURL;
  }

  public void setRefURL(String refURL) {
     this.refURL = refURL;
  }


  @Path("import")
  @XmlRootElement(name = "results")
  public static class ImportContactRecordList extends BaseApiListBean<ImportContactRecord> {
    @XmlElementWrapper(name = "importContacts")
    @XmlElement(name = "importContact")
    public List<ImportContactRecord> getItems() {
      return items;
    }

    public void setItems(List<ImportContactRecord> items) {
      this.items = items;
    }
  }
}
