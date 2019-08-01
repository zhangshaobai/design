package com.demo.chapter14;

import com.demo.chapter12.SubSystemTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/1 5:55 PM
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {
        System.out.println("服务器发送消息:" + msg);
        for(Observer observer : observerList) {
            observer.update(msg);
        }
    }
}
