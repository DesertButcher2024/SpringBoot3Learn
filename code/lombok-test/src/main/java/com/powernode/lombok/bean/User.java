package com.powernode.lombok.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// 无参数构造方法
@NoArgsConstructor
// 全参数构造方法
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
}
