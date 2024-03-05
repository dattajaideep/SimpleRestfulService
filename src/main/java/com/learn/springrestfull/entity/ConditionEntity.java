package com.learn.springrestfull.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ConditionEntity")
public class ConditionEntity {
    @Id
    private String text;
    private String icon;
    private Integer code;
}
