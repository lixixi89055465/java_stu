package com.atguigu.sh.juc;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

//信号量，用于多个共享资源的互斥使用，另一个用于并发线程数的控制
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); //模拟资源类，有3个空车位
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t抢到了车位");
                    TimeUnit.SECONDS.sleep(new Random().nextInt(6)); //
                    System.out.println(Thread.currentThread().getName() + "\t离开了车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();//释放资源
                }
            }, String.valueOf(i)).start();

        }
    }

}
