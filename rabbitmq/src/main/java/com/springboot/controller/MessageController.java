package com.springboot.controller;

import com.springboot.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-07 09:42
 **/
@RestController
public class MessageController {

    @Autowired
    private MessageProvider messageProvider;

    @GetMapping("messageSend")
    public String messageSend(String message){
        messageProvider.send(message);
        return "生产者 生产消息";
    }

}
