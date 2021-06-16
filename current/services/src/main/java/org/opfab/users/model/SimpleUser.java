package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User (basic properties)
 */
//@ApiModel(description = "User (basic properties)")
@Validated

public interface SimpleUser   {

  /**
   * Get login
   * @return login
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("login")  
  

  public String getLogin();
  public void setLogin(String login);

  /**
   * Get firstName
   * @return firstName
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("firstName")  
  

  public String getFirstName();
  public void setFirstName(String firstName);

  /**
   * Get lastName
   * @return lastName
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("lastName")  
  

  public String getLastName();
  public void setLastName(String lastName);
}

