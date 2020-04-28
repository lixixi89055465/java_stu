package com.atguigu.mediator.smarthouse;

import java.util.HashMap;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class ConcreteMediator extends Mediator {
    /**
     * 集合，放入所有的同事对象
     */
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("curtains", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     */
    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV) colleagueMap.get(interMap.get("TV"))).startTV();
            }else if(stateChange==1){
                ((TV) colleagueMap.get(interMap.get("TV"))).stopTV();
            }
        }else if(colleagueMap.get(colleagueName) instanceof  CoffeeMachine){
            ((Curtains)colleagueMap.get(interMap.get("curtains"))).UpCurtains();
        }else if(colleagueMap.get(colleagueName) instanceof TV){

        }else if(colleagueMap.get(colleagueName) instanceof Curtains){
            //
        }

    }

    @Override
    public void SendMessage() {
        //处理闹钟发出的声音


    }

}
