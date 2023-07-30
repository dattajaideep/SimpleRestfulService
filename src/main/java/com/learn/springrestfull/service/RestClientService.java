package com.learn.springrestfull.service;

import com.learn.springrestfull.bean.WeatherBean;
import com.learn.springrestfull.exception.ResourceNotFoundException;
//import jakarta.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;

public interface RestClientService {
    public WeatherBean addWeatherDetails(String city, int empId, HttpServletRequest httpServletRequest) throws ResourceNotFoundException;
}
