package com.demo.chapter12;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 5:26 PM
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade () {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    public void methodA() {
        subSystemOne.method();
        subSystemTwo.method();
    }

    public void methodB() {
        subSystemTwo.method();
    }
}
