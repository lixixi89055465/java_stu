package com.atguigu.Interview.study.thread;


class Phone2 {
    public synchronized void sendSMS() throws Exception {
        System.out.println(Thread.currentThread().getId() + "\t invoked sendSMS() ");
    }


    public synchronized void sendEmail() throws Exception {
        System.out.println(Thread.currentThread().getId() + "\t ########## invoked sendEmail() ");
    }
}

/**
 * @author lixiang
 * @date 2020-05-17-18:24
 * ReenterLock 也是一个典型的锁
 */
public class ReenterLockDemo2 {
    public static void main(String[] args) {
        Phone2 phone2 = new Phone2();
        new Thread(()->{
            try {
                phone2.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t1").start();
        new Thread(()->{
            try {
                phone2.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t2").start();
    }
}
