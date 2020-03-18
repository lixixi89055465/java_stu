package com.atguigu.sh.juc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain = true)
class User {
    private int id;
    private String bookName;
    private int age;
}

public class StreamDemo {
    public static void main(String[] args) {
        User u1 = new User(11, "a", 23);
        User u2 = new User(12, "b", 24);
        User u3 = new User(13, "c", 25);
        User u4 = new User(14, "d", 28);
        User u5 = new User(15, "e", 26);
        List<User> users = Arrays.asList(u1, u2, u3, u4, u5);

        Function<String,Integer> function=s->{return s.length();};
        System.out.println(function.apply("abc"));
    }

}
