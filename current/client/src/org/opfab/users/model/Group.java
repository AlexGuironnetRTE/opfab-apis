package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Group
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Group   {
  private String id = null;

  private String name = null;

  private String description = null;

  
  private List<String> perimeters = null;

  public Group id(String id) {
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

  public Group name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  //@ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  //@ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Group perimeters(List<String> perimeters) {
    this.perimeters = perimeters;
    return this;
  }

  public Group addPerimetersItem(String perimetersItem) {
    if (this.perimeters == null) {
      this.perimeters = new ArrayList<>();
    }
    this.perimeters.add(perimetersItem);
    return this;
  }

  /**
   * Get perimeters
   * @return perimeters
  **/
  //@ApiModelProperty(value = "")
  public List<String> getPerimeters() {
    return perimeters;
  }

  public void setPerimeters(List<String> perimeters) {
    this.perimeters = perimeters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.perimeters, group.perimeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, perimeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    perimeters: ").append(toIndentedString(perimeters)).append("\n");
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

