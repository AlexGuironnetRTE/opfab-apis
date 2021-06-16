package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.opfab.businessconfig.model.MonitoringExport;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configuration for the monitoring screen
 */
//@ApiModel(description = "Configuration for the monitoring screen")
@Validated

public interface Monitoring   {

  /**
   * export configuration
   * @return export
  **/
//  @ApiModelProperty(value = "export configuration")
  @JsonProperty("export")  
  
  @Valid

  public MonitoringExport getExport();
  public void setExport(MonitoringExport export);
}

