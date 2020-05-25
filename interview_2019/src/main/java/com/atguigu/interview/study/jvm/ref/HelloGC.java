package com.atguigu.interview.study.jvm.ref;

/**
 * @author lixiang
 * @date 2020-05-21-08:39
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:UseG1GC
 */
public class HelloGC {
    public static void main(String[] args) throws InterruptedException {
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        long maxMemory = Runtime.getRuntime().maxMemory();
//        System.out.println("TOTAL_MEMORY(-Xms)=" + totalMemory + "(字节)、" + (totalMemory / (double) 1024 / 1024) + "MB");
//        System.out.println("MAX_MEMORY(-Xmx) = " + maxMemory + "(字节)、" + (maxMemory / (double) 1024 / 1024) + "MB");
        Thread.sleep(Integer.MAX_VALUE);
        System.out.println("***********hello GC ");
//        byte[] bytes = new byte[50 * 1024 * 1024];

    }
}
