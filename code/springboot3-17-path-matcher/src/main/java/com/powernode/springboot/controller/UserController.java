package com.powernode.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //@GetMapping("/{path:[a-z]+}/a?/**/*.do")
    @GetMapping("/{path:[a-z]+}/a?/**")
    public String testPath(HttpServletRequest request, @PathVariable String path){
        String requestURI = request.getRequestURI();
        return requestURI + "path = " + path;
    }

}
