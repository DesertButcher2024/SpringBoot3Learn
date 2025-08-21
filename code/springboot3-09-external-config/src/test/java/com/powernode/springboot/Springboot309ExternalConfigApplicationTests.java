package com.powernode.springboot;

import com.powernode.springboot.config.AppConfig;
import com.powernode.springboot.config.ProfilesActiveConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot309ExternalConfigApplicationTests {

    @Autowired
    private AppConfig appConfig;

    @Test
    void test01() {
        appConfig.printInfo();
    }

    @Autowired
    private ProfilesActiveConfig profilesActiveConfig;

    @Test
    void test02(){
        profilesActiveConfig.print();
    }

}
