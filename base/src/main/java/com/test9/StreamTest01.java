package com.test9;

import java.util.stream.Stream;

public class StreamTest01 {
    public static void main(String[] args) {
        Stream.of("A","B","C")//
        .filter(s->s.equals("B"))//
        .distinct()//
        .forEach(System.out::println);
        Stream.ofNullable(null)//
        .filter(s->s.equals("C"))//
        .distinct()//
        .forEach(System.out::println);

    }
}
