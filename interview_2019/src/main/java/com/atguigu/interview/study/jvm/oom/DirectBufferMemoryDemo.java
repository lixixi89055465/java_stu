package com.atguigu.interview.study.jvm.oom;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/**
 * @author lixiang
 * @date 2020-05-22-08:51
 * 配置参数
 *  -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 */
public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
//        System.out.println("配置的maxDirectMemory:" + (sun.misc.VM.maxDirectMemory() / (double) 1024 / 1024) + "MB");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ByteBuffer.allocateDirect(4 * 1024 * 1024);
    }
}
