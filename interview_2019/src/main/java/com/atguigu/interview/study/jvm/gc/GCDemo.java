package com.atguigu.interview.study.jvm.gc;

import java.util.Random;

/**
 * @author lixiang
 * @date 2020-05-22-16:58
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:UseG1GC
 */
public class GCDemo {
    public static void main(String[] args) {
        System.out.println("************GCDemo hello");

        try {
            String str = "atguigu";
            while (true) {
                str += str + new Random().nextInt(7777777) + new Random().nextInt(88888888);
                str.intern();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
