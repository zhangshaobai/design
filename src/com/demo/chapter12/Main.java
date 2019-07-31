package com.demo.chapter12;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   外观模式/门面模式:为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 * @author: zhangpeng
 * @date: 2019/7/31 5:10 PM
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
