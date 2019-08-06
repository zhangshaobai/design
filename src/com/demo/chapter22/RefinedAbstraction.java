package com.demo.chapter22;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 11:47 AM
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        this.getImplementor().run();
    }
}
