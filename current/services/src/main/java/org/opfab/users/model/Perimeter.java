package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.users.model.StateRight;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Perimeter
 */
@Validated

public interface Perimeter   {

  /**
   * Get id
   * @return id
  **/
//  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")  
    @NotNull


  public String getId();
  public void setId(String id);

  /**
   * Get process
   * @return process
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("process")  
  

  public String getProcess();
  public void setProcess(String process);

  /**
   * Get stateRights
   * @return stateRights
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("stateRights")  
  
  @Valid

  public List<StateRight> getStateRights();
  public void setStateRights(List<StateRight> stateRights);
}

