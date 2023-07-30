package com.learn.springrestfull.bean;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "text",
        "icon",
        "code"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConditionBean {
    @JsonProperty("text")
    public String text;
    @JsonProperty("icon")
    public String icon;
    @JsonProperty("code")
    public Integer code;
}
