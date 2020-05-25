package com.atguigu.interview.study.jvm.oom;

import java.util.Random;

/**
 * @author lixiang
 * @date 2020-05-21-17:51
 */
public class JavaHeapSpaceDemo {
    public static void main(String[] args) {
        String str = "atguigu";
        while (true) {
            str += str + new Random().nextInt(111111111) + new Random(22222222);
            str.intern();
        }
    }
}
