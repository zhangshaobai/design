package com.demo.chapter13;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   建造者模式:将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * @author: zhangpeng
 * @date: 2019/7/31 5:41 PM
 */
public class Main {

    public static void main(String[] args) {

        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();


        Director director = new Director(builderA);
        director.construct();
        Product p1 = builderA.getResult();
        p1.show();


        director = new Director(builderB);
        director.construct();
        Product p2 = builderB.getResult();
        p2.show();

    }
}
