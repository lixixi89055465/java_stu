package com.testjava11;

import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        var str="abcd";
        Consumer<String>consumer=(var s)->{
            System.out.println(s);
        };
        consumer.accept("AAAAAAAA");

    }
}
