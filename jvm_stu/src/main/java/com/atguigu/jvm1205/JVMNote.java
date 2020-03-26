package com.atguigu.jvm1205;


/**
 * 6.stack
 * 6.1  栈管运行，堆管理存储.
 * 6.2 栈保存哪些东西 ?
 * ***8种基本类型的变量+对象的引用变量+实例方法都是在函数的栈内存种分配
 * 栈帧中主要存储3类数据
 * 本地变量（Local Variables) :输入参数和输出参数以及方法的变量
 * 栈操纵（Operand Stack): 记录出栈、入栈的操作；
 * 栈帧数据（Frame Data) :包括类文件、方法等等。
 * 每个方法执行的同事都会创建一个栈帧，用于存储局部变量表、操作数栈、
 * 动态链接、方法出口等信息。每个方法从调用直至执行完毕的过程，就对应着一个栈帧在虚拟机中入栈到出栈的过程。
 * 栈的大小和具体的JVM的实现相关，通常在256K-756K之间，与等于1Mb左右。
 */
public class JVMNote {
    public int add(int x, int y) {
        int result = -1;
        result = x + y;
        return result;
    }

    public static void main(String[] args) {
//        Person p1 = new Person
    }
}
