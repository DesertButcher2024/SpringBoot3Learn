package com.powernode.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 这里的这种配置：在springboot默认的自动配置基础之上进行扩展配置。也就是说springboot之前的配置仍然生效。
//@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 静态资源处理，需要重写的方法是：addResourceHandlers
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 使用注册器 registry 绑定path pattern以及真实的静态资源文件存储路径
        registry.addResourceHandler("/abc/**") // 配置路径访问模式
                .addResourceLocations("classpath:/static1/", "classpath:/static2/"); // 配置静态资源路径
    }

}

/*// 添加这个注解之后，表示不在使用springboot的提供的默认的自动配置。
@EnableWebMvc
// 以下配置完全使用自己的，不在基于springboot的配置进行扩展。
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 静态资源处理，需要重写的方法是：addResourceHandlers
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 使用注册器 registry 绑定path pattern以及真实的静态资源文件存储路径
        registry.addResourceHandler("/abc/**") // 配置路径访问模式
                .addResourceLocations("classpath:/static1/", "classpath:/static2/"); // 配置静态资源路径
    }

}*/
