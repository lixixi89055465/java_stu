package com.testjava8;

public class finallyTest {
    public static void main(String[] args) {
        System.out.println("main中的代码块的执行结果是:"+myMethod());
    }

    public static int myMethod(){
        try{
            System.out.println("try 代码被执行 ! ");
            return num();
        }finally {
            System.out.println("finally 代码块被执行 ! ");
        }
    }
    public static int num(){
        System.out.println("num 代码 快被执行 !");
        return 2;
    }
    public static int myMethod2(){
        int i=1;
        try{
            System.out.println("try 代码被执行 ! ");
            i=3;
        }finally {
            i++;
            System.out.println("finally 代码块被执行 ! ");
            System.out.println("finally 代码块中的 i ="+i);
        }
        return i;
    }
    public static int myMethod1() {
        int i = 1;
        try {
            System.out.println("Try 代码块被执行 !");
            return i;
        } finally {
            i++;
            System.out.println("finally 代码块被执行!");
            System.out.println("finally 代码块中的 i = " + i);

        }
    }

}
