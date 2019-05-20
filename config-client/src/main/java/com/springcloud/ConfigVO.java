package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-05-06 15:48
 **/
@Configuration
@ConfigurationProperties(prefix = "obj")
public class ConfigVO implements Serializable{

    private static final long serialVersionUID = -8336057971605068549L;
    private String name;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
