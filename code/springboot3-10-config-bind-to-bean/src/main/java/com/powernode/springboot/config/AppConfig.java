package com.powernode.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// 纳入IoC容器的管理。
//@Component
// 这个注解标注的类一定会被纳入IoC容器的管理，同时这个类也表示是一个配置类。
@Configuration
// 将配置文件中的属性值一次性的绑定到bean对象的属性上。
@ConfigurationProperties(prefix = "myapp.a")
public class AppConfig {

    // 强调：要实现这种一次性的绑定功能，配置文件中的属性名和bean对象的属性名要一致。
    private String username;
    private String password;
    private Integer age;
    private Boolean gender;

    // 底层在实现给对象属性赋值的时候，调用了setter方法，因此必须保证每个属性提供了setter方法。
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
