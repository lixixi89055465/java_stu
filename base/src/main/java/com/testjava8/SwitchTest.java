package com.testjava8;

public class SwitchTest {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(String param){
        switch (param){
            case "sth":
                System.out.println("It's sth");
                break;
            case "null":
                System.out.println("It's null");
                break;
            default:
                System.out.println("It's default");
                break;
        }

    }
}
