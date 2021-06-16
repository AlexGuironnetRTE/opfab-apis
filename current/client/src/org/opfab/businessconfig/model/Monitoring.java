package org.opfab.businessconfig.model;

import java.util.Objects;
import org.opfab.businessconfig.model.MonitoringExport;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Configuration for the monitoring screen
 */
//@ApiModel(description = "Configuration for the monitoring screen")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Monitoring   {
  private MonitoringExport export = null;

  public Monitoring export(MonitoringExport export) {
    this.export = export;
    return this;
  }

  /**
   * export configuration
   * @return export
  **/
  //@ApiModelProperty(value = "export configuration")
  public MonitoringExport getExport() {
    return export;
  }

  public void setExport(MonitoringExport export) {
    this.export = export;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monitoring monitoring = (Monitoring) o;
    return Objects.equals(this.export, monitoring.export);
  }

  @Override
  public int hashCode() {
    return Objects.hash(export);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monitoring {\n");
    
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
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

