package org.opfab.cards.publication.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * describes an i18n label
 */
//@ApiModel(description = "describes an i18n label")
@Validated

public interface I18n   {

  /**
   * i18n client side key
   * @return key
  **/
//  @ApiModelProperty(required = true, value = "i18n client side key")
  @JsonProperty("key")  
    @NotNull


  public String getKey();
  public void setKey(String key);

  /**
   * Optional parameters
   * @return parameters
  **/
//  @ApiModelProperty(value = "Optional parameters")
  @JsonProperty("parameters")  
  

  public Map<String, String> getParameters();
  public void setParameters(Map<String, String> parameters);
}

