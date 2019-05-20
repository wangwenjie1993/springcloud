package com.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * Created by admin on 2019/3/6.
 */
public interface UserMessage {

    @Input("user-message-input-demo")
    MessageChannel input();

}
