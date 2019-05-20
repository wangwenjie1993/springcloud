package com.springcloud.web.controller;

import com.springcloud.IRemoteCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description: 服务提供方
 * @author: wxhai
 * @create: 2019-02-27 10:09
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private IRemoteCall iRemoteCall;

    @GetMapping(value = "/test")
    public String rpcTest(){
        System.out.print("服务调用成功,服务端口号为:" + serverPort);
        return "服务调用成功,服务端口号为:" + serverPort;
    }

    @GetMapping(value = "/httpServer")
    public String httpServer(@RequestParam(name = "param") String param){
       return iRemoteCall.remoteCallService(param);
    }



}
