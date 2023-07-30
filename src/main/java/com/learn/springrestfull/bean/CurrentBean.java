package com.learn.springrestfull.bean;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "last_updated_epoch",
        "last_updated",
        "temp_c",
        "temp_f",
        "condition",
        "humidity",
        "feelslike_c",
        "feelslike_f",
        "uv"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentBean {
    @JsonProperty("last_updated_epoch")
    public Integer lastUpdatedEpoch;
    @JsonProperty("last_updated")
    public String lastUpdated;
    @JsonProperty("temp_c")
    public Double tempC;
    @JsonProperty("temp_f")
    public Integer tempF;
    @JsonProperty("condition")
    public ConditionBean condition;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("feelslike_c")
    public Integer feelslikeC;
    @JsonProperty("feelslike_f")
    public Integer feelslikeF;
    @JsonProperty("uv")
    public Integer uv;
}
