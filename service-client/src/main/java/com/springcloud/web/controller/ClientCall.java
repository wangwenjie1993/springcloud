package com.springcloud.web.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2019/3/1.
 */
@FeignClient(name = "feign-client-demo",url = "localhost:7071")
public interface ClientCall {

    @GetMapping("/httpServer")
    String remoteCallClient(@RequestParam(name = "param") String param);

}
