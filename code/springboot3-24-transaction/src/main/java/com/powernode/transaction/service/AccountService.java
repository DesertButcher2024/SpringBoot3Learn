package com.powernode.transaction.service;

public interface AccountService {

    /**
     * 转账的业务方法
     * @param fromActNo 转出账号
     * @param toActNo 转入账号
     * @param money 转账金额
     */
    void transfer(String fromActNo, String toActNo, double money);

}
