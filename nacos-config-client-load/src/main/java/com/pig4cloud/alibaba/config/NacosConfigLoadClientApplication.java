package com.pig4cloud.alibaba.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigLoadClientApplication {

    public static void main(String[] args) {


        SpringApplication.run(NacosConfigLoadClientApplication.class, args);
    }

}
