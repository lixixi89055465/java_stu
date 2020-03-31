package com.atguigu.principle;

/**
 * @author lixiang
 * @date 2020-03-31-21:50
 */
public class Singleresponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 方案二
 * 1。准守了单一职责原则
 * 2。但是这样类的改动很大，即将类分解。同时修改客户端
 * 3。改进，直接修改vehicle 类，改动的代码会比较少
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "\t在公路上运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "\t在天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "\t在水中运行");
    }
}
