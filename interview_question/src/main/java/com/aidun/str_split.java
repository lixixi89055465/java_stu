package com.aidun;

/**
 * @author lixiang
 * @date 2020-04-07-21:36
 */
public class str_split {
    public static void main(String[] args) {
        String str="a,b,c,,";
        String []ary=str.split(",");
        System.out.println(ary.length);
        str="a,b,c,,d";
        ary=str.split(",");
        for (int i = 0; i < ary.length;i++) {
            System.out.println(ary[i]);
        }
    }
}
