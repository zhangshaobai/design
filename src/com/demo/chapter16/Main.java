package com.demo.chapter16;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   状态模式:当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
 * @author: zhangpeng
 * @date: 2019/8/2 3:37 PM
 */
public class Main {
    public static void main(String[] args) {
        Work w = new Work();
        w.setHour(19);

        w.handle();
    }
}
