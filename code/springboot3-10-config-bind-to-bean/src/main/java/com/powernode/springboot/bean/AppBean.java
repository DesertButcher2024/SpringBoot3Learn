package com.powernode.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app2.abc")
public class AppBean {
    // 数组：数组中元素是简单类型
    private String[] names;
    // 数组：数组中元素是bean
    private Address[] addrArray;
    // List集合：集合中的元素是bean
    private List<Address> addrList;
    // Map集合：String,Bean
    private Map<String, Address> addrs;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setAddrArray(Address[] addrArray) {
        this.addrArray = addrArray;
    }

    public void setAddrList(List<Address> addrList) {
        this.addrList = addrList;
    }

    public void setAddrs(Map<String, Address> addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "names=" + Arrays.toString(names) +
                ", addrArray=" + Arrays.toString(addrArray) +
                ", addrList=" + addrList +
                ", addrs=" + addrs +
                '}';
    }
}
