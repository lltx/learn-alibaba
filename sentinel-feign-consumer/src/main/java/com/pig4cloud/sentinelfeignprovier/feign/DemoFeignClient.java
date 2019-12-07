package com.pig4cloud.sentinelfeignprovier.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lengleng
 * @date 2019-12-07
 */
@FeignClient(value = "sentinel-feign-provider", fallback = DemoFeginClientFallback.class)
public interface DemoFeignClient {

    @GetMapping("/feign")
    String feign();
}
