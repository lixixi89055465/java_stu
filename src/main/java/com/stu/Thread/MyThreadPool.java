package com.stu.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 跟数据库连接池类似
 * 避免了线程的创建和销毁造成的额外开销
 * <p>
 * java.util.concurrent
 * <p>
 * Executor    负责现成的使用和调度的根接口
 * |--ExecutorService    线程池的主要接口
 * |--ThreadPoolExecutor    线程池的实现类
 * |--ScheduledExecutorService    接口，负责线程的调度
 * |--ScheduledThreadPoolExecutor    (extends ThreadPoolExecutor implements ScheduledExecutorService)
 * <p>
 * <p>
 * Executors工具类
 * 提供了创建线程池的方法
 */
public class MyThreadPool {
    public static void main(String[] args) {
        //使用Executors 工具类中的方法创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        ThreadPoolDemo deom = new ThreadPoolDemo();
        //为线程池中的线程分配任务，使用submitt 方法，传入的参数可以是Runnable 的实现 类，也可以是callable 的实现类
        for (int i = 0; i <= 9; i++) {
            pool.submit(deom);
        }
        //关闭线程池
        //shutdown : 以一种平和的方式关闭线程池，在关闭线程池之前，会等待线程池中的所有的人物都结束，不在接受新的任务
        //shutdownNow,立即关闭线程池
        pool.shutdown();
    }
}

class ThreadPoolDemo implements Runnable {

    /**
     * 多线程的共享数据
     */
    private int i = 0;

    @Override
    public void run() {
        while (i <= 100) {
            System.out.println(Thread.currentThread().getName()+"---"+ i++);
        }
    }
}