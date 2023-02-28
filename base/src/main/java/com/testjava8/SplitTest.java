package com.testjava8;

public class SplitTest {
    public static void main(String[] args) {
        String str="a,b,c,,1,,\t, ";
        String[] ary=str.split(",");
        System.out.println(ary.length);
        for (String s : ary) {
            System.out.println(s);
        }

    }
}
