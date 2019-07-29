package com.demo.chapter1;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/29 7:15 PM
 */
public class Main {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(12.34);
        operation.setNumberB(45.67);
        System.out.println(operation.getResult());
    }
}
