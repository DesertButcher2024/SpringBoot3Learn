package com.powernode.ph.service.impl;

import com.powernode.ph.bean.Vip;
import com.powernode.ph.repository.VipMapper;
import com.powernode.ph.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public List<Vip> findAll() {
        return vipMapper.selectAll();
    }
}
