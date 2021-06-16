package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.opfab.businessconfig.model.ProcessStates;
import org.opfab.businessconfig.model.ProcessUiVisibility;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Business process definition, also listing available resources
 */
//@ApiModel(description = "Business process definition, also listing available resources")
@Validated

public interface Process   {

  /**
   * Identifier referencing this process. It should be unique across the OperatorFabric instance.
   * @return id
  **/
//  @ApiModelProperty(required = true, value = "Identifier referencing this process. It should be unique across the OperatorFabric instance.")
  @JsonProperty("id")  
    @NotNull


  public String getId();
  public void setId(String id);

  /**
   * i18n key for the label of this process The value attached to this key should be defined in each XX.json file in the i18n folder of the bundle (where XX stands for the locale iso code, for example 'EN')
   * @return name
  **/
//  @ApiModelProperty(value = "i18n key for the label of this process The value attached to this key should be defined in each XX.json file in the i18n folder of the bundle (where XX stands for the locale iso code, for example 'EN')")
  @JsonProperty("name")  
  

  public String getName();
  public void setName(String name);

  /**
   * Process configuration version
   * @return version
  **/
//  @ApiModelProperty(required = true, value = "Process configuration version")
  @JsonProperty("version")  
    @NotNull


  public String getVersion();
  public void setVersion(String version);

  /**
   * Get states
   * @return states
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("states")  
  
  @Valid

  public Map<String, ProcessStates> getStates();
  public void setStates(Map<String, ProcessStates> states);

  /**
   * Get uiVisibility
   * @return uiVisibility
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("uiVisibility")  
  
  @Valid

  public ProcessUiVisibility getUiVisibility();
  public void setUiVisibility(ProcessUiVisibility uiVisibility);
}

