package com.demo.chapter14;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/1 5:51 PM
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver(String msg);
}
