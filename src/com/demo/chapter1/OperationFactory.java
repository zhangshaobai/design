package com.demo.chapter1;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/29 7:11 PM
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMulti();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }


}
