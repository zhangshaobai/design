package com.demo.chapter28;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/7 2:32 PM
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitConcreteElementA(Element elementA) {
        System.out.println("ConcreteVisitorA 访问 ConcreteElementA");
    }

    @Override
    public void visitConcreteElementB(Element elementB) {
        System.out.println("ConcreteVisitorA 访问 ConcreteElementB");
    }
}
