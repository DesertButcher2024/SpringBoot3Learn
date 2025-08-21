package com.powernode.ssm.controller;

import com.powernode.ssm.bean.Vip;
import com.powernode.ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {

    @Autowired
    private VipService vipService;

    @GetMapping("/detail")
    public Vip detail(@RequestParam("cn") String cardNumber){
        return vipService.findByCardNumber(cardNumber);
    }

}
