package com.atguigu.interview.study.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author lixiang
 * @date 2020-04-28-22:12
 * @description
 */
public class ABADemo {
    static AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
    static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100, 1);

    public static void main(String[] args) {
        System.out.println("========以下是ABA问题的产生=======");
        new Thread(() -> {
            atomicReference.compareAndSet(100, 101);
            atomicReference.compareAndSet(101, 100);
        });
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atomicReference.compareAndSet(100, 2019));
        }, "t2").start();
        System.out.println("========以下是ABA问题的解决=======");
        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();

            System.out.println(Thread.currentThread().getName() + "\t 第一次获取版本号" + stamp);
        }, "t3").start();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            atomicStampedReference.compareAndSet(100,2019,atomicStampedReference)
        }, "t4").start();
    }
}
