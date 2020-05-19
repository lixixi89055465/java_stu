package com.atguigu.interview.study.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lixiang
 * @date 2020-05-19-17:00
 * 题目：多线程之间按照顺序调用，实现A->B->C 三个线程启东，要求如下：
 * AA打印5次，BB打印10次，CC打印15次
 * 。。。。
 * 来10轮
 * <p>
 * <p>
 * 题目：synchronized 和lock 有什么区别？用新的lock有什么好处？你举例说说
 * 1    原始构成
 * synchronized 是关键字属于jvm 层面
 * monitorenter(底层是通过monitor对象来完成，其实wait/notify等方法也依赖于monitor对象只有在同步块或方法中才能调wait/notify等方法
 * monitorexit
 * Lock是具体类（java.util.concurrent.locks.lock)是api层面的锁
 * 2.使用方法
 * synchronized 不需要用户去手动释放锁，当synchronized 代码执行完后系统会自动释放对锁的占用
 * lock需要lock()和unlock()方法配合try/finally语句快来完成
 * 3.等待是否可中断
 * synchronized不可中断，除非抛出异常或正常运行完成
 * ReentrantLock 可中断，1.设置超时方法 trylock(long timeout,TimeUnit unit)
 * 2.lockInterruptibly()放代码块中，调用interrupt()方法可中断
 * 4. 加锁是否公平
 * synchronized 非公平锁
 * ReentrantLock 可以两者都可以，默认非公平锁，构造方法可以传入boolean值，true为公平锁，false 为非公平锁
 * 5.锁绑定多个条件Condition
 * synchronized没有
 * ReentrantLock 用来实现分组唤醒需要唤醒的线程们，可以精确唤醒，而不是像synchronized要么随机唤醒一个线程，要么唤醒全部线程
 */
class ShareResource {
    private int number = 1;//A:1  B:2 C:3
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    //1.判断
    public void print5() {
        lock.lock();
        try {
            while (number != 1) {
                c1.await();
            }
            //2.干活
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + number);
            }
            //3.通知
            number = 2;
            c2.signal();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    //1.判断
    public void print10() {
        lock.lock();
        try {
            while (number != 2) {
                c2.await();
            }
            //2.干活
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + number);
            }
            //3.通知
            number = 3;
            c3.signal();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    //1.判断
    public void print15() {
        lock.lock();
        try {
            while (number != 3) {
                c3.await();
            }
            //2.干活
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + number);
            }
            //3.通知
            number = 1;
            c1.signal();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}

public class SyncAndReentrantLockDemo {
    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareResource.print5();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareResource.print10();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareResource.print15();
            }
        }, "C").start();
    }
}
