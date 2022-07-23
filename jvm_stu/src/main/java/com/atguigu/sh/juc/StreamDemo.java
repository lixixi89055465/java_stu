package com.atguigu.sh.juc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
        users.stream().filter(t -> {
            return t.getId() > 0;
        }).filter(t -> {
            return t.getAge() > 2;
        }).map(m -> {
            return m.getBookName().toUpperCase();
        }).sorted((o1, o2) -> {
                    return o1.compareTo(o2);
                }
        ).limit(2).forEach(System.out::println);


        List<Integer> list2 = Arrays.asList(1, 2, 3);
        list2.stream().map(x -> {
            return x * 2;
        }).collect(Collectors.toList());
        for (Integer element : list2) {
            System.out.println(element);
        }
    }


    private static void Function_Interface() {


        //鍑芥暟鍨嬫帴鍙�
        Function<String, Integer> function = s -> {
            return s.length();
        };
        System.out.println(function.apply("abc"));


        //鏂畾鍨嬫帴鍙�
//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean testjava8(String s) {
//                return false;
//            }
//        };
        Predicate<String> predicate = s -> {
            return s.isEmpty();
        };
        System.out.println(predicate.test("xiass"));
        //娑堣垂鍨嬫帴鍙�
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        };
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };
        consumer.accept("tian");
        //渚涚粰鍨嬫帴鍙�
        Supplier<String> supplier = () -> {
            return "java0222";
        };
        System.out.println(supplier.get());
    }

}
