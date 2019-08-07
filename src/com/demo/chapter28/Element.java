package com.demo.chapter28;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/7 2:30 PM
 */
public interface Element {
    public void accept(Visitor visitor);
}
