package com.testjava17;

public class Main {
    public static void main(String[] args) {
        Class<A> a=A.class;
        System.out.println(a.isSealed());
    }
     class C extends B{

    }
}
