package com.demo.chapter6;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 5:52 PM
 */
public class ConcreteDecoratorTrouser extends DecoratorPerson {
    @Override
    public void show() {
        System.out.println("裤子 ");
        this.getComponentPerson().show();
    }
}
