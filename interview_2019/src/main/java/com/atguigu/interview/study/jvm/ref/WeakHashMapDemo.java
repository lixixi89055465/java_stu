package com.atguigu.interview.study.jvm.ref;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * @author lixiang
 * @date 2020-05-21-11:32
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        myHashMap();
        System.out.println("111111111111111111111111111111111111111");
        myWeakHashMap();
    }

    private static void myHashMap() {
        HashMap<Integer, String> map = new HashMap<>();

        Integer key = new Integer(1);
        String value = "HashMap";
        map.put(key, value);
        System.out.println(map);

        key = null;
        System.out.println(map + "\t" + map.size());
    }


    private static void myWeakHashMap() {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        Integer key = new Integer(2);
        String value = "HashMap";
        map.put(key, value);
        System.out.println(map);

        key = null;
        System.out.println(map);
        System.gc();
        System.out.println(map + "\t" + map.size());
    }
}
