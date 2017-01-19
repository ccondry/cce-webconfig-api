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


@Path("/pqsteppreview")
@XmlRootElement(name="pqStepPreview")
public class PrecisionQueueStepPreview extends BaseApiBean {
  private Integer agentCount;
  private Integer changeStamp;
  private String correlationId;
  private ReferenceBean department;
  private Step step;

  @XmlElement(name="agentCount")
  public Integer getAgentCount() {
     return this.agentCount;
  }

  public void setAgentCount(Integer agentCount) {
     this.agentCount = agentCount;
  }

  public Integer getChangeStamp() {
     return this.changeStamp;
  }

  public void setChangeStamp(Integer changeStamp) {
     this.changeStamp = changeStamp;
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

  public Step getStep() {
     return this.step;
  }

  public void setStep(Step step) {
     this.step = step;
  }


  @Path("/pqsteppreview")
  @XmlRootElement(name = "results")
  public static class PrecisionQueueStepPreviewList extends BaseApiListBean<PrecisionQueueStepPreview> {
    @XmlElementWrapper(name = "pqStepPreviews")
    @XmlElement(name = "pqStepPreview")
    public List<PrecisionQueueStepPreview> getItems() {
      return items;
    }

    public void setItems(List<PrecisionQueueStepPreview> items) {
      this.items = items;
    }
  }
}
