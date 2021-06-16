package org.opfab.users.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * User (basic properties)
 */
//@ApiModel(description = "User (basic properties)")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimpleUser   {
  private String login = null;

  private String firstName = null;

  private String lastName = null;

  public SimpleUser login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  **/
  //@ApiModelProperty(value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public SimpleUser firstName(String firstName) {
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

  public SimpleUser lastName(String lastName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleUser simpleUser = (SimpleUser) o;
    return Objects.equals(this.login, simpleUser.login) &&
        Objects.equals(this.firstName, simpleUser.firstName) &&
        Objects.equals(this.lastName, simpleUser.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleUser {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

