package com.michael.pcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PclApplication {

    public static void main(String[] args) {
        SpringApplication.run(PclApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "OK!";
    }
}
