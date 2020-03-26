package com.atguigu.jvm1205;

public class MyObject {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        System.out.println(myObject.getClass().getClassLoader());
        System.out.println(myObject.getClass().getClassLoader().getParent());
        System.out.println(myObject.getClass().getClassLoader().getParent().getParent());
        System.out.println("--------------------");
        Object object = new Object();
        System.out.println(object.getClass());
        System.out.println(object.getClass().getClassLoader());
        System.out.println(object.getClass().getClassLoader().getParent());
        System.out.println(object.getClass().getClassLoader().getParent().getParent());
    }
}
