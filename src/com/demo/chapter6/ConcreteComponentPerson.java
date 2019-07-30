package com.demo.chapter6;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 5:44 PM
 */
public class ConcreteComponentPerson implements ComponentPerson {

    private String name;

    public ConcreteComponentPerson(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
