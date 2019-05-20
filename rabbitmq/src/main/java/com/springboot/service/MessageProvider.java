package com.springboot.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-07 09:37
 **/
@Service
public class MessageProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private RabbitTemplate rabbitTemplate;

    public void send(String message){
        rabbitTemplate.convertAndSend("queueDirectOrderChange","hello  ............." +message);
    }

}
