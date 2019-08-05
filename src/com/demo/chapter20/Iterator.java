package com.demo.chapter20;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 5:19 PM
 */
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract Boolean isDone();
    public abstract Object currentItem();
}
