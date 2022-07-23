package com.test9;

import java.io.IOException;
import java.util.Optional;

public class java9Test06 {
    public static void main(String[] args) throws IOException {
        Test<String> test=new Test<>("AAAA"){
            @Override
            public String test() {
                return t;
            }
        };
        System.out.println(test.test());
    }
}
