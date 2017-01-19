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


public class CampaignCPAFields extends BaseApiBean {
  private Integer analysisPeriod;
  private Boolean enableRecordWaveFile;
  private Boolean enabled;
  private Integer maxTermToneAnalysis;
  private Integer maxTimeAnalysis;
  private Integer minSilencePeriod;
  private Integer minimumValidSpeech;

  public Integer getAnalysisPeriod() {
     return this.analysisPeriod;
  }

  public void setAnalysisPeriod(Integer analysisPeriod) {
     this.analysisPeriod = analysisPeriod;
  }

  @XmlElement(name="record")
  public Boolean getEnableRecordWaveFile() {
     return this.enableRecordWaveFile;
  }

  public void setEnableRecordWaveFile(Boolean enableRecordWaveFile) {
     this.enableRecordWaveFile = enableRecordWaveFile;
  }

  public Boolean getEnabled() {
     return this.enabled;
  }

  public void setEnabled(Boolean enabled) {
     this.enabled = enabled;
  }

  public Integer getMaxTermToneAnalysis() {
     return this.maxTermToneAnalysis;
  }

  public void setMaxTermToneAnalysis(Integer maxTermToneAnalysis) {
     this.maxTermToneAnalysis = maxTermToneAnalysis;
  }

  public Integer getMaxTimeAnalysis() {
     return this.maxTimeAnalysis;
  }

  public void setMaxTimeAnalysis(Integer maxTimeAnalysis) {
     this.maxTimeAnalysis = maxTimeAnalysis;
  }

  public Integer getMinSilencePeriod() {
     return this.minSilencePeriod;
  }

  public void setMinSilencePeriod(Integer minSilencePeriod) {
     this.minSilencePeriod = minSilencePeriod;
  }

  public Integer getMinimumValidSpeech() {
     return this.minimumValidSpeech;
  }

  public void setMinimumValidSpeech(Integer minimumValidSpeech) {
     this.minimumValidSpeech = minimumValidSpeech;
  }


}
