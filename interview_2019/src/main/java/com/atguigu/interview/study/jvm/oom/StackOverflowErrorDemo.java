package com.atguigu.interview.study.jvm.oom;

/**
 * @author lixiang
 * @date 2020-05-21-17:45
 */
public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError() {
        stackOverflowError();//	at com.atguigu.interview.study.jvm.oom.StackOverflowErrorDemo.stackOverflowError
    }
}
