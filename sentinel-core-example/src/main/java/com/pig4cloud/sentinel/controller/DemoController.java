/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.pig4cloud.sentinel.config.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2019-12-04
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello sentinel";
    }

    @GetMapping("/resource")
    @SentinelResource(value = "hello2", blockHandler = "exHandler", blockHandlerClass = {ExceptionUtil.class})
    public String resource() {
        return "hello resource";
    }


}
