package com.powernode.ssm.service;

import com.powernode.ssm.bean.Vip;

public interface VipService {

    /**
     * 根据会员的卡号查询会员的信息。
     * @param cardNumber 会员的卡号
     * @return 会员信息
     */
    Vip findByCardNumber(String cardNumber);

}
