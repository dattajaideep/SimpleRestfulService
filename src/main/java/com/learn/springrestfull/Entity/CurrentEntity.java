package com.learn.springrestfull.Entity;

import com.learn.springrestfull.bean.ConditionBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "CurrentEntity")
public class CurrentEntity {
    @Id
    public Integer lastUpdatedEpoch;
    public String lastUpdated;
    public Double tempC;
    public Integer tempF;
    public ConditionBean condition;
    public Integer humidity;
    public Integer feelslikeC;
    public Integer feelslikeF;
    public Integer uv;
}
