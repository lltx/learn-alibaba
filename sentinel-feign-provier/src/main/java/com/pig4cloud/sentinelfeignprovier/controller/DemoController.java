package com.pig4cloud.sentinelfeignprovier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2019-12-07
 */
@RestController
public class DemoController {

    @GetMapping("/feign")
    public String feign() {
        return "hello sentinel feign";
    }
}
