package com.powernode.springboot.service.impl;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        //users.add(new User("jackson", 20, true, "my name is jackson", "BEIJING"));
        users.add(new User("jackson", 20, true, "", "BEIJING"));
        users.add(new User("lucy", 21, false, "my name is lucy", "TIANJIN"));
        users.add(new User("tom", 22, false, "my name is tom", "SHANGHAI"));
        users.add(new User("smith", 23, true, "my name is smith", "SHENZHEN"));
        users.add(new User("ford", 24, true, "my name is ford", "WUHAN"));
        users.add(new User("king", 24, true, "", ""));
        return users;
    }
}
