package com.demo.chapter8;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   工厂方法模式:定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
 * @author: zhangpeng
 * @date: 2019/7/30 8:01 PM
 */
public class Main {

    public static void main(String[] args) {
//        ILeiFengFactory leiFengFactory = new StudentFactory();
//        LeiFeng leiFeng = leiFengFactory.createLeiFeng();
//        leiFeng.buyRice();


        ILeiFengFactory leiFengFactory = new VolunteerFactory();
        LeiFeng leiFeng = leiFengFactory.createLeiFeng();
        leiFeng.wash();
    }
}
