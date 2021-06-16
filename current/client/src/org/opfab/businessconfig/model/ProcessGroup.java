package org.opfab.businessconfig.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Object containing a list of processes.
 */
//@ApiModel(description = "Object containing a list of processes.")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessGroup   {
  private String id = null;

  
  private List<String> processes = null;

  public ProcessGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the group
   * @return id
  **/
  //@ApiModelProperty(required = true, value = "Id of the group")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessGroup processes(List<String> processes) {
    this.processes = processes;
    return this;
  }

  public ProcessGroup addProcessesItem(String processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * List of processes included in the group
   * @return processes
  **/
  //@ApiModelProperty(value = "List of processes included in the group")
  public List<String> getProcesses() {
    return processes;
  }

  public void setProcesses(List<String> processes) {
    this.processes = processes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroup processGroup = (ProcessGroup) o;
    return Objects.equals(this.id, processGroup.id) &&
        Objects.equals(this.processes, processGroup.processes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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

