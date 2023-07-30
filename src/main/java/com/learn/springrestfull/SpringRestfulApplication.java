package com.learn.springrestfull;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableEurekaClient
@EnableEncryptableProperties
public class SpringRestfulApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulApplication.class, args);
		System.out.println("Service Started");
	}

}
