package com.bigxigua.api;

import com.bigxigua.commons.BaseResponse;
import com.bigxigua.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: lzy
 * @Date: Created in 21:36 2018/1/15
 */
@Controller
public class TestApi {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public BaseResponse<Integer> test(String name) {
        int list = testService.test();
        return new BaseResponse(list);
        /*return "123";*/
    }
}
