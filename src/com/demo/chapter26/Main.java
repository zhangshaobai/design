package com.demo.chapter26;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   享元模式(Flyweight):运用共享技术有效地支持大量细粒度的对象
 * @author: zhangpeng
 * @date: 2019/8/6 7:17 PM
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight(10);
        Flyweight f2 = factory.getFlyweight(12);
        Flyweight f3 = factory.getFlyweight(12);
        Flyweight f4 = new UnsharedConcreteFlyweight();

        f1.operation(100);
        f2.operation(200);
        f3.operation(300);
        f4.operation(400);
        System.out.println(f2 == f3);
    }
}
