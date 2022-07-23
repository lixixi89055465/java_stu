package com.test9;

import java.util.stream.Stream;

public class Foreach01 {
    public static void main(String[] args) {
        Stream.iterate(0,i->i+1)//
        .limit(20)//
        .forEach(System.out::print);
        System.out.println();

        Stream.iterate(100,i->i+2)//
        .takeWhile(i->i<120)//
        .forEach(System.out::print);
        System.out.println();

        Stream.iterate(0,i->i+3)//
        .dropWhile(i->i>10).forEach(System.out::print);
    }
}
