package org.opfab.users.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * User
 */
//@ApiModel(description = "User")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class User   {
  private String login = null;

  private String firstName = null;

  private String lastName = null;

  
  private List<String> groups = null;

  
  private List<String> entities = null;

  
  private List<String> authorizedIPAddresses = null;

  public User login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  **/
  //@ApiModelProperty(required = true, value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  //@ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  //@ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public User addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  **/
  //@ApiModelProperty(value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public User entities(List<String> entities) {
    this.entities = entities;
    return this;
  }

  public User addEntitiesItem(String entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Get entities
   * @return entities
  **/
  //@ApiModelProperty(value = "")
  public List<String> getEntities() {
    return entities;
  }

  public void setEntities(List<String> entities) {
    this.entities = entities;
  }

  public User authorizedIPAddresses(List<String> authorizedIPAddresses) {
    this.authorizedIPAddresses = authorizedIPAddresses;
    return this;
  }

  public User addAuthorizedIPAddressesItem(String authorizedIPAddressesItem) {
    if (this.authorizedIPAddresses == null) {
      this.authorizedIPAddresses = new ArrayList<>();
    }
    this.authorizedIPAddresses.add(authorizedIPAddressesItem);
    return this;
  }

  /**
   * Get authorizedIPAddresses
   * @return authorizedIPAddresses
  **/
  //@ApiModelProperty(value = "")
  public List<String> getAuthorizedIPAddresses() {
    return authorizedIPAddresses;
  }

  public void setAuthorizedIPAddresses(List<String> authorizedIPAddresses) {
    this.authorizedIPAddresses = authorizedIPAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.login, user.login) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.entities, user.entities) &&
        Objects.equals(this.authorizedIPAddresses, user.authorizedIPAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, firstName, lastName, groups, entities, authorizedIPAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    authorizedIPAddresses: ").append(toIndentedString(authorizedIPAddresses)).append("\n");
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

