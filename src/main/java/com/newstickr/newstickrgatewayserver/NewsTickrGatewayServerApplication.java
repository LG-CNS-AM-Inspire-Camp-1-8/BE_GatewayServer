package com.newstickr.newstickrgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NewsTickrGatewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsTickrGatewayServerApplication.class, args);
    }

}
