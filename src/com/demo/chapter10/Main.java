package com.demo.chapter10;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   模版方法模式:定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模版方法使得子类可以不改变一个算法的结构
 *          即可重定义该算法的某些特定步骤
 * @author: zhangpeng
 * @date: 2019/7/31 4:09 PM
 */
public class Main {
    public static void main(String[] args) {
        AbstractTitle titleA = new ConcreteStudentA();
        titleA.titleAndAnswer();

        AbstractTitle titleB = new ConcreteStudentB();
        titleB.titleAndAnswer();
    }
}
