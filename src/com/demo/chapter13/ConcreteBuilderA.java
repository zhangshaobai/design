package com.demo.chapter13;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 6:03 PM
 */
public class ConcreteBuilderA extends Builder {

    private Product product = new Product();

    public ConcreteBuilderA() {
    }


    @Override
    public void buildPartA() {
        product.add("partA");
    }

    @Override
    public void buildPartB() {
        product.add("partB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
