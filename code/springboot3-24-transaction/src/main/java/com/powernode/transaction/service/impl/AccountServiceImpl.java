package com.powernode.transaction.service.impl;

import com.powernode.transaction.bean.Account;
import com.powernode.transaction.exception.TransferException;
import com.powernode.transaction.repository.AccountMapper;
import com.powernode.transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void transfer(String fromActNo, String toActNo, double money) {
        // 转账的业务逻辑
        // 判断转出账户的余额是否足够
        Account fromAct = accountMapper.selectByActNo(fromActNo);
        if(fromAct.getBalance() < money){
            throw new TransferException("余额不足");
        }
        Account toAct = accountMapper.selectByActNo(toActNo);

        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        // 更新数据库
        int count = accountMapper.update(fromAct);

        // 模拟异常
        /*if(1 == 1){
            throw new TransferException("转账失败");
        }*/

        count += accountMapper.update(toAct);

        if(count != 2){
            throw new TransferException("转账失败");
        }
    }
}
