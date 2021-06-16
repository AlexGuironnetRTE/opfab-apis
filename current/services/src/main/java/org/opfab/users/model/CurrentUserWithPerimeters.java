package org.opfab.users.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.opfab.users.model.ComputedPerimeter;
import org.opfab.users.model.User;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the user connected and his perimeters
 */
//@ApiModel(description = "Information about the user connected and his perimeters")
@Validated

public interface CurrentUserWithPerimeters   {

  /**
   * Get userData
   * @return userData
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("userData")  
  
  @Valid

  public User getUserData();
  public void setUserData(User userData);

  /**
   * Get computedPerimeters
   * @return computedPerimeters
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("computedPerimeters")  
  
  @Valid

  public List<ComputedPerimeter> getComputedPerimeters();
  public void setComputedPerimeters(List<ComputedPerimeter> computedPerimeters);

  /**
   * Filters on processes and states for user feed (exclusion filter)
   * @return processesStatesNotNotified
  **/
//  @ApiModelProperty(value = "Filters on processes and states for user feed (exclusion filter)")
  @JsonProperty("processesStatesNotNotified")  
  
  @Valid

  public Map<String, List<String>> getProcessesStatesNotNotified();
  public void setProcessesStatesNotNotified(Map<String, List<String>> processesStatesNotNotified);
}

