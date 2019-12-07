package com.pig4cloud.sentinelfeignprovier;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class SentinelFeignProvierApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignProvierApplication.class, args);
    }

}
