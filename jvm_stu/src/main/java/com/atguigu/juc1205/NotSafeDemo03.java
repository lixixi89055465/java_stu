package com.atguigu.juc1205;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 1.故障现象
 * java.util.ConcurentModificationException （并发修改异常)
 * 2.导致原因
 * 要线程安全就用vector,线程不安全就用arraylist
 * //        List<aString> list = new ArrayList<>();
 * //        List<aString> list = Collections.synchronizedList(new ArrayList<>());//new Vector()
 * 3.解决方法
 * 4.优化建议（同样的错误不要犯第 2 次）
 */
public class NotSafeDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        for (int i = 0; i <= 30; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put(Thread.currentThread()//
                                    .getName(), //
                            UUID.randomUUID().toString().substring(0, 8));
                    System.out.println(map);
                }
            }, String.valueOf(i)).start();
        }
    }

    private static void SetNotSafe() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(set);
            }, String.valueOf(i)).start();

        }
    }

    private static void listNotSafe() {
        //        List<aString> list = new ArrayList<>();
//        List<aString> list = Collections.synchronizedList(new ArrayList<>());//new Vector()
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i <= 3; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();

        }
    }
}
