package com.demo.chapter25;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   中介者模式(Mediator):用一个中介对象来封装一系列的对象交互。
 *          中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 * @author: zhangpeng
 * @date: 2019/8/6 5:29 PM
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ColleagueA(mediator);
        Colleague colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.declare("A 发出声明");
        colleagueB.declare("B 发出声明");
    }
}
