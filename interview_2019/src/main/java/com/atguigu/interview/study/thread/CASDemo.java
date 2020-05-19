package com.atguigu.interview.study.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lixiang
 * @date 2020-04-26-21:46
 * @description 1 CAS 是什么 ？
 * 比较并交换 compareAndSet
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(6, 2019) + "\tcurrent data:" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5, 2019) + "\tcurrent data:" + atomicInteger.get());
    }
}
