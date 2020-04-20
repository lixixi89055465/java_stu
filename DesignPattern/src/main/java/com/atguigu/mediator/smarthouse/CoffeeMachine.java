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

    }
}
