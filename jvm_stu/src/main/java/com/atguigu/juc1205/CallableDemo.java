package com.atguigu.juc1205;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 1024;
    }
}

/**
 * 有返回值的线程方法
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask(new MyThread());
        new Thread(futureTask, "A").start();
        Integer result = futureTask.get();
        System.out.println(result);

    }
}
