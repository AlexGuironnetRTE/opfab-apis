package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.MonitoringExportField;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Configuration for the export feature in the monitoring screen
 */
//@ApiModel(description = "Configuration for the export feature in the monitoring screen")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MonitoringExport   {
  
  private List<MonitoringExportField> fields = null;

  public MonitoringExport fields(List<MonitoringExportField> fields) {
    this.fields = fields;
    return this;
  }

  public MonitoringExport addFieldsItem(MonitoringExportField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  **/
  //@ApiModelProperty(value = "")
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
    MonitoringExport monitoringExport = (MonitoringExport) o;
    return Objects.equals(this.fields, monitoringExport.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringExport {\n");
    
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

