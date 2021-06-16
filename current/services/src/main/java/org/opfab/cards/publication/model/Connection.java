package org.opfab.cards.publication.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object representing a user connection (subscription)
 */
//@ApiModel(description = "Object representing a user connection (subscription)")
@Validated

public interface Connection   {

  /**
   * Login of user
   * @return login
  **/
//  @ApiModelProperty(value = "Login of user")
  @JsonProperty("login")  
  

  public String getLogin();
  public void setLogin(String login);
}

