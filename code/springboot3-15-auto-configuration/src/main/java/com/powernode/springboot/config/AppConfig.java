package com.powernode.springboot.config;

import com.powernode.springboot.bean.A;
import com.powernode.springboot.bean.B;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 当类路径中存在 DispatcherServlet这个类的时候，配置生效。
@ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
@Configuration
public class AppConfig {

    @Bean
    public A test1(){ // 方法的名字作为bean name。
        return new A();
    }

    @Bean
    public B test2(){
        return new B();
    }

    // 如果IoC容器中存在A类型的Bean对象时。
    //@ConditionalOnBean(A.class)
    // 如果IoC容器中不存在A类型的Bean对象时。
    /*@ConditionalOnMissingBean(A.class)
    @Bean
    public B test2(){
        return new B();
    }*/

}
