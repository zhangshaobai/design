package com.demo.chapter2;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/29 8:23 PM
 */
public class StrategyReturn extends Strategy {

    private double enoughMoney;
    private double returnMoney;

    public StrategyReturn(double enoughMoney, double returnMoney) {
        this.enoughMoney = enoughMoney;
        this.returnMoney = returnMoney;
    }


    @Override
    public double algorithmInterface(double money) {
        double result = money;
        if(money >= enoughMoney) {
            result = money -  Math.floor(money/enoughMoney) * returnMoney;
        }
        return result;
    }
}
