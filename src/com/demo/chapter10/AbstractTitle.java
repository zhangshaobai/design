package com.demo.chapter10;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 4:23 PM
 */
public abstract class AbstractTitle {
    public void titleAndAnswer() {
        System.out.println("题目一:答案:" + answer1());
        System.out.println("题目二:答案:" + answer2());
        System.out.println("题目三:答案:" + answer3());
    }

    public abstract String answer1();
    public abstract String answer2();
    public abstract String answer3();
}
