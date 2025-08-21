package com.powernode.springboot;

import com.powernode.springboot.bean.AppBean;
import com.powernode.springboot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

// 如果项目中有这种老的Spring XML配置文件，使用以下注解可以让XML生效。
// 在SpringBoot主入口类上添加以下注解，让XML配置文件生效。
@ImportResource("classpath:/applicationContext.xml")

// 将配置信息绑定到bean的第三种方式：在主入口程序上添加以下注解。
// 以下注解的作用是：启用将配置信息绑定到bean，以下代码的意思就是将配置信息绑定到User这个bean上。
@EnableConfigurationProperties({User.class, AppBean.class})
//@EnableConfigurationProperties({User.class})

// 将配置信息绑定到bean的第四种方式：在主入口程序上添加以下注解。
//@ConfigurationPropertiesScan(basePackages = "com.powernode.springboot.bean")
@SpringBootApplication
public class Springboot310ConfigBindToBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot310ConfigBindToBeanApplication.class, args);
    }

}
