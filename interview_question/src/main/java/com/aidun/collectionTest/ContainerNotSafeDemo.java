package com.aidun.collectionTest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author lixiang
 * @date 2020-04-30-22:17
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        Set<String> set = Collections.synchronizedSet(new HashSet<>());//
        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0, 8));
            }, String.valueOf(i)).start();
        }
    }

}
