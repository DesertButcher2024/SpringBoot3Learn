package com.powernode.builderpattern;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder()
                                .name("jack")
                                .age(30)
                                .build();
        System.out.println(person);
    }
}
