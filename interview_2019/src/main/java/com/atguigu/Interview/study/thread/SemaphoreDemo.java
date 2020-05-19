package com.atguigu.Interview.study.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author lixiang
 * @date 2020-05-19-08:24
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);//模拟3个停车位
        for (int i = 0; i < 6; i++) { //模拟6部汽车
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    //抢到车位
                    System.out.println(Thread.currentThread().getName() + "\t 抢到车位");
                    //暂停一会 线程
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    //抢到车位
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + "\t 停车3秒钟离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();

        }
    }
}
