package com.springcloud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-02-27 10:19
 **/
@RestController
public class RibbonDemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-provider.name}")
    private String serviceProviderName;

//    @Value("${spring-cloud-service-provider.ribbon.listOfServers}")
//    private String listOfServers;

    @GetMapping(value = "/test")
    public String test(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://"+serviceProviderName + "/test", String.class);
//        ResponseEntity<String> forEntity = restTemplate.getForEntity(listOfServers + "/test", String.class);
        return forEntity.toString();
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
