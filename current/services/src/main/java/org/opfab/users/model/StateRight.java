package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.opfab.users.model.RightsEnum;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StateRight
 */
@Validated

public interface StateRight   {

  /**
   * Get state
   * @return state
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("state")  
  

  public String getState();
  public void setState(String state);

  /**
   * Get right
   * @return right
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("right")  
  
  @Valid

  public RightsEnum getRight();
  public void setRight(RightsEnum right);
}

