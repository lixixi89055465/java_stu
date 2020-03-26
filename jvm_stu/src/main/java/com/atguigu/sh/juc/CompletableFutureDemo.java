package com.atguigu.sh.juc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture =//
                CompletableFuture.runAsync(() -> {
                    System.out.println(Thread.currentThread().getName() + "没有返回，update mysql !");
                });
        completableFuture.get();
        //异步回调
        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "有返回，insert mysql ok");
            int i = 10 / 0;
            return 1023;
        });

        completableFuture2.whenComplete((t, u) -> {
            System.out.println("---------t=" + t);
            System.out.println("---------u=" + u);
        }).exceptionally(f -> {
            System.out.println("--------exception : " + f.getMessage());
            return 4444;
        }).get();




    }
}
