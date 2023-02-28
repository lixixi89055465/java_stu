package com.atguigu.interview.study.thread;

import com.atguigu.interview.enums.CountryEnum;

import java.util.concurrent.CountDownLatch;

/**
 * @author lixiang
 * @date 2020-05-18-23:38
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        dieState();
//        closeDoor();
    }

    private static void dieState() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 国,被灭 ");
                countDownLatch.countDown();
            }, CountryEnum.forEach_CountryEnum(i).getRetMessage()).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + "\t ###### 秦帝国，一统华夏！ ");
        System.out.println();
        System.out.println(CountryEnum.ONE);
        System.out.println(CountryEnum.ONE.getRetCode());
        System.out.println(CountryEnum.ONE.getRetMessage());
    }

    private static void closeDoor() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 上完自习，离开教室 ");
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + "\t ###### 班长最后关门走人 ！ ");

    }
}
