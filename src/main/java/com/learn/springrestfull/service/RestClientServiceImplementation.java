package com.learn.springrestfull.service;

import com.learn.springrestfull.bean.WeatherBean;
import com.learn.springrestfull.entity.WeatherEntity;
import com.learn.springrestfull.exception.ResourceNotFoundException;
import com.learn.springrestfull.repository.WeatherDao;
import com.learn.springrestfull.utils.WebUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
//import jakarta.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.UriBuilderException;
import java.net.URI;
import java.util.Collections;
import java.util.Objects;

@Service
public class RestClientServiceImplementation implements RestClientService {
    @Autowired
    private WeatherDao weatherDao;

    @Autowired
    WebUtils webUtils;

    @Value("${My.RapidApi.Key}")
    private String KEY;
    @Value("${My.RapidApi.Host}")
    private String HOST;
    private static RestTemplate restTemplate = new RestTemplate();
    @Override
    public WeatherBean addWeatherDetails(String city, int empId, HttpServletRequest httpServletRequest) throws ResourceNotFoundException {
        WeatherBean total=null;
        try {
            //Collecting data from end-Point
            webUtils.setRequest(httpServletRequest);
            String Ipaddress = webUtils.getClientIp();
            URI uri = UriComponentsBuilder
                    .fromUriString("https://weatherapi-com.p.rapidapi.com/current.json")
                    .queryParam("q",city).build().toUri();
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", KEY);
            headers.set("X-RapidAPI-Host", HOST);
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<WeatherBean> totalBean = restTemplate
                    .exchange(uri, HttpMethod.GET, request,WeatherBean.class);
            //Saving to database
            WeatherEntity weatherEntity=new WeatherEntity();
            weatherEntity.setEmployeeId(empId);
            BeanUtils.copyProperties(Objects.requireNonNull(totalBean.getBody()),weatherEntity);
            weatherEntity.setEmployeeId(empId);
            weatherDao.save(weatherEntity);
            System.out.println("Added to the database");
            totalBean.getBody().setEmployeeId(empId);
            total = totalBean.getBody();
            System.out.println(total);
        } catch (UriBuilderException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e){
            throw new ResourceNotFoundException("No such data available");
        }
        return total;
    }
}
