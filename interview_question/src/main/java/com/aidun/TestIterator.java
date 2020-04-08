package com.aidun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lixiang,
 * @date 2020/4/8
 * 不要在 foreach 循环里进行元素的 remove/add 操作。remove 元素请使用
 * Iterator 方式，如果并发操作，需要对 Iterator 对象加锁。
 */
public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String item : list) {
            if ("3".equals(item)) {
                list.remove(item);
            }
        }
    }

    private static void test1() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next == "1") {
                iterator.remove();
            }
        }
    }
}
