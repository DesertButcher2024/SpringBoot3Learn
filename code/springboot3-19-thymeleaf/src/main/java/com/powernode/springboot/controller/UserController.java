package com.powernode.springboot.controller;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    // 只编写一个控制器方法，不做任何业务逻辑，只是为了跳转视图。
    /*@RequestMapping("/a")
    public String a(){
        return "a";
    }*/

    /*@RequestMapping("/b")
    public String b(){
        return "b";
    }*/

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list(Model model){
        // 获取数据
        List<User> users = userService.getAll();
        // 绑定到域对象当中
        model.addAttribute("users", users);
        // 再向域对象当中绑定一个user对象
        model.addAttribute("user", users.get(2));
        // 跳转视图
        return "list";
    }
}
