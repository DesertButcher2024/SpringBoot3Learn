package com.powernode.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 使用这个也是可以的。因为这样也可以纳入IoC容器的管理
// 并且还有另一个作用，就是表示以下的类是一个配置类。
//@Configuration
// 纳入IoC容器的管理
@Component
public class AppConfig {

    @Value("${myapp.path}")
    private String appPath;

    public void printInfo(){
        System.out.println(appPath);
    }
}
