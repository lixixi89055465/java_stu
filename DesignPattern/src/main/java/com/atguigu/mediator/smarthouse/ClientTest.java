package com.atguigu.mediator.smarthouse;

/**
 * @author lixiang
 * @date 2020-04-20-18:07
 * @description
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator= new ConcreteMediator();
        // 创建Alarm并且加入到列， Concretemediator 对象的 Hashmap
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建了 CoffeeMachine 对象，并且加入到ConcreteMediator 对象中
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        //创建Curtains ,并且加入到ConcreteMediator 对象的HashMap 中
        


    }
}
