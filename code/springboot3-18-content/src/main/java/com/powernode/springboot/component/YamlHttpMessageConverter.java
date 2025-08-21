package com.powernode.springboot.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.powernode.springboot.bean.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.Charset;

// 这是一个消息转换器，专门处理yaml格式数据的。
// 注意，所有的消息转换器必须实现 HttpMessageConverter接口，或者继承AbstractHttpMessageConverter抽象类。并实现/重写方法。
public class YamlHttpMessageConverter extends AbstractHttpMessageConverter {

    // 对象映射器
    private ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));

    // 非常重要的一步：要将媒体类型 text/yaml 和 消息转换器进行绑定。
    public YamlHttpMessageConverter() {
        super(new MediaType("text", "yaml", Charset.forName("UTF-8")));
    }

    // 这个方法用来指定此消息转换器只适合于哪些类型的对象。
    @Override
    protected boolean supports(Class clazz) {
        // 表示只有User类型的对象才能够使用该消息转换器进行转换。
        return User.class.isAssignableFrom(clazz);
    }

    // 这个是将yaml格式的字符串转换成java对象
    // @RequestBody
    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    // 将java对象转换成yaml格式的字符串
    // @ResponseBody
    @Override
    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // ObjectMapper对象
        objectMapper.writeValue(outputMessage.getBody(), o);
    }
}
