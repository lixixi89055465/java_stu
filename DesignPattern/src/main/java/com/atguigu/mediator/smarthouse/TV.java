package com.atguigu.mediator.smarthouse;

/**
 * @author lixiang
 * @date 2020-04-21-09:20
 * @description
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }


    public void startTV() {
        System.out.println("It's time to StartTv ! ");
    }

    public void stopTV() {
        System.out.println("StopTV!");
    }
}
