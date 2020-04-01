package com.atguigu.principle.liskov.improve;

/**
 * @author lixiang
 * @date 2020-04-01-15:54
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-------------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
        System.out.println("-------------------------");
    }
}

//创建一个更加基础的基类
class Base {
//把更加基础的方法和成员写到base 当中，让A类继承到B类
}

//A 类
class A extends Base {
    //返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//B类继承了A类
//增加了一个新的功能：完成两个数想家，然后和9求和 ，由B来完成
class B extends Base {
    private A a = new A();

    //如果B类使用A类的方法，使用组合关系
    //这里 重写了A类的方法，可能是无意识的。
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //我们仍然想使用A类的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
