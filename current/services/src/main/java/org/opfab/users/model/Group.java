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
 * Group
 */
@Validated

public interface Group   {

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
   * Get name
   * @return name
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("name")  
  

  public String getName();
  public void setName(String name);

  /**
   * Get description
   * @return description
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("description")  
  

  public String getDescription();
  public void setDescription(String description);

  /**
   * Get perimeters
   * @return perimeters
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("perimeters")  
  

  public List<String> getPerimeters();
  public void setPerimeters(List<String> perimeters);
}

