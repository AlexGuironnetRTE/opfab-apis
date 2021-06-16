package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.MonitoringExportField;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Configuration for Field to export
 */
//@ApiModel(description = "Configuration for Field to export")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MonitoringExportField   {
  private String columnName = null;

  private String jsonField = null;

  
  private List<MonitoringExportField> fields = null;

  public MonitoringExportField columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Name of the colum in export
   * @return columnName
  **/
  //@ApiModelProperty(value = "Name of the colum in export")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public MonitoringExportField jsonField(String jsonField) {
    this.jsonField = jsonField;
    return this;
  }

  /**
   * Name of the field corresponding to the column name
   * @return jsonField
  **/
  //@ApiModelProperty(value = "Name of the field corresponding to the column name")
  public String getJsonField() {
    return jsonField;
  }

  public void setJsonField(String jsonField) {
    this.jsonField = jsonField;
  }

  public MonitoringExportField fields(List<MonitoringExportField> fields) {
    this.fields = fields;
    return this;
  }

  public MonitoringExportField addFieldsItem(MonitoringExportField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Nested fields description
   * @return fields
  **/
  //@ApiModelProperty(value = "Nested fields description")
  public List<MonitoringExportField> getFields() {
    return fields;
  }

  public void setFields(List<MonitoringExportField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringExportField monitoringExportField = (MonitoringExportField) o;
    return Objects.equals(this.columnName, monitoringExportField.columnName) &&
        Objects.equals(this.jsonField, monitoringExportField.jsonField) &&
        Objects.equals(this.fields, monitoringExportField.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, jsonField, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringExportField {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    jsonField: ").append(toIndentedString(jsonField)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

