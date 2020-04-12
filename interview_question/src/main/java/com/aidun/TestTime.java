package com.aidun;

import java.time.Instant;

/**
 * 获取当前毫秒数 System.currentTimeMillis(); 而不是 new Date().getTime();
 * 说明：如果想获取更加精确的纳秒级时间值，使用 System.nanoTime()的方式。在 JDK8 中，针对统计时
 * 间等场景，推荐使用 Instant 类。
 */
public class TestTime {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        System.out.println( Instant.now());
    }

}
