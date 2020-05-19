package com.atguigu.interview.study.thread;

import java.util.Arrays;
import java.util.List;

/**
 * @author lixiang
 * @date 2020-04-28-12:13
 * @description
 */
public class stream_test {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(Integer.valueOf(1000), 30000, 40000);
        integers.stream().forEach(e -> {
            e=30000;
        });
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }
}
