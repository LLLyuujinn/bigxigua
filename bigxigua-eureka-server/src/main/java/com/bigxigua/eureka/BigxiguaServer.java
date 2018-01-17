package com.bigxigua.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BigxiguaServer {
    private final static Logger logger = LoggerFactory.getLogger(BigxiguaServer.class);
    public static void main(String args[]){
        logger.info("开始启动注册中心");
        long newDate=System.currentTimeMillis();
        new SpringApplicationBuilder(BigxiguaServer.class).web(true).run(args);
        logger.info("注册中心启动成功,耗时:"+(System.currentTimeMillis()-newDate)+"毫秒");
    }
}
