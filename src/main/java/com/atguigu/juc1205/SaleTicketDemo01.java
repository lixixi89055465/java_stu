package com.atguigu.juc1205;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket { //资源类 = 实例变量+实例方法
    private int number = 30;
    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "\t卖出第:" + (number--));
            }

        } finally {
            lock.unlock();
        }
    }
}

/**
 * 题目： 三个 售票员 ， 卖出 30张票
 * 笔记： 如何编写企业级的多线程代码
 * 固定的编程套路+模板
 * 1. 在高内聚低耦合的前提下，线程， 操作，资源类
 * 1.1  ，一言不合，先创建资源类,
 */
public class SaleTicketDemo01 {
    public static void main(String[] args) { //主线程，一切程序的入口
        Ticket ticket=new Ticket();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

    }
}
