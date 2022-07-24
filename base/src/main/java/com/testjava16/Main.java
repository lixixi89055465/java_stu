package com.testjava16;

public class Main {
    public static void main(String[] args) {
//        test("AAAA",null);
        Account a=new Account("zhangsan","password");
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(a.name());
        Account a0=new Account("Admin","123456");
        Account a1=new Account("Admin","123456");
        System.out.println(a0.equals(a1));
        System.out.println("1111111111111111");
    }

    public static void test(String a,String b) {
        int length=a.length()+b.length();
        System.out.println(length);
    }
}
