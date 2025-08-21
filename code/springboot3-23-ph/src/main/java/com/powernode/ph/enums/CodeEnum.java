package com.powernode.ph.enums;

import lombok.*;

// 专门维护code+msg的一个枚举类型
//@Data
@NoArgsConstructor
@AllArgsConstructor
//@Setter
public enum CodeEnum {

    //这地方没有写枚举值，那么由于后面有其他代码，这里至少要写一个“;”
    OK(200, "成功"),
    FAIL(400, "失败"),
    BAD_REQUEST(400, "请求错误"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_ERROR(500, "内部服务器错误"),
    MODIFICATION_FAILED(400, "修改失败"),
    DELETION_FAILED(400, "删除失败"),
    CREATION_FAILED(400, "创建失败");;

    // javase当中详细讲过枚举类型
    // 枚举类型当中可以有属性
    // 枚举类型当中可以有构造方法
    // 枚举类型当中可以有setter和getter方法。
    // 在枚举类型当中有一个语法要求，枚举的大括号一开始的位置必须编写枚举值。
    // 每一个枚举值就是一个枚举类型的实例。


    @Setter
    @Getter
    private int code;

    @Setter
    @Getter
    private String msg;
}

/*enum Season {
    // 这些就是枚举值
    // 其中每一个枚举值都是 Season类型的对象/实例。
    SPRING, SUMMER, AUTUMN, WINTER;

    // 枚举值下面如果没有代码，枚举值列表最后的那个“;”可以省略。
    // 枚举值下面如果有代码，则枚举值列表最后的";"是不能省略的。
    private String name;
}*/
