package com.test9;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        System.out.println("hello world");
//        Logger
        Class<String> stringClass=String.class;
        Field field=stringClass.getDeclaredField("value");
        field.setAccessible(true);
        System.out.println("ABCD");



    }
}
