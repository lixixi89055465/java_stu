package com.atguigu.interview.study.jvm.ref;

import java.lang.ref.WeakReference;

/**
 * @author lixiang
 * @date 2020-05-21-10:55
 */
public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(o1);
        System.out.println(o1);
        System.out.println(weakReference.get());
        o1 = null;
        System.gc();
        System.out.println("==============");
        System.out.println(o1);
        System.out.println(weakReference.get());


    }
}
