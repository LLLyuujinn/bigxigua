package com.bigxigua.core.service.impl;

import com.bigxigua.mapper.TestMapper;
import com.bigxigua.core.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService{

    @Resource
    private TestMapper testMapper;

    @Override
    public int test() {
        return testMapper.test();
    }
}
