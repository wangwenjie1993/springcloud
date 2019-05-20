package com.springboot.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-07 09:37
 **/
@Service
@RabbitListener(queues = "queueDirectOrderChange")
public class MessageConsumer {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("消息消费者【hello】 : " + hello);
    }

}
