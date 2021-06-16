package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
//@ApiModel(description = "User")
@Validated

public interface User   {

  /**
   * Get login
   * @return login
  **/
//  @ApiModelProperty(required = true, value = "")
  @JsonProperty("login")  
    @NotNull


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

  /**
   * Get groups
   * @return groups
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("groups")  
  

  public List<String> getGroups();
  public void setGroups(List<String> groups);

  /**
   * Get entities
   * @return entities
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("entities")  
  

  public List<String> getEntities();
  public void setEntities(List<String> entities);

  /**
   * Get authorizedIPAddresses
   * @return authorizedIPAddresses
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("authorizedIPAddresses")  
  

  public List<String> getAuthorizedIPAddresses();
  public void setAuthorizedIPAddresses(List<String> authorizedIPAddresses);
}

