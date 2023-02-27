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

            System.out.println(Thread.currentThread().getName() + "\t 第1次获取版本号" + stamp);
            try {
                TimeUnit.SECONDS.sleep(1);
                atomicStampedReference.compareAndSet(100, 101,
                        atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
                System.out.println(Thread.currentThread().getName() + "\t 第2次获取版本号" + stamp);
                atomicStampedReference.compareAndSet(101, 100,
                        atomicStampedReference.getStamp(), atomicStampedReference.getStamp() + 1);
                System.out.println(Thread.currentThread().getName() + "\t 第3次获取版本号" + stamp);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "t3").start();
        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "\t 第1次获取版本号" + stamp);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean result = atomicStampedReference.compareAndSet(100, 2019, stamp, stamp + 1);
            System.out.println(Thread.currentThread().getName() + "\t 修改成功是否:" + result);
            System.out.println(Thread.currentThread().getName() + "\t 当前实际最新值 :" + atomicStampedReference.getReference());

        }, "t4").start();
    }
}
