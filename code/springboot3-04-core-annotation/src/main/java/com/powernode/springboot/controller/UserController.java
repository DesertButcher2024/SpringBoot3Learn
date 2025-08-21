package com.powernode.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    // 从spring的IoC容器中查找Date对象，注入到这里。
    @Autowired
    private Date date;

    @GetMapping("/hello")
    public String hello(){
        return date.toString();
    }
}
