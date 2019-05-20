package com.springcloud.stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;
import java.io.IOException;


/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-06 14:22
 **/
@Service
public class UserMessageService {

    @Autowired
    private UserMessage userMessage;

    @Autowired
    private ObjectMapper objectMapper;

    @ServiceActivator(inputChannel = "user-message-input-demo")
    public void listen(byte[] data) throws IOException {
        System.out.println("Subscribe by @ServiceActivator");
        User message = objectMapper.readValue(data, User.class);
        System.out.println("消息消费方收到消息 +   message" + message);
    }

    @StreamListener("user-message-input-demo")
    public void onMessage(byte[] data) throws IOException {
        System.out.println("Subscribe by @StreamListener");
        User message = objectMapper.readValue(data, User.class);
        System.out.println("消息消费方收到消息 +   message" + message);
    }
}
