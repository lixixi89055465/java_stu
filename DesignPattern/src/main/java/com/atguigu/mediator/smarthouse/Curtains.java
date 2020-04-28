package com.atguigu.mediator.smarthouse;

/**
 * @author lixiang
 * @date 2020-04-21-09:10
 * @description
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains ! ");
    }
}
