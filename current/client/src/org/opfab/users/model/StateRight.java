package org.opfab.users.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * StateRight
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class StateRight   {
  private String state = null;

  private org.opfab.users.model.RightsEnum right = null;

  public StateRight state(String state) {
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

  public StateRight right(org.opfab.users.model.RightsEnum right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   * @return right
  **/
  //@ApiModelProperty(value = "")
  public org.opfab.users.model.RightsEnum getRight() {
    return right;
  }

  public void setRight(org.opfab.users.model.RightsEnum right) {
    this.right = right;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateRight stateRight = (StateRight) o;
    return Objects.equals(this.state, stateRight.state) &&
        Objects.equals(this.right, stateRight.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, right);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateRight {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

