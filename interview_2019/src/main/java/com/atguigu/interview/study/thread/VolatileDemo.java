package com.atguigu.interview.study.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lixiang
 * @date 2020-04-19-18:34
 * @description
 */
class MyData {
    volatile int number = 0;

    public void addT060() {
        this.number = 60;
    }

    //请注意，此时number前面是加了volatile关键字修饰的，volatile不保证原子性
    public void addPlusPlus() {
        number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger(1);

    public void addAtomicInteger() {
        atomicInteger.getAndIncrement();
    }

}

/**
 * 1. 验证volatile 的可见性
 * 1.1  假如 int number=0; number 变量之前根本没有添加volatile 关键字修饰,没有可见性
 * 1.2  添加了volatile,可以解决可见性的问题。
 * <p>
 * 2。 验证volatile 不保证原子性
 * 2。1 原子性至的什么意思
 * 不可分割，完整性,也即某个线程正在做某个业务时，中间不可以被加塞或者分割。
 * 需要整体完整，同时成功，要么同时失败.
 * 2.2 volatile不保证原子性的案例演示
 */
public class VolatileDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    myData.addPlusPlus();
                    myData.addAtomicInteger();
                }
            }, String.valueOf(i)).start();
        }
        //需要等待上面20个线程都全部计算完成后，再用main线程取得最红的结果值，看是多少？
        while (Thread.activeCount() > 2) {
            //礼让线程，让别的线程去执行
            Thread.yield();
        }
        System.out.println(myData.number);
        System.out.println(myData.atomicInteger);
    }

    private static void seeOkByVolatile() {
        MyData myData = new MyData();
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "\t come in ");
                TimeUnit.SECONDS.sleep(3);
                myData.addT060();
                System.out.println(Thread.currentThread().getName() + "\t update in ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();
        while (myData.number == 0) {
            //main
        }
        System.out.println(Thread.currentThread().getName() + "\t mission is over ");
    }
}
