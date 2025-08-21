package com.powernode.lombok.test;

import com.powernode.lombok.bean.User;

public class Test {
    public static void main(String[] args) {
        // 创建User对象
        User user = new User();
        user.setId(111L);
        user.setName("jackson");
        user.setAge(20);
        System.out.println(user);

        // 创建User对象
        user = new User(120L, "lucy", 30);
        System.out.println(user);
    }
}
