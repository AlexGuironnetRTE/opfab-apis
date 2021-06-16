package org.opfab.users.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * ComputedPerimeter
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComputedPerimeter   {
  private String process = null;

  private String state = null;

  private org.opfab.users.model.RightsEnum rights = null;

  public ComputedPerimeter process(String process) {
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

  public ComputedPerimeter state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  //@ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ComputedPerimeter rights(org.opfab.users.model.RightsEnum rights) {
    this.rights = rights;
    return this;
  }

  /**
   * Get rights
   * @return rights
  **/
  //@ApiModelProperty(value = "")
  public org.opfab.users.model.RightsEnum getRights() {
    return rights;
  }

  public void setRights(org.opfab.users.model.RightsEnum rights) {
    this.rights = rights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputedPerimeter computedPerimeter = (ComputedPerimeter) o;
    return Objects.equals(this.process, computedPerimeter.process) &&
        Objects.equals(this.state, computedPerimeter.state) &&
        Objects.equals(this.rights, computedPerimeter.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(process, state, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputedPerimeter {\n");
    
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

