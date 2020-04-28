package com.atguigu.Interview.study.thread;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author lixiang
 * @date 2020-04-28-21:49
 * @description
 */

@Getter
@ToString
@AllArgsConstructor
class User {
    String userName;
    int age;
}

public class AtomicReferenceDemo {
    public static void main(String[] args) {
        AtomicReference<Object> atomicReference= new AtomicReference<>();

    }
}
