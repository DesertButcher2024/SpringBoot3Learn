package com.powernode.ph.result;

import com.powernode.ph.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一的WEB层返回数据。统一格式，降低前后端沟通成本。
 * @param <T>
 */
@Builder // 建造模式
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    // 响应的状态码: 200、500、404
    private int code;
    // 响应的消息描述：成功，失败，删除失败，修改失败，添加失败
    private String msg;
    // 响应的对象：支持任意类型的对象
    private T data;

    // 为了方便返回数据，一般这里的方法都是静态方法。
    // 方法一般包括两大类：一类是成功，一类是失败。（重载）
    // 响应成功的消息，但是不携带任何数据
    public static <T> R<T> OK() {
        return R.<T>builder()
                .code(CodeEnum.OK.getCode())
                .msg(CodeEnum.OK.getMsg())
                .build();
    }

    // 响应成功的消息，携带数据data
    public static <T> R<T> OK(T data) {
        return R.<T>builder()
                .code(CodeEnum.OK.getCode())
                .msg(CodeEnum.OK.getMsg())
                .data(data)
                .build();
    }

    // 响应失败的消息。默认的code是400，失败的消息：失败
    // 失败是不可能携带数据。
    public static <T> R<T> FAIL() {
        return R.<T>builder()
                .code(CodeEnum.FAIL.getCode())
                .msg(CodeEnum.FAIL.getMsg())
                .build();
    }

    // 响应失败的消息，controller层的程序员可以通过此方法指定特定的code和特定的消息。
    /*public static <T> R<T> FAIL(int code, String msg) {
        return R.<T>builder()
                .code(code)
                .msg(msg)
                .build();
    }*/

    public static <T> R<T> FAIL(CodeEnum codeEnum) {
        return R.<T>builder()
                .code(codeEnum.getCode())
                .msg(codeEnum.getMsg())
                .build();
    }

}
