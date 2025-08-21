package com.powernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 所有的springboot应用的主入口程序必须使用 @SpringBootApplication 注解进行标注。
@SpringBootApplication
public class MyApplication {
    // 主入口，运行main方法就是启动服务器
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
