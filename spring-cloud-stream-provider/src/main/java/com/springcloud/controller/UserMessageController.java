package com.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springcloud.domain.User;
import com.springcloud.stream.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-06 14:16
 **/
@RestController
public class UserMessageController {

    @Autowired
    private UserMessage userMessage;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping(value = "/userMessageProvider")
    public boolean userMessageProvider(User user) throws JsonProcessingException {
        System.out.println(" 消息生产方生产消息 message " + user);
        MessageChannel messageChannel = userMessage.output();
        String payload = objectMapper.writeValueAsString(user);
        GenericMessage<String> sendMessage = new GenericMessage<>(payload);
        // 发送消息
        return messageChannel.send(sendMessage);
    }


}
