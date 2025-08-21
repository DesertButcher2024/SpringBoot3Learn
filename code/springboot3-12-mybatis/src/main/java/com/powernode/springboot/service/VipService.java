package com.powernode.springboot.service;

import com.powernode.springboot.bean.Vip;

import java.util.List;

public interface VipService {

    /**
     * 保存会员信息
     * @param vip  会员信息
     * @return true表示成功,false表示失败
     */
    boolean save(Vip vip);

    /**
     * 查看会员列表
     * @return 会员列表
     */
    List<Vip> findAll();

}
