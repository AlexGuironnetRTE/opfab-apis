package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Entity
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Entity   {
  private String id = null;

  private String name = null;

  private String description = null;

  private Boolean entityAllowedToSendCard = null;

  
  private List<String> parents = null;

  public Entity id(String id) {
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

  public Entity name(String name) {
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

  public Entity description(String description) {
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

  public Entity entityAllowedToSendCard(Boolean entityAllowedToSendCard) {
    this.entityAllowedToSendCard = entityAllowedToSendCard;
    return this;
  }

  /**
   * Get entityAllowedToSendCard
   * @return entityAllowedToSendCard
  **/
  //@ApiModelProperty(value = "")
  public Boolean getEntityAllowedToSendCard() {
    return entityAllowedToSendCard;
  }

  public void setEntityAllowedToSendCard(Boolean entityAllowedToSendCard) {
    this.entityAllowedToSendCard = entityAllowedToSendCard;
  }

  public Entity parents(List<String> parents) {
    this.parents = parents;
    return this;
  }

  public Entity addParentsItem(String parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<>();
    }
    this.parents.add(parentsItem);
    return this;
  }

  /**
   * Get parents
   * @return parents
  **/
  //@ApiModelProperty(value = "")
  public List<String> getParents() {
    return parents;
  }

  public void setParents(List<String> parents) {
    this.parents = parents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entity entity = (Entity) o;
    return Objects.equals(this.id, entity.id) &&
        Objects.equals(this.name, entity.name) &&
        Objects.equals(this.description, entity.description) &&
        Objects.equals(this.entityAllowedToSendCard, entity.entityAllowedToSendCard) &&
        Objects.equals(this.parents, entity.parents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, entityAllowedToSendCard, parents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAllowedToSendCard: ").append(toIndentedString(entityAllowedToSendCard)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
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

