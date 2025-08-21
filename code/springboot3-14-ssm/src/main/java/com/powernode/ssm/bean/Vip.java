package com.powernode.ssm.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_vip
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vip implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

    public Vip(String name, String cardNumber, String birth) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.birth = birth;
    }

    private static final long serialVersionUID = 1L;
}