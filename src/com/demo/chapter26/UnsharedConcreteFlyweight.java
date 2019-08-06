package com.demo.chapter26;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 8:19 PM
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println(extrinsicstate + "不共享flyweight");
    }
}
