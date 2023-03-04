package com.atguigu.jvm1205;


public class T2 {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        new Thread(() -> {
            try {
                Thread.sleep(3000);
                myNumber.addTo1205();
                System.out.println(Thread.currentThread().getName() + "\t A update number ,number value :" + myNumber.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();
        while (myNumber.number == 10) {
            //需要有一种机制通知main 现场，number 已经修改为12205,跳出while
        }
        System.out.println(Thread.currentThread().getName() + "\t mission is over");
    }

    private static void Jvm_parameter() {
        //-Xms1024m -Xmx1024m -XX:+PrintGCDetails
        System.out.println(Runtime.getRuntime().availableProcessors());
        long maxMemory = Runtime.getRuntime().maxMemory();//返回java虚拟机试图使用的最大内存存量
        long totalMemory = Runtime.getRuntime().totalMemory();//返回java虚拟机中的内存总量
        System.out.println("-Xmx: Max_memory" + maxMemory);
        System.out.println("-Xmx:Max_memory" + maxMemory / (1024 * 1014 * 1.0));
        System.out.println("-Xms:total_memory" + totalMemory);
        System.out.println("-Xms:total_memory" + totalMemory / (1024 * 1024 * 1.0));
    }

    protected static class MyNumber {
        volatile int number = 10;

        public void addTo1205() {
            number = 1205;
        }

    }
}
