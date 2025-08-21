package com.powernode.lombok.test;

import com.powernode.lombok.bean.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("jackson", 20);
        System.out.println(customer);
    }
}
