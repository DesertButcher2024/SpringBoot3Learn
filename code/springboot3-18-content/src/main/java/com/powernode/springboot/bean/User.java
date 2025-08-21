package com.powernode.springboot.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JacksonXmlRootElement // 添加这个注解，可以将java对象转换成xml格式的字符串。
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private Integer age;
}
