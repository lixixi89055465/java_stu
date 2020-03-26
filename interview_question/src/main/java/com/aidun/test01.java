package com.aidun;

import java.time.LocalDateTime;

/**
 * @author lixiang
 * @date 2020-03-26-15:16
 */
public class test01 {
    public static void main(String[] args) {

    }



    public static int otherSpace(String str) {
        return str.length() - str.replaceAll("[^a-zA-Z0-9\\d]", "").length();
    }

    public static int numSpace(String str) {
        return str.length() - str.replaceAll(" ", "").length();
    }

    public static int numNum(String str) {
        return str.length() - str.replaceAll("\\d", "").length();
    }

    public static int abcNum(String str) {
        return str.length() - str.replaceAll("[a-zA-Z0-9]", "").length();
    }


    /**
     * 回文数
     *
     * @param integer
     * @return
     */
    public static boolean palindrom(Integer integer) {
        String str1 = String.valueOf(integer);
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }


}
