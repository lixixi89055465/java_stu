package com.atguigu.jvm1205;

import java.util.concurrent.TimeUnit;

class MyNumber {
    volatile int number = 10;

    public void addTo1205() {
        this.number = 1205;
    }
}

/**
 * JMM = 可见性（通知机制）
 */
public class T3 {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        new Thread(() -> {
            //暂停一会线程
            System.out.println("*************");
            try {
                TimeUnit.SECONDS.sleep(3);
                myNumber.addTo1205();//将10修改为1205
                System.out.println(Thread.currentThread().getName() + "\t A update number ,number value  " + myNumber.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAAA").start();

        while (myNumber.number == 10) {
            //需要有一种通知机制告诉main线程，number已经修改为1205，跳出while 循环
        }
        System.out.println(Thread.currentThread().getName() + "\t mission is over  ");


    }
}
