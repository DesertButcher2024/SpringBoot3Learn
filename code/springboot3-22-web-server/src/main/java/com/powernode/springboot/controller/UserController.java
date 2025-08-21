package com.powernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "welcome";
    }
}
