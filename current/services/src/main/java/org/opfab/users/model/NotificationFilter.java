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
 * NotificationFilter
 */
@Validated

public interface NotificationFilter   {

  /**
   * Get process
   * @return process
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("process")  
  

  public String getProcess();
  public void setProcess(String process);

  /**
   * Get states
   * @return states
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("states")  
  

  public List<String> getStates();
  public void setStates(List<String> states);
}

