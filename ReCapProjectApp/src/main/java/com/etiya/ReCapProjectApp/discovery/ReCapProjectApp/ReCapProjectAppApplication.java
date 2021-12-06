package com.etiya.ReCapProjectApp.discovery.ReCapProjectApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReCapProjectAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReCapProjectAppApplication.class, args);
    }

}
