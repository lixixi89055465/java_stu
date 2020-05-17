package com.atguigu.Interview.study.thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author lixiang
 * @date 2020-04-29-21:50
 * 集合类不安全的问题
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {

//        HashMap<Object, String> map = new HashMap<>();
//        Map<Object, String> map = Collections.synchronizedMap(new HashMap<>());
        Map<Object, String> map = new ConcurrentHashMap<>();
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 8));
                System.out.println(map);
            }, String.valueOf(i)).start();

        }
    }

    private static void test2() {
        //        Set<String> set = new HashSet<>();
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(set);
            }, String.valueOf(i)).start();
            new HashSet<>().add("a");
        }
    }

    private static void testList() {
        //        List<String> list = new ArrayList<>();
//        List<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();
        list.forEach(System.out::println);
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();

        }
    }
}
