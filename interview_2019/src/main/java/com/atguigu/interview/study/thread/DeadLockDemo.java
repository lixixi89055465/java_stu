package com.atguigu.interview.study.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author lixiang
 * @date 2020-05-20-13:25
 */
class HoldLockThread implements Runnable {
    private String lockA;
    private String lockB;

    public HoldLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "\t自己持有" + lockA + "尝试获得 " + lockB);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "\t自己持有" + lockB + "尝试获得 " + lockA);
            }
        }

    }
}

/**
 * 死锁是指两个或两个以上的进程在执行过程中。
 * 因争夺资源而造成的一种相互等待的现象
 * 若无外力干涉那它们都将无法推进下去
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HoldLockThread(lockA, lockB)
                , "ThreadAAA").start();
        new Thread(new HoldLockThread(lockB, lockA)
                , "ThreadBBB").start();
    }
}
