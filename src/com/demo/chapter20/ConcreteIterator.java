package com.demo.chapter20;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 5:24 PM
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems().get(0);
    }

    @Override
    public Object next() {
        current++;
        if(current< aggregate.getItems().size()) {
            return aggregate.getItems().get(current);
        }
        return null;
    }

    @Override
    public Boolean isDone() {
        if(current >= aggregate.getItems().size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems().get(current);
    }
}
