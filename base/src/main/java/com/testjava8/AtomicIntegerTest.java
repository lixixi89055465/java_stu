package com.testjava8;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomInt=new AtomicInteger();
        atomInt.addAndGet(1);
        System.out.println(atomInt.get());


    }
}
