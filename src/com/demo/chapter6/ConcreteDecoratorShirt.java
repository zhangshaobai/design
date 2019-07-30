package com.demo.chapter6;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 5:50 PM
 */
public class ConcreteDecoratorShirt extends DecoratorPerson {
    @Override
    public void show() {
        System.out.println("T恤 ");
        this.getComponentPerson().show();
    }
}
