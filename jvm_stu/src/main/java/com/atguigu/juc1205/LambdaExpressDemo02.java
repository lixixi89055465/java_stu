package com.atguigu.juc1205;

//@FunctionalInterface
interface Foo {
    //    public void sayHello();
    public int add(int x, int y);

    default int mul(int x, int y) {
        return x * y;
    }

    default int mul1(int x, int y) {
        return x * y;
    }

    public static int div2(int x, int y) {
        return x / y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}


/**
 * 函数编程
 * 1.拷贝中括号，写死有箭头，落地大括号
 * 2.@FunctionalInterface
 * 3.default
 * 4.public static
 */
public class LambdaExpressDemo02 {
    public static void main(String[] args) {


//        Foo foo = new Foo() {
//            @Override
//            public void sayHello() {
//                System.out.println("******* hello 1205");
//            }
//        };
//        foo.sayHello();


        Foo foo = (int x, int y) -> {
            System.out.println("*** ******* hello 1205 ");
            return x + y;
        };
        System.out.println(foo.add(1, 2));
        System.out.println(foo.mul(1, 5));
        System.out.println(Foo.div(5, 4));

    }
}
