package com.powernode.springboot.service.impl;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public User findUser() {
        return new User("jackson", "123456");
    }
}
