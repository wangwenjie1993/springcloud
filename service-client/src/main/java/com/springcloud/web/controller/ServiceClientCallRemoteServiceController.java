package com.springcloud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description: 服务客户端
 * @author: wxhai
 * @create: 2019-03-01 13:42
 **/
@RestController
public class ServiceClientCallRemoteServiceController {

    @Autowired
    private ClientCall clientCall;

    @GetMapping(value = "/clientCall")
    public String testRmi(@RequestParam(name = "param" ) String param){
        return clientCall.remoteCallClient(param);
    }

}
