package com.testjava11;

import java.util.function.Consumer;

public class Test02 {
    public static void main(String[] args) {
        String str="ABCD";
        System.out.println(str.repeat(3));
        var str2="342\n343\n3242\n4323433333";
        System.out.println(str2.lines());
        System.out.println(str2.lines().count());
        System.out.println();
        str2=" A B C D ";
        System.out.println(str2.strip());
        System.out.println(str2.strip());
        System.out.println(str2.stripLeading());
        System.out.println(str2.stripTrailing());


    }
}
