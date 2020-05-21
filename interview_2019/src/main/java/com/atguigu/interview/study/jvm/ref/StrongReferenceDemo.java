package com.atguigu.interview.study.jvm.ref;

import java.lang.ref.SoftReference;

/**
 * @author lixiang
 * @date 2020-05-21-10:15
 */
public class StrongReferenceDemo {


    private static void test1() {
        Object obj1 = new Object();//这样的定义默认就是强引用
        Object obj2 = new Object();//obj2引用赋值
        obj1 = null;//置空
        System.gc();
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        test1();
    }
}
