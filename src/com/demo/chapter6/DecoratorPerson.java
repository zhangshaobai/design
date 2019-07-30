package com.demo.chapter6;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 5:47 PM
 */
public abstract class DecoratorPerson implements ComponentPerson {

    private ComponentPerson componentPerson;

    @Override
    public abstract  void show();

    public void setComponentPerson(ComponentPerson componentPerson) {
        this.componentPerson = componentPerson;
    }

    public ComponentPerson getComponentPerson() {
        return componentPerson;
    }
}
