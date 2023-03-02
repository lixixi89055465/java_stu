package com.atguigu.jvm1205;

public class T2 {
    public static void main(String[] args) {
//        System.gc();
        Jvm_parameter();
    }

    private static void Jvm_parameter() {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long maxMemory = Runtime.getRuntime().maxMemory();//返回java虚拟机试图使用的最大内存存量
        long totalMemory = Runtime.getRuntime().totalMemory();//返回java虚拟机中的内存总量
        System.out.println("-Xmx: Max_memory" + maxMemory);
        System.out.println("-Xmx:Max_memory" + maxMemory / (1024 * 1014 * 1.0));
        System.out.println("-Xms:total_memory" + totalMemory);
        System.out.println("-Xms:total_memory" + totalMemory / (1024 * 1024 * 1.0));
    }
}
