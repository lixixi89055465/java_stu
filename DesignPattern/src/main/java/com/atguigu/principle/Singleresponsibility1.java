package com.atguigu.principle;

/**
 * @author lixiang
 * @date 2020-03-31-21:50
 */
public class Singleresponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("小汽车");
        vehicle.run("飞机");

    }
}

//交通工具类

/**
 * 交通工具类
 * 1.在方式一 的run方法中，违反了但一职责原则
 * 2。解决的方案很简单，根据交通运行方式的不同。
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "\t在公路上跑...");
    }
}
