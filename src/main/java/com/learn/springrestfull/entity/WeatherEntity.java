package com.learn.springrestfull.entity;

import com.learn.springrestfull.bean.CurrentBean;
import com.learn.springrestfull.bean.LocationBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "WeatherEntity")
public class WeatherEntity {
    @Id
    public int employeeId;
    private LocationBean location;
    private CurrentBean current;
}