package com.michael.pcl.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author: Michael
 * @create: 2022-12-19 14:04
 * @description: Weather Configuration
 **/
@Configuration
public class WeatherConfig {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Bean
    public RestTemplate restTemplate(){
        return restTemplateBuilder.build();
    }
}