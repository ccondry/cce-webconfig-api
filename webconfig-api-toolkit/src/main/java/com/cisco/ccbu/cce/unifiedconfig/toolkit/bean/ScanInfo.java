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


public class ScanInfo extends BaseApiBean {
  private long lastScanDateTime;
  private ScanState scanState;

  public long getLastScanDateTime() {
     return this.lastScanDateTime;
  }

  public void setLastScanDateTime(long lastScanDateTime) {
     this.lastScanDateTime = lastScanDateTime;
  }

  public ScanState getScanState() {
     return this.scanState;
  }

  public void setScanState(ScanState scanState) {
     this.scanState = scanState;
  }


}
