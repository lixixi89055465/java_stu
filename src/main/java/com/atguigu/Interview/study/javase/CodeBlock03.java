package com.atguigu.Interview.study.javase;

/**
 * 静态方法 > 代码块 > 构造方法
 */
class CodeZY {
    public CodeZY() {
        System.out.println("Code 的构造方法 11111");
    }

    {
        System.out.println("Code 的构造快 22222");
    }

    static {
        System.out.println("Code 的静态代码块 3333");
    }
}

public class CodeBlock03 {
    {
        System.out.println("Code Block 3 的构造块 444");
    }

    static {
        System.out.println("Code Block3 的静态代码块 5555");
    }

    public CodeBlock03() {
        System.out.println("CodeBlock03的构造方法666");
    }

    public static void main(String[] args) {
        System.out.println("-----我是美丽的分割线 ------CodeBlock03 ");
        new CodeZY();
        System.out.println("-----------------------");
        new CodeZY();
        System.out.println("-----------------");
        new CodeBlock03();
    }

}
