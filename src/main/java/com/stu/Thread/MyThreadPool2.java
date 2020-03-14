package com.stu.Thread;

import java.util.concurrent.*;

public class MyThreadPool2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int result = 0;
                    for (int i = 0; i <= 10; i++) {
                        result += i;
                    }
                    return result;
                }
            });
            try {
                System.out.println(Thread.currentThread().getName() + "----" + future.get());
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }

        }
        executorService.shutdown();
    }
}
