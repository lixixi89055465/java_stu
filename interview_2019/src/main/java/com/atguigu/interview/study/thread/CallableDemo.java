package com.atguigu.interview.study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("************ come in callable ");
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
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        Thread t1 = new Thread(futureTask, "AA");
        t1.start();
        System.out.println("************ result " + futureTask.get());


    }
}
