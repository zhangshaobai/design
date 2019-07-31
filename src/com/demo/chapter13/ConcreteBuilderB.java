package com.demo.chapter13;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 6:07 PM
 */
public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    public ConcreteBuilderB() {
    }

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
