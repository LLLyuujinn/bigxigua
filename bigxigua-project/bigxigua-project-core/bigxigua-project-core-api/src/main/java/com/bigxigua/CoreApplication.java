package com.bigxigua;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: lzy
 * @Date: Created in 22:03 2018/1/15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CoreApplication {
    private final static Logger logger = LoggerFactory.getLogger(CoreApplication.class);

    public static void main(String[] args) {
        logger.info("核心模块启动注册中心");
        long newDate=System.currentTimeMillis();
        SpringApplication.run(CoreApplication.class, args);
        logger.info("核心模块启动成功,耗时:"+(System.currentTimeMillis()-newDate)+"毫秒");
    }
}