package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.opfab.users.model.RightsEnum;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComputedPerimeter
 */
@Validated

public interface ComputedPerimeter   {

  /**
   * Get process
   * @return process
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("process")  
  

  public String getProcess();
  public void setProcess(String process);

  /**
   * Get state
   * @return state
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("state")  
  

  public String getState();
  public void setState(String state);

  /**
   * Get rights
   * @return rights
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("rights")  
  
  @Valid

  public RightsEnum getRights();
  public void setRights(RightsEnum rights);
}

