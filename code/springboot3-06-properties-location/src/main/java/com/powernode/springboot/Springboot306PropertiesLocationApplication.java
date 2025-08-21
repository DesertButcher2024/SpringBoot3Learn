package com.powernode.springboot;

import com.powernode.springboot.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot306PropertiesLocationApplication {

    // args 就是接收命令行参数的。
    public static void main(String[] args) {

        // 打印命令行参数。
        for (String arg : args) {
            System.out.println(arg);
        }

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot306PropertiesLocationApplication.class, args);
        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
        appConfig.printInfo();
        applicationContext.close();
    }

}
