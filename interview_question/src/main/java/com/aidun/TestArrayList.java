package com.aidun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff");
        List<String> subList = strList.subList(0, 2);
        System.out.println(subList.getClass());
        subList.forEach(e -> {
            System.out.println(e);
        });


    }
}
