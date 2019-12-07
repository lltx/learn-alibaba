package com.pig4cloud.sentinelfeignprovier.feign;

import org.springframework.stereotype.Component;

/**
 * @author lengleng
 * @date 2019-12-07
 */
@Component
public class DemoFeginClientFallback implements DemoFeignClient {
    @Override
    public String feign() {
        return "error";
    }
}
