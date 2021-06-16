package org.opfab.businessconfig.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessUiVisibility
 */
@Validated

public interface ProcessUiVisibility   {

  /**
   * If this flag is set to true, the cards of this process will be visible on the monitoring screen
   * @return monitoring
  **/
//  @ApiModelProperty(value = "If this flag is set to true, the cards of this process will be visible on the monitoring screen")
  @JsonProperty("monitoring")  
  

  public Boolean getMonitoring();
  public void setMonitoring(Boolean monitoring);

  /**
   * If this flag is set to true, the cards of this process will be visible on the logging screen
   * @return logging
  **/
//  @ApiModelProperty(value = "If this flag is set to true, the cards of this process will be visible on the logging screen")
  @JsonProperty("logging")  
  

  public Boolean getLogging();
  public void setLogging(Boolean logging);

  /**
   * If this flag is set to true, the cards of this process will be visible on the calendar screen
   * @return calendar
  **/
//  @ApiModelProperty(value = "If this flag is set to true, the cards of this process will be visible on the calendar screen")
  @JsonProperty("calendar")  
  

  public Boolean getCalendar();
  public void setCalendar(Boolean calendar);
}

