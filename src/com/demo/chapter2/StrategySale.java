package com.demo.chapter2;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/29 8:21 PM
 */
public class StrategySale extends Strategy {

    private double discount;

    public StrategySale(double discount) {
        this.discount = discount;
    }

    @Override
    public double algorithmInterface(double money) {
        return money * discount;
    }
}
