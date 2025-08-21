package other;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*Person person = Person.builder()
                .name("jack")
                .age(30)
                .build();
        System.out.println(person);*/

        /*List<String> phones = new ArrayList<>();
        phones.add("12345678912");
        phones.add("12345678913");
        phones.add("12345678914");

        Person person = Person.builder()
                .name("jack")
                .age(30)
                .phones(phones)
                .build();
        System.out.println(person);*/


        Person person = Person.builder()
                .name("jack")
                .age(30)
                .addPhone("12345678912")
                .addPhone("12345678913")
                .addPhone("12345678914")
                .build();
        System.out.println(person);
    }
}
