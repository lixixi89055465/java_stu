package com.atguigu.interview.study.thread;

import java.util.concurrent.*;

/**
 * @author lixiang
 * @date 2020-05-20-09:01
 * 第四种获得/使用java 多线程的方式，通过我们的线程池
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//                new ThreadPoolExecutor.CallerRunsPolicy());
                new ThreadPoolExecutor.DiscardOldestPolicy());
        try {
            for (int i = 0; i < 182; i++) {

                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 这个线程办理业务！ ");
                });

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

    private static void test1() {
        //        ExecutorService threadPool = Executors.newFixedThreadPool(5);
//        ExecutorService threadPool = Executors.newFixedThreadPool(1);
//        ExecutorService threadPool = Executors.newCachedThreadPool();
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
//        模拟10个用户来办理业务，每个用户就是一个来自外部的请求线程
        try {
            for (int i = 0; i < 20; i++) {

                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 这个线程办理业务！ ");
                });

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
