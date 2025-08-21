package com.powernode.springboot.service;

public interface UserService {

    /**
     * 保存用户信息
     * @param id 用户id
     * @param name 用户名
     */
    void save(Long id, String name);

    /**
     * 根据id删除用户
     * @param id 用户id
     */
    void deleteById(Long id);
}
