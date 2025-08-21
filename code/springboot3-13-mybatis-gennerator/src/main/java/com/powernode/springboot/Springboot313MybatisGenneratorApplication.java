package com.powernode.springboot;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = "com.powernode.springboot.repository")
@SpringBootApplication
public class Springboot313MybatisGenneratorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot313MybatisGenneratorApplication.class, args);
        VipMapper vipMapper = applicationContext.getBean(VipMapper.class);

        Vip vip = new Vip("jack", "1234567899", "2000-11-10");
        vipMapper.insert(vip);

        Vip vip2 = vipMapper.selectByPrimaryKey(1L);
        System.out.println(vip2);

        applicationContext.close();
    }

}
