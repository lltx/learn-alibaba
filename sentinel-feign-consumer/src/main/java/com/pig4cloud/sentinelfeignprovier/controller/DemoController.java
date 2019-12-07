package com.pig4cloud.sentinelfeignprovier.controller;

import com.pig4cloud.sentinelfeignprovier.feign.DemoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2019-12-07
 */
@RestController
public class DemoController {
    @Autowired
    private DemoFeignClient feignClient;

    @GetMapping("/hello")
    public String hello() {
        return feignClient.feign();
    }
}
