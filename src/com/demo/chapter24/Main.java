package com.demo.chapter24;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   职责链模式(Chain of Responsibility):使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 *          将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * @author: zhangpeng
 * @date: 2019/8/6 4:07 PM
 */
public class Main {
    public static void main(String[] args) {
        int[] requestArr = {6,10,15,23,30};
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        for(int i : requestArr) {
            handlerA.handleRequest(i);
        }
    }
}
