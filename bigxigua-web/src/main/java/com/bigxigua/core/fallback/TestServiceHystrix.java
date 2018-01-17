package com.bigxigua.core.fallback;

import com.bigxigua.core.service.TestService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: lzy
 * @Date: Created in 22:24 2018/1/17
 */
@Component
public class TestServiceHystrix implements TestService {


    @Override
    public String test(@RequestParam(value = "name") String name) {
        return "你好，"+name+"spring-cloud-test-feign容错提示：bigxigua-core服务系统发生了错误！";
    }
}
