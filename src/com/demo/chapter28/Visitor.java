package com.demo.chapter28;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/7 2:29 PM
 */
public interface Visitor {
    public void visitConcreteElementA(Element elementA);

    public void visitConcreteElementB(Element elementB);
}
