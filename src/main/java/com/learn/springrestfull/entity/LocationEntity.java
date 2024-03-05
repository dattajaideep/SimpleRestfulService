package com.learn.springrestfull.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "LocationEntity")
public class LocationEntity {
    @Id
    public String name;
    public String region;
    public String country;
    public Double lat;
    public Double lon;
    public String tzId;
    public Integer localtimeEpoch;
    public String localtime;
}
