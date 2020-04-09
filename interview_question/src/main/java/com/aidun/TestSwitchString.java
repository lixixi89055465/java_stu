package com.aidun;

/**
 * 当 switch 括号内的变量类型为 String 并且此变量为外部参数时，必须先进行 null
 * 判断。
 */
public class TestSwitchString {
    public static void main(String[] args) {
        method("");
    }


    public static void method(String param) {
        switch (param) {
            // 肯定不是进入这里
            case "sth":
                System.out.println("it's sth");
                break;
            // 也不是进入这里
            case "null":
                System.out.println("it's null");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
        }
    }
}
