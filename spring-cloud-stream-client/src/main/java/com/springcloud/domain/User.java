package com.springcloud.domain;

import java.io.Serializable;

/**
 * @program: springcloud
 * @description:
 * @author: wxhai
 * @create: 2019-03-07 10:48
 **/
public class User implements Serializable{
    private static final long serialVersionUID = -5868274326912629975L;
    private Integer id;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
