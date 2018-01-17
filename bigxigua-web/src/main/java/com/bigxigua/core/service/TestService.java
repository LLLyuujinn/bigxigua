package com.bigxigua.core.service;

import com.bigxigua.core.fallback.TestServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: lzy
 * @Date: Created in 22:24 2018/1/17
 */
@FeignClient(value="BIGXIGUA-CORE",fallback=TestServiceHystrix.class)
public interface TestService {

    @RequestMapping(value = "/test")
    public String test(@RequestParam(value = "name") String name);
}
