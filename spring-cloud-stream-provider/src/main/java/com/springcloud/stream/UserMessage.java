package com.springcloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-06 14:09
 **/
public interface UserMessage {

    String OUTPUT = "user-message-output-demo";

    @Output(OUTPUT)
    SubscribableChannel output();

}
