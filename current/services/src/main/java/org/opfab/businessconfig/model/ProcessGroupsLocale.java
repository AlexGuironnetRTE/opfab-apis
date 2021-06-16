package org.opfab.businessconfig.model;

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
 * ProcessGroupsLocale
 */
@Validated

public interface ProcessGroupsLocale   {

  /**
   * Get en
   * @return en
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("en")  
  

  public Map<String, String> getEn();
  public void setEn(Map<String, String> en);

  /**
   * Get fr
   * @return fr
  **/
//  @ApiModelProperty(value = "")
  @JsonProperty("fr")  
  

  public Map<String, String> getFr();
  public void setFr(Map<String, String> fr);
}

