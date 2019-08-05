package com.demo.chapter18;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   备忘录模式:在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 *          这样以后就可将该对象恢复到原先保存的状态
 * @author: zhangpeng
 * @date: 2019/8/5 11:47 AM
 */
public class Main {
    public static  void main(String[] args) {
        Originator lixiaoyao = new Originator();
        lixiaoyao.initState();
        lixiaoyao.showState();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(lixiaoyao.createMemento());

        lixiaoyao.attackBoss();
        lixiaoyao.showState();

        lixiaoyao.setMemento(caretaker.getMemento());
        lixiaoyao.showState();
    }
}
