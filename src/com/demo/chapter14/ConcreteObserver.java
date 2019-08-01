package com.demo.chapter14;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/1 5:52 PM
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String msg;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "收到消息:" + msg);
    }
}
