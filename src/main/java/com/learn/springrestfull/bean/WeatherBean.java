package com.learn.springrestfull.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "location",
        "current"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherBean {
    @JsonProperty("location")
    public LocationBean location;
    @JsonProperty("current")
    public CurrentBean current;
    public int employeeId;
}
