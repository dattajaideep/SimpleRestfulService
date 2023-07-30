package com.learn.springrestfull.repository;

import com.learn.springrestfull.Entity.WeatherEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherDao extends MongoRepository<WeatherEntity,Integer> {

}
