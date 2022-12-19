package com.michael.pcl.controller;

import com.michael.pcl.pojo.Weather;
import com.michael.pcl.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.http.HttpResponse;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    public String getUrl(Integer year){
        return "https://weather.visualcrossing.com/" +
                "VisualCrossingWebServices/rest/services/timeline/" +
                "280%20Vanderbilt%20Beach%20Rd%2C%20Naples%2C%20FL%2034108/" +
                + year + "-12-11/" + year + "-12-15" +
                "?unitGroup=metric&include=days&key=JSU4FDB6ZE6EN59D753EPKHJG&contentType=json";
    }
    @GetMapping(value = "/result")
    public HttpResponse getWeather() throws IOException, InterruptedException {
        return weatherService.getResult(getUrl(2022));
    }
}