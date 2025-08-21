package com.powernode.springboot.service.impl;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.repository.VipMapper;
import com.powernode.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public boolean save(Vip vip) {
        return vipMapper.insert(vip) == 1;
    }

    @Override
    public List<Vip> findAll() {
        return vipMapper.selectAll();
    }
}
