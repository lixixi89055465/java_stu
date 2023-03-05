package com.atguigu.interview.study.jvm.ref;

/**
 * @author lixiang
 * @date 2020-05-21-08:39
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:UseG1GC
 * -Xms128m -Xmx1024m -Xss1024k -XX:MetaspaceSize=512m -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseSerialGC
 * +PrintGCDetails -XX:+UseSerialGC -Xms:10m -Xmx:10m -XX:SurvivorRatio=8
 * +PrintGCDetails -XX:+UseSerialGC -Xms:10m -Xmx:10m -XX:SurvivorRatio=4
 * +PrintGCDetails -XX:+UseSerialGC -Xms:10m -Xmx:10m -XX:NewRatio=2
 * jinfo -flag MaxTenuringThreshold  线程
 *
 * -XX:MaxTenuringThreshold=20
 */
public class HelloGC {
    public static void main(String[] args) throws InterruptedException {
//        test();
        test1();
    }

    private static void test1() throws InterruptedException {
        System.out.println("*****************HelloGC");
        Thread.sleep(Integer.MAX_VALUE);
    }

    private static void test() {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("TOTAL_MEMORY(-Xms)=" + totalMemory + "(字节)、" + (totalMemory / (double) 1024 / 1024) + "MB");
        System.out.println("MAX_MEMORY(-Xmx) = " + maxMemory + "(字节)、" + (maxMemory / (double) 1024 / 1024) + "MB");
//        Thread.sleep(Integer.MAX_VALUE);
//        System.out.println("***********hello GC ");
//        byte[] bytes = new byte[50 * 1024 * 1024];
        System.out.println(5.00 - 4.90);
        System.out.println(300 - 210);
    }
}
