package com.powernode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 提醒：这个HelloController要想被spring容器管理，这个类所在的位置必须满足：和SpringBoot主入口程序在同级目录下，或者子目录下。
//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    //@ResponseBody
    public String hello(){
        return "Hello, SpringBoot3!";
    }

}
