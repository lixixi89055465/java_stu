package com.testjava9;

import java.io.IOException;
import java.util.Optional;

public class java9Test05 {
    public static void main(String[] args) throws IOException {
//        String str="AAAA";
        String str=null;
        Optional.ofNullable(str).ifPresentOrElse(s->{
            System.out.println("被包装的元素未:"+s);
        },()->{
            System.out.println("被包装的元素未null");
        });

    }
}
