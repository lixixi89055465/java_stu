package com.atguigu.Interview.study.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @author lixiang
 * @date 2020-05-19-01:01
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        new CyclicBarrier(7, () -> {
            System.out.println("**************召唤神龙");
        });
        for (int i = 0; i < 10; i++) {
            final int tempInt = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t收集到第：" + tempInt + "龙珠");
            }, String.valueOf(i)).start();
        }

    }
}
