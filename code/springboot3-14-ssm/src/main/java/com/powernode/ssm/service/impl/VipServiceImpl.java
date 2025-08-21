package com.powernode.ssm.service.impl;

import com.powernode.ssm.bean.Vip;
import com.powernode.ssm.repository.VipMapper;
import com.powernode.ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip findByCardNumber(String cardNumber) {
        return vipMapper.selectByCardNumber(cardNumber);
    }
}
