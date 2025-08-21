package com.powernode.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Springboot322WebServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot322WebServerApplication.class, args);

        // 关闭logo使用代码方式实现（第一种方式）
        /*SpringApplication springApplication = new SpringApplication(Springboot322WebServerApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);*/

        // 流式编程/链式编程
        /*new SpringApplicationBuilder()
                .sources(Springboot322WebServerApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);*/

    }

}
