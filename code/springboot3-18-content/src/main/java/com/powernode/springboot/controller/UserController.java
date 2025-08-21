package com.powernode.springboot.controller;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 相当于@Controller + @ResponseBody ，默认是将数据转换成json字符串进行响应。
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/detail")
    public User detail(){
        return userService.findUserById();
    }

}
