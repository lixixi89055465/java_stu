package com.atguigu.Interview.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lixiang
 * @date 2020-05-17-17:33
 */
public class T1 {
    volatile int n = 0;

    public void add() {
        n++;
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);

    }
}
