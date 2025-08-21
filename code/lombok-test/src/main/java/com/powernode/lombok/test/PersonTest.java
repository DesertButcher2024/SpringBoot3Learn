package com.powernode.lombok.test;

import com.powernode.lombok.bean.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackson");
        person.setAge(20);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person);

        Person p1 = new Person();
        p1.setName("abc");
        p1.setAge(20);

        Person p2 = new Person();
        p2.setName("abc");
        p2.setAge(30);

        System.out.println(p1.equals(p2));

        Person p3 = new Person("lucy", 20);
        System.out.println(p3);
    }
}
