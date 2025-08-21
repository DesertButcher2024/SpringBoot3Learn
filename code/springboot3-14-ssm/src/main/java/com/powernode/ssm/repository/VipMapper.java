package com.powernode.ssm.repository;

import com.powernode.ssm.bean.Vip;

public interface VipMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    Vip selectByCardNumber(String cardNumber);
}