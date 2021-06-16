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
 * Object containing a list of processes.
 */
//@ApiModel(description = "Object containing a list of processes.")
@Validated

public interface ProcessGroup   {

  /**
   * Id of the group
   * @return id
  **/
//  @ApiModelProperty(required = true, value = "Id of the group")
  @JsonProperty("id")  
    @NotNull


  public String getId();
  public void setId(String id);

  /**
   * List of processes included in the group
   * @return processes
  **/
//  @ApiModelProperty(value = "List of processes included in the group")
  @JsonProperty("processes")  
  

  public List<String> getProcesses();
  public void setProcesses(List<String> processes);
}

