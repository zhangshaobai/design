package com.demo.chapter2;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   策略模式:定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户
 * @author: zhangpeng
 * @date: 2019/7/29 8:01 PM
 */
public class Main {

    public static  void main(String[] args) {
        double price = 22.23;
        int count = 20;

        Context context = new Context("满300减100");

        System.out.println(context.getResult(price * count));
    }
}
