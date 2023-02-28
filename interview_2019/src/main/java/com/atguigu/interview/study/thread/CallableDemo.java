package com.atguigu.interview.study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("************ come in callable ");
        Thread.sleep(4000);
        return 1024;
    }
}

/**
 * @author lixiang
 * @date 2020-05-19-23:08
 * 多线程中，第3种获得多线程的方式
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> fureTask01 = new FutureTask<>(new MyThread());
        FutureTask<Integer> fureTask02 = new FutureTask<>(new MyThread());
        new Thread(fureTask01, "AA").start();
        new Thread(fureTask01, "BB").start();
        System.out.println(Thread.currentThread().getName() + "************8");
        int result01 = 100;
        Integer result02 = fureTask01.get();
        System.out.println("******result:" + (result01 + result02));


    }

    private static void test03() throws InterruptedException, ExecutionException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        new Thread(futureTask, "AA").start();

        System.out.println(Thread.currentThread().getName() + "****************");
        int result01 = 1000;
        while (!futureTask.isDone()) ;
        int result02 = futureTask.get();
        System.out.println("*******result" + (result01 + result02));
    }

    private static void test02() throws InterruptedException, ExecutionException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyThread());
        Thread t1 = new Thread(futureTask, "AA");
        t1.start();
        int result01 = 100;
        int result02 = futureTask.get();// 要求获得callable线程的计算结果，如果没有计算完成就要去强求，会导致阻塞，值得计算完成后求和

        System.out.println("*********result:" + (result01 + result02));
    }

    private static void test01() throws InterruptedException, ExecutionException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        Thread t1 = new Thread(futureTask, "AA");
        t1.start();
        System.out.println("************ result " + futureTask.get());
    }
}
