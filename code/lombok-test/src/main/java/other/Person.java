package other;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder // 帮助我们这个类生成符合建造模式的代码。
public class Person {
    private String name;
    private int age;

    @Singular("addPhone")
    private List<String> phones;
}
