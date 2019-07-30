package com.demo.chapter7;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 7:30 PM
 */
public class RealSubject implements Subject {

    private Target target;

    public RealSubject(Target target) {
        this.target = target;
    }

    @Override
    public void request() {
        System.out.println(target.getName() + ":动作");
    }
}
