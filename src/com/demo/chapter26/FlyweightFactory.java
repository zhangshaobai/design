package com.demo.chapter26;

import java.util.Hashtable;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 8:20 PM
 */
public class FlyweightFactory {
    Hashtable<Integer, Flyweight> flyweights = new Hashtable<>();

    public Flyweight getFlyweight(int key) {
        if(!flyweights.containsKey(key)) {
            flyweights.put(key,new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }
}
