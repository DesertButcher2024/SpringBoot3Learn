package com.powernode.transaction.controller;

import com.powernode.transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/transfer")
    public String transfer(String fromActNo, String toActNo, double money) {
        accountService.transfer(fromActNo, toActNo, money);
        return "success";
    }

}
