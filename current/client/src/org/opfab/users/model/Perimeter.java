package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.opfab.users.model.StateRight;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Perimeter
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Perimeter   {
  private String id = null;

  private String process = null;

  
  private List<StateRight> stateRights = null;

  public Perimeter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  //@ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Perimeter process(String process) {
    this.process = process;
    return this;
  }

  /**
   * Get process
   * @return process
  **/
  //@ApiModelProperty(value = "")
  public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public Perimeter stateRights(List<StateRight> stateRights) {
    this.stateRights = stateRights;
    return this;
  }

  public Perimeter addStateRightsItem(StateRight stateRightsItem) {
    if (this.stateRights == null) {
      this.stateRights = new ArrayList<>();
    }
    this.stateRights.add(stateRightsItem);
    return this;
  }

  /**
   * Get stateRights
   * @return stateRights
  **/
  //@ApiModelProperty(value = "")
  public List<StateRight> getStateRights() {
    return stateRights;
  }

  public void setStateRights(List<StateRight> stateRights) {
    this.stateRights = stateRights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perimeter perimeter = (Perimeter) o;
    return Objects.equals(this.id, perimeter.id) &&
        Objects.equals(this.process, perimeter.process) &&
        Objects.equals(this.stateRights, perimeter.stateRights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, process, stateRights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perimeter {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    stateRights: ").append(toIndentedString(stateRights)).append("\n");
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

