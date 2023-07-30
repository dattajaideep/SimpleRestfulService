package com.learn.springrestfull.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI swaggerOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Weather-Service Swagger")
                        .description("""
                                Weather_Service for any Service.\s

                                Some Useful Links\s
                                - [Using WeatherAPI from RapidAPI(View Analytics)](https://rapidapi.com/developer/dashboard)""")
                        .version("1.0"));
    }
}
