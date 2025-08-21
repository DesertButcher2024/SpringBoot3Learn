package com.powernode.lombok.bean;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@ToString(exclude = {"age"})
//@EqualsAndHashCode(exclude = {"age"})
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
// 生成必须的构造方法。
// 如果类中有final修饰的实例变量，则生成带有该实例变量的构造方法。
// 如果类中没有final修饰的实例变量，则自动添加无参数构造方法。
//@RequiredArgsConstructor

@Data
public class Person {
    private String name;
    private int age;
    // final修饰的实例变量必须在构造方法中为其初始化。
    //private final String email;

    /*public Person(String email){
        this.email = email;
    }*/
}
