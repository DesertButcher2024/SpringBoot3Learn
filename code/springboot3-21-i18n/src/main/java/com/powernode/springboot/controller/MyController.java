package com.powernode.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 在java程序当中获取属性资源文件中的配置信息。
// 获取国际化的信息。
@RestController
public class MyController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/test")
    public String getSource(HttpServletRequest request) {
        String message = messageSource.getMessage("welcome.message", null, request.getLocale());
        return message;
    }
}
