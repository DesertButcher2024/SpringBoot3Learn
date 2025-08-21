package com.powernode.springboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.powernode.springboot.bean.User;

// 这只是一个测试程序，测试jackson家族提供的将对象转换成yaml格式字符串的api。
public class TestYAMLApi {
    public static void main(String[] args) throws JsonProcessingException {

        // 创建YAMLFactory对象
        //YAMLFactory yamlFactory = new YAMLFactory();
        YAMLFactory yamlFactory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);

        // 创建 对象映射器 对象。
        ObjectMapper objectMapper = new ObjectMapper(yamlFactory);

        // 准备一个java对象
        User user = new User("jackson", 30);

        // 将java对象转换成字符串
        String str = objectMapper.writeValueAsString(user);
        System.out.println(str);
    }
}
