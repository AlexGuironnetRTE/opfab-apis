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
 * Configuration for Field to export
 */
//@ApiModel(description = "Configuration for Field to export")
@Validated

public interface MonitoringExportField   {

  /**
   * Name of the colum in export
   * @return columnName
  **/
//  @ApiModelProperty(value = "Name of the colum in export")
  @JsonProperty("columnName")  
  

  public String getColumnName();
  public void setColumnName(String columnName);

  /**
   * Name of the field corresponding to the column name
   * @return jsonField
  **/
//  @ApiModelProperty(value = "Name of the field corresponding to the column name")
  @JsonProperty("jsonField")  
  

  public String getJsonField();
  public void setJsonField(String jsonField);

  /**
   * Nested fields description
   * @return fields
  **/
//  @ApiModelProperty(value = "Nested fields description")
  @JsonProperty("fields")  
  
  @Valid

  public List<MonitoringExportField> getFields();
  public void setFields(List<MonitoringExportField> fields);
}

