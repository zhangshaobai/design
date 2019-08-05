package com.demo.chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   迭代器模式:提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
 * @author: zhangpeng
 * @date: 2019/8/5 4:34 PM
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        List<Object> list = new ArrayList<>();
        list.add("大鸟");
        list.add("小菜");
        list.add("老外");
        list.add("小偷");
        aggregate.setItems(list);

        Iterator iterator = aggregate.createIterator();
        Object obj1 = iterator.first();
        while(!iterator.isDone()) {
            System.out.println(iterator.currentItem().toString() + "请买车票!");
            iterator.next();
        }
    }
}
