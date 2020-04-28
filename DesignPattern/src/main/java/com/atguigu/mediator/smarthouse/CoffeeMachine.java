package com.atguigu.mediator.smarthouse;

/**
 * @author lixiang
 * @date 2020-04-20-18:09
 * @description
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void startCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
