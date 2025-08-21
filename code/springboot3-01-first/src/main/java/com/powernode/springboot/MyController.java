package com.powernode.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/my")
    public String index(){
        return "my controller!";
    }
}
