package com.michael.pcl.service;

import com.michael.pcl.pojo.Weather;

import java.io.IOException;
import java.net.http.HttpResponse;


public interface WeatherService {
    /**
     * Get the result
     * @param uri
     * @return Weather
     */
    HttpResponse getResult(String uri) throws IOException, InterruptedException;
}