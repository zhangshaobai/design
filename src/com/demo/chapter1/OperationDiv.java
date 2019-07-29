package com.demo.chapter1;

import sun.reflect.annotation.ExceptionProxy;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/29 7:06 PM
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        if(this.getNumberB() == 0) {
            System.out.println("除数不能为0");
        }
        result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
