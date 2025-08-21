package com.powernode.ph;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.powernode.ph.repository")
@SpringBootApplication
public class Springboot323PhApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot323PhApplication.class, args);
    }

}
