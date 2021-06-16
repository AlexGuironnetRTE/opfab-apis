package org.opfab.cards.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object to represent a time with only hours and minutes
 */
//@ApiModel(description = "An object to represent a time with only hours and minutes")
@Validated

public interface HoursAndMinutes   {

  /**
   * Get hours
   * @return hours
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("hours")  
  

  public Integer getHours();
  public void setHours(Integer hours);

  /**
   * Get minutes
   * @return minutes
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("minutes")  
  

  public Integer getMinutes();
  public void setMinutes(Integer minutes);
}

