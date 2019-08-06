package com.demo.chapter22;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   桥接模式(Bridge):将抽象部分与它的实现部分分离，使它们都可以独立地变化
 * @author: zhangpeng
 * @date: 2019/8/5 7:01 PM
 */
public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
