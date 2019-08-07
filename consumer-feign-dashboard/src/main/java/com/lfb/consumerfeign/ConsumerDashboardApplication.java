package com.lfb.consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashboardApplication.class, args);
    }


}
