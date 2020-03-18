package com.atguigu.sh.juc;

import java.util.concurrent.*;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors()); //CPU密集型 ，IO密集型
        ExecutorService threadPool =//
                new ThreadPoolExecutor(2, 5,//
                        2L, TimeUnit.SECONDS,//
                        new LinkedBlockingQueue<Runnable>(3),//阻塞队列，不写，默认是Integer.MAX
                        Executors.defaultThreadFactory(), //线程工厂
//                        new ThreadPoolExecutor.AbortPolicy()//直接跑出RejectedException异常阻止系统正常运行
//                        new ThreadPoolExecutor.CallerRunsPolicy() //调用者运行，一种调节机制，该策略既不会抛弃任务，也不会抛出异常，而是将某些任务回退到调用者，从而降低新任务的流量
//                        new ThreadPoolExecutor.DiscardPolicy() //抛弃队列中等待最久的任务。然后把当前任务加入到队列中，尝试再次提交当前任务
                        new ThreadPoolExecutor.DiscardOldestPolicy()//该策略默默地丢弃无法处理的任务，不予任务处理，也不抛出异常。如果允许任务丢失，这是最好的策略 。
                );//拒绝策略
        for (int i = 0; i < 20; i++) {
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 办理业务 ");
            });
        }
//        threadPool.shutdown();
        threadPool.shutdownNow();
        System.out.println("执行结束 ");
    }

    private static void initPool() {
        ExecutorService threadPool = //
                Executors.newFixedThreadPool(5); //5个受理线程。
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();//一个池，一个线程
//        ExecutorService threadPool = Executors.newCachedThreadPool();//一池N个工作线程，类似一个银行有N个受理窗口
        try {
            for (int i = 0; i < 100; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务 ");
                });
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
