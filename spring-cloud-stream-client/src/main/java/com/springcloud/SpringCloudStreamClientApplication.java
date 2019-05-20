package com.springcloud;

import com.springcloud.stream.UserMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(UserMessage.class)
public class SpringCloudStreamClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamClientApplication.class, args);
	}

}
