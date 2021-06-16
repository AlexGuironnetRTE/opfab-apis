package org.opfab.cards.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Object representing a user connection (subscription)
 */
//@ApiModel(description = "Object representing a user connection (subscription)")


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Connection   {
  private String login = null;

  public Connection login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Login of user
   * @return login
  **/
  //@ApiModelProperty(value = "Login of user")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.login, connection.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
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

