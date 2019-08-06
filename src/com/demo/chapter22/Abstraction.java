package com.demo.chapter22;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 11:46 AM
 */
public abstract class Abstraction {
    private Implementor implementor;

    public abstract void operation();

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
