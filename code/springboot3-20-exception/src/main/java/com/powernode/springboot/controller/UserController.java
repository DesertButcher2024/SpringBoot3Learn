package com.powernode.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@Controller
@ResponseBody*/
public class UserController {

    // RESTFul风格
    @GetMapping("/resource/{id}")
    public String getResource(@PathVariable("id") Long id){
        if(id == 1){
            throw new IllegalArgumentException("无效ID：" + id);
        }
        return "ID = " + id;
    }

    // springmvc中的异常处理方案：局部方式。
    // 只有在UserController中发生 IllegalArgumentException 异常时，会走下面这个方法进行异常处理。
    /*@ExceptionHandler(IllegalArgumentException.class)
    public String handlerIllegalArgumentException(IllegalArgumentException e){
        return "错误信息：" + e.getMessage();
    }*/

}
