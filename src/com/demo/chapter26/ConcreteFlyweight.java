package com.demo.chapter26;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 8:18 PM
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println(extrinsicstate + "共享flyweight");
    }
}
