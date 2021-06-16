package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object containing the id of the recipient entity and an optional list of connection levels  with 0 meaning the entity itself, 1 for first level children, 2 for 2nd level connections, etc.
 */
//@ApiModel(description = "Object containing the id of the recipient entity and an optional list of connection levels  with 0 meaning the entity itself, 1 for first level children, 2 for 2nd level connections, etc.")
@Validated

public interface Recipient   {

  /**
   * Get id
   * @return id
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("id")  
  

  public String getId();
  public void setId(String id);

  /**
   * Get levels
   * @return levels
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("levels")  
  

  public List<Integer> getLevels();
  public void setLevels(List<Integer> levels);
}

