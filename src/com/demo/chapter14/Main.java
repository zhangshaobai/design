package com.demo.chapter14;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   观察者模式:定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *          这个主题对象在状态发生变化时，会通知所有观察者对象，是它们能够自动更新自己
 * @author: zhangpeng
 * @date: 2019/8/1 2:43 PM
 */
public class Main {
    public static void main(String[] args) {
        Observer observerA = new ConcreteObserver("客户端A");
        Observer observerB = new ConcreteObserver("客户端B");
        Observer observerC = new ConcreteObserver("客户端C");

        Subject subject = new ConcreteSubject();
        subject.attach(observerA);
        subject.attach(observerB);
        subject.attach(observerC);

        subject.notifyObserver("今天是8月1日");

        subject.detach(observerA);

        subject.notifyObserver("今天是8月1日");
    }
}
