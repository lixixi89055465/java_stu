package com.atguigu.interview.study.jvm.gc;

import java.util.Random;

/**
 * @author lixiang
 * @date 2020-05-22-16:58
 * 1
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseSerialGC  (DefNew + Tenured)
 * 2
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParNewGC  (ParNew + Tenured)
 * Java HotSpot(TM) 64-Bit Server VM warning:
 * Using the ParNew young collector with the Serial old collector is deprecated and will likely
 * be removed in a future release
 *
 * 3
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParalleGC  (PSYoungGen + ParoldGen)
 *
 * 4
 * 4.1
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandFlags -XX:+UseParallelOldGC (PSYoungGen + ParoldGen)
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:UseG1GC
 */
public class GCDemo {
    public static void main(String[] args) {
        System.out.println("************GCDemo hello");

//        try {
//            String str = "atguigu";
//            while (true) {
//                str += str + new Random().nextInt(7777777) + new Random().nextInt(88888888);
//                str.intern();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }
}
