package com.testjava8;

import java.util.ArrayList;
import java.util.List;

public class toArrayTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(2);
        list.add("guan");
        list.add("bao");
        String []array=list.toArray(new String[0]);
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
