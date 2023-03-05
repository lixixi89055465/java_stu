package com.atguigu.juc1205;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 题目:现在两个线程，可以操作初始值为零的一个变量，
 * 实现一个线程对该变量加1，一个线程对该变量减一，
 * 实现交替，来10轮，变量初始值为零。
 * 1    高内聚低耦合前提下，线程操作资源类
 * 2    判断/干活/通知
 */
public class ThreadWaitNotifyDemo2 {

    protected static class AirConditioner {//资源类
        private Lock lock = new ReentrantLock();
        private Condition condition = lock.newCondition();
        private int number = 0;

        public synchronized void increment() throws InterruptedException {

            //1 判断
            lock.lock();
            try {
                while (number != 0) {
                    lock.wait();
                }
                //2 干活
                number++;
                System.out.println(Thread.currentThread().getName() + "\t" + number);
                condition.signalAll();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                //3 通知
                lock.unlock();
            }

        }

        public synchronized void decrement() throws InterruptedException {
            //1 判断
            lock.lock();
            try {
                while (number == 0) {
                    this.wait();
                }
                //2 干活
                number--;
                System.out.println(Thread.currentThread().getName() + "\t" + number);
                //3 通知
                this.notifyAll();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock();
            }

        }


    }

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    airConditioner.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "AAA").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    airConditioner.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "BBB").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    airConditioner.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "CCC").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    airConditioner.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "DDD").start();
    }
}
