package com.powernode.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SystemService {
    @Value("${myapp.username}")
    private String username;

    @Value("${myapp.email}")
    private String email;

    // 注意：当使用 @Value注解的时候，如果这个key不存在，并且没有指定默认值，则报错。
    //@Value("${myapp.age}")
    @Value("${myapp.age:50}")
    private Integer age;

    public void printInfo(){
        System.out.println(username);
        System.out.println(email);
        System.out.println(age);
    }

}
