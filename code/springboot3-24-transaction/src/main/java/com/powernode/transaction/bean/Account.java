package com.powernode.transaction.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String actNo; // 数据库字段名 act_no
    private Double balance;
}
