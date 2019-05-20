package com.springcloud.web.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @program: springcloud
 * @description: 熔断器demo
 * @author: wxhai
 * @create: 2019-03-01 10:37
 **/
@RestController
public class CircuitBreakerDemoController {

    @HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" , value = "100")
            },
            fallbackMethod = "fallbackForTest"
    )
    @GetMapping("/test")
    public String test() throws InterruptedException {
        int sleepTime = new Random().nextInt(200);
        System.out.println("服务执行时间" + sleepTime);
        Thread.sleep(sleepTime);
        return "服务执行成功";
    }

    public String fallbackForTest(){
        return "请求超时,进入熔断处理";
    }

}
