package com.demo.chapter1;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/29 7:04 PM
 */
public class OperationMulti extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() * this.getNumberB();
        return result;
    }
}
