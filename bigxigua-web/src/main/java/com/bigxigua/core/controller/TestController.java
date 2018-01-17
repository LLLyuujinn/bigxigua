package com.bigxigua.core.controller;

import com.bigxigua.commons.BaseResponse;
import com.bigxigua.core.fallback.TestServiceHystrix;
import com.bigxigua.core.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: lzy
 * @Date: Created in 22:23 2018/1/17
 */
@Controller
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam(value = "name") String name) {
        logger.info("____name:"+name);
        return testService.test(name);
    }
}
