package com.atguigu.principle.liskov;

/**
 * @author lixiang
 * @date 2020-04-01-15:54
 */
public class Liskov {
    public static void main(String[] args) {

    }
}

//A 类
class A {
    //返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
//B类继承了A类
