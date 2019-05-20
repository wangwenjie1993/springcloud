package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-05-06 15:50
 **/
@RestController
public class WebController {

    @Value("${name}")
    private String name;

    @GetMapping("/getConfig")
    public String getConfig(){
        return name;
    }

}
