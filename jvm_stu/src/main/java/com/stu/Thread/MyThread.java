package com.stu.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ImplCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println(Thread.currentThread().getName());
        return result;
    }
//    @Override
//    public Integer call() throws Exception {
//        int result = 0;
//        for (int i = 0; i < 10; i++) {
//            result += i;
//        }
//        System.out.println(Thread.currentThread().getName());
//        return result;
//    }
}

public class MyThread {
    public static void main(String ards[]) throws InterruptedException, ExecutionException {

//        for (int i = 0; i < 10; i++) {
//            Callable<Integer> implCallable = new ImplCallable();
//            FutureTask<Integer> futureTask = new FutureTask<Integer>(implCallable);
//            new Thread(futureTask).start();
//            System.out.println(Thread.currentThread().getName() + "----" + futureTask.get());
//        }
//        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Callable<Integer> implCallable = new ImplCallable();
            FutureTask<Integer> futureTask = new FutureTask<Integer>(implCallable);
            new Thread(futureTask).start();
            System.out.println(Thread.currentThread().getName() + "------" + futureTask.get());
        }
        System.out.println(Thread.currentThread().getName());
    }
}


