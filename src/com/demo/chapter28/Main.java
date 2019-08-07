package com.demo.chapter28;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   访问者模式(Visitor):表示一个作用于某对象结构中的各元素的操作。
 *          它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
 * @author: zhangpeng
 * @date: 2019/8/7 11:45 AM
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        objectStructure.accept(new ConcreteVisitorA());
    }

}
