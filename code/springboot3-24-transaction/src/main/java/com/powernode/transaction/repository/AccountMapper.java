package com.powernode.transaction.repository;

import com.powernode.transaction.bean.Account;

public interface AccountMapper {

    /**
     * 根据账号获取账户信息
     * @param actNo 账号
     * @return 账户对象
     */
    Account selectByActNo(String actNo);

    /**
     * 更新账户信息，注意账号不能更新，其他字段都可以更新。
     * @param account 账户对象
     * @return 1表示更新成功
     */
    int update(Account account);

}
