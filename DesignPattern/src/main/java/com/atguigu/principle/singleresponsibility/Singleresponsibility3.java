package com.atguigu.principle.singleresponsibility;

/**
 * @author lixiang
 * @date 2020-03-31-21:50
 */
public class Singleresponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}


//交通工具类

/**
 * 方式三的分析
 * 1。这种修改方法没有对原来的类做大的修改，知识增加了方法。
 * 2。这里虽然没有在类这个级别准守单一职责原则，但是方法级别上，仍然是遵守单一职责原则
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "\t在公路上跑...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "\t在天空上运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "\t在水中行 ...");
    }


}