package com.atguigu.interview.study.thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Phone1 implements Runnable {
    public synchronized void sendSMS() throws Exception {
        System.out.println(Thread.currentThread().getId() + "\t invoked sendSMS ");
        sendEmail();
    }

    public synchronized void sendEmail() throws Exception {
        System.out.println(Thread.currentThread().getId() + "\t ========invoked sendEmail ");
    }

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void get() {
//        lock.lock();
        lock.lock();
        try {
            //线程可以进入任何一个它已经拥有的锁所同步着的代码块
            System.out.println(Thread.currentThread().getName() + "\t invoked get() ");
            set();
        } finally {
            lock.unlock();
//            lock.unlock();

        }

    }

    public void set() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t ========invoked set ");

        } finally {
            lock.unlock();
        }

    }

}

/**
 * @author lixiang
 * @date 2020-05-17-18:24
 * ReenterLock 也是一个典型的锁
 */
public class ReenterLockDemo1 {
    public static void main(String[] args) {
        Phone1 phone1 = new Phone1();
        Thread t3 = new Thread(phone1, "t3");
        Thread t4 = new Thread(phone1, "t4");
        t3.start();
        t4.start();
    }
}
