package com.powernode.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 基于springboot的自动配置扩展配置。
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 添加 视图控制器 与 视图名称 的映射关系。
        registry.addViewController("/a").setViewName("a");
        registry.addViewController("/b").setViewName("b");
    }

}
