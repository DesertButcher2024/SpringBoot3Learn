package com.powernode.lombok.test;

import com.powernode.lombok.service.UserService;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveUser();
    }
}
