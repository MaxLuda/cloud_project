package com.athome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixFeignMain8002 {
    public static void main(String[] args) {

        SpringApplication.run(OrderHystrixFeignMain8002.class);
    }
}