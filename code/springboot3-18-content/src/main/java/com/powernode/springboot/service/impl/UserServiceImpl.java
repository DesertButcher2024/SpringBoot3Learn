package com.powernode.springboot.service.impl;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById() {
        return new User("jackson", 30);
    }
}
