package io.lindx.boot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class User {
  private Long id;

  @JsonProperty("user_name")
  private String name;
}
