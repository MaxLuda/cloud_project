package com.athome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain8007 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8007.class);
        System.out.println("Hello world!");
    }
}