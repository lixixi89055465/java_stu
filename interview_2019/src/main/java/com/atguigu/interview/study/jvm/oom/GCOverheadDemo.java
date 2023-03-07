package com.atguigu.interview.study.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiang
 * @date 2020-05-21-19:37
 * JVM 参数配置演示
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 * <p>
 * GC 回收时间过长会抛出OutOfMemeroyError.过长的定义是，超出98%的时间用来做 GC，并且回收了不到2%的堆内存
 * 连续多次GC都只回收了不到2%的极端情况下才会抛出，假如不跑出GC overhead Limit 错误会发生什么情况呢。
 * 那就是GC清理的这么点内存很快会再次填满，迫使GG再次执行，这样就形成了恶性魂环。
 * CPU的使用率一直是100%,而 GC却没有任何效果
 * java.lang.OutOfMemoryError: GC overhead limit exceeded
 */
public class GCOverheadDemo {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();

        try {
            while (true) {
                list.add(String.valueOf(++i).intern());
            }
        } catch (Throwable e) {
            System.out.println("*********i:" + i);
            e.printStackTrace();
            throw e;
        }
    }
}
