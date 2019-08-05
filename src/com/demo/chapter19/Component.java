package com.demo.chapter19;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 3:53 PM
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
    public abstract void lineOfDuty(); //履行职责


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
