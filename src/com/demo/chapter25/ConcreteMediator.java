package com.demo.chapter25;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 6:40 PM
 */
public class ConcreteMediator extends Mediator {

    private Colleague colleagueA;
    private Colleague colleagueB;

    @Override
    public void declare(String message, Colleague colleague) {
        if(colleague == colleagueA) {
            colleagueA.getMsg(message);
        }else if(colleague == colleagueB) {
            colleagueB.getMsg(message);
        }
    }

    public void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }
}
