package com.atguigu.interview.study.jvm.oom;

import java.util.concurrent.TimeUnit;

/**
 * @author lixiang
 * @date 2020-05-22-09:21
 * 高并发请求服务器时，经常出现如下异常:java.lang.OutOfMemeoryError:unable to create new Native thread
 * 准确的讲该native thread 异常与对应的平台有关
 * <p>
 * 导致原因：
 * 1   你的应用创建了太多线程了，一个应用进程创建多个线程，超过系统承载极限
 * 2   你的服务器并不允许你的应用程序创建这么多线程，linux系统默认允许单个进程可以创建的线程数是1024 个，
 * 你的应用超过这个数量，就会报 java.lang.OutOfMemoryError:unable to create new native thread
 * <p>
 * 解决办法：
 * 1。想办法降低你应用程序创建线程的数量，分析应用是否真的需要创建这个多线程，如果不是，该代码将线程数降到最低 ，
 * 2。对于有用的应用，确实需要创建很多线程，远超过linux 系统默认的1024个线程的限制，可以通过修改Linux服务器配置，扩大linux 默认限制
 */
public class UnableCreateNewThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println("************* i=" + i);
            new Thread(() -> {
                try {
                    TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
