package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.opfab.businessconfig.model.ProcessGroup;
import org.opfab.businessconfig.model.ProcessGroupsLocale;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessGroups
 */
@Validated

public interface ProcessGroups   {

  /**
   * Get groups
   * @return groups
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("groups")  
  
  @Valid

  public List<ProcessGroup> getGroups();
  public void setGroups(List<ProcessGroup> groups);

  /**
   * Get locale
   * @return locale
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("locale")  
  
  @Valid

  public ProcessGroupsLocale getLocale();
  public void setLocale(ProcessGroupsLocale locale);
}

