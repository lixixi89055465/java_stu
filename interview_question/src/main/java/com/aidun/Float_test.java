package com.aidun;

import java.math.BigDecimal;

public class Float_test {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        Float a=1.0f-0.9f;
        Float b=0.9f-0.8f;
        Float c=0.101f;
        Float d=0.10f;
        Float e=0.10f;
        Integer g=1000;
        Integer h=1000;
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(d));
        System.out.println(a.compareTo(e));
        System.out.println(g.compareTo(h));

        BigDecimal b1=BigDecimal.valueOf(1-0.9);
        BigDecimal b2=BigDecimal.valueOf(0.9-0.8);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));


        BigDecimal b3=BigDecimal.valueOf(0.1);
        BigDecimal b4=BigDecimal.valueOf(0.10);
        System.out.println(b3.equals(b4));
        Double d1=0.1;
        Double d2=0.1;
        System.out.println(BigDecimal.valueOf(d1));
        System.out.println(new BigDecimal(d2));
        System.out.println(new BigDecimal(d2.toString()));
        Double d3=0.1;
        System.out.println(d3);
        System.out.println(d3.toString());

    }

    private static void test1() {
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        float diff = 1.0e-6f;
        if (Math.abs(a - b) < diff) {
            System.out.println(true);
        }
    }
}
