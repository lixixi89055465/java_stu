package com.atguigu.interview.study.jvm.ref;

import java.lang.ref.SoftReference;

/**
 * @author lixiang
 * @date 2020-05-21-10:28
 */
public class SoftReferenceDemo {
    /**
     * 内存够用的时候就保留，不够用就回收
     */
    public static void softRef_Memeory_Enough() {
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());
        o1 = null;
        System.gc();
        System.out.println(o1);
        System.out.println(softReference.get());
    }

    public static void softRef_Memeory_NotEnough() {
        //-Xms10m -Xmx10m -XX:PrintGCDetails
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());
        o1 = null;
//        System.gc();
        try {
            byte[] bytes = new byte[1024 * 1024 * 8];
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println(o1);
            System.out.println(softReference.get());
        }
    }

    public static void main(String[] args) {
//        softRef_Memeory_Enough();
        softRef_Memeory_NotEnough();
    }
}
