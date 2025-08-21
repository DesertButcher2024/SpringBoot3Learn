package com.powernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController // 对于响应json使用的。
@Controller
public class HelloController {

    // http://localhost:8080/hello?name=jackson
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name, Model model, @RequestParam("flag") Integer flag) {
        // 将数据存储到域对象当中
        model.addAttribute("name", name);
        // 向域对象当中绑定一段html代码
        model.addAttribute("htmlCode", "<a href='http://www.bjpowernode.com'>动力节点</a>");
        // 向域对象当中绑定公司名和公司地址
        model.addAttribute("company", "动力节点");
        model.addAttribute("companyUrl", "http://www.bjpowernode.com");
        // 向域对象中存储一个样式
        model.addAttribute("style", "color:red");
        // 根据flag向域对象当中存储数据
        if(1 == flag){
            model.addAttribute("display", "true");
        }else if(0 == flag){
            model.addAttribute("display", "false");
        }
        // 向域对象当中绑定一个URL
        model.addAttribute("imgUrl", "/dog1.jpg");
        // 向域对象当中存储一个性别
        model.addAttribute("gender", false);
        // 返回逻辑视图名称
        // 最终视图解析器ViewResolver会将逻辑视图名称解析为物理视图名称
        // 前缀：classpath:/templates/
        // 后缀：.html
        // 最终的解析结果：前缀 + 逻辑视图名称 + 后缀 = 物理视图名称
        // classpath:/templates/hello.thymeleaf
        return "hello";
    }
}
