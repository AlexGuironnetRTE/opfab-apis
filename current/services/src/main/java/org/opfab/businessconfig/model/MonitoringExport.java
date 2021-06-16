package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.MonitoringExportField;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configuration for the export feature in the monitoring screen
 */
//@ApiModel(description = "Configuration for the export feature in the monitoring screen")
@Validated

public interface MonitoringExport   {

  /**
   * Get fields
   * @return fields
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("fields")  
  
  @Valid

  public List<MonitoringExportField> getFields();
  public void setFields(List<MonitoringExportField> fields);
}

