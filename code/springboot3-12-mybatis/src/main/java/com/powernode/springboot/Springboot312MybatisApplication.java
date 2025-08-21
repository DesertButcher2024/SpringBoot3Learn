package com.powernode.springboot;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.service.VipService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// 通过这个指定去哪里找Mapper接口（配置Mapper的扫描。）
@MapperScan(basePackages = {"com.powernode.springboot.repository"})
@SpringBootApplication
public class Springboot312MybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot312MybatisApplication.class, args);

        // 获取service对象
        VipService vipService = applicationContext.getBean(VipService.class);

        /*// 保存会员
        Vip vip1 = new Vip("jack1", "1234567892", "1999-10-11");
        vipService.save(vip1);
        // 保存会员
        Vip vip2 = new Vip("lucy1", "1234567893", "1999-10-12");
        vipService.save(vip2);*/
        // 查看会员列表
        vipService.findAll().forEach(System.out::println);

        applicationContext.close();
    }

}
