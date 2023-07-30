package com.learn.springrestfull.controller;

import com.learn.springrestfull.bean.WeatherBean;
import com.learn.springrestfull.exception.ResourceNotFoundException;
import com.learn.springrestfull.service.RestClientService;
import com.learn.springrestfull.utils.WebUtils;

//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RestClientController {
    @Autowired
    RestClientService restClientService;
    @Autowired
    WebUtils webUtils;
    @GetMapping("/employee/{city}")
    public ResponseEntity<WeatherBean> findWeather(@PathVariable("city") String city, @RequestParam int empId,
                                                   HttpServletRequest httpServletRequest) throws ResourceNotFoundException {
        WeatherBean msg=restClientService.addWeatherDetails(city,empId,httpServletRequest);
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }

}