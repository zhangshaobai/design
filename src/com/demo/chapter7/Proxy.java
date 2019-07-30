package com.demo.chapter7;

import java.util.Properties;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 7:38 PM
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(Target target) {
        realSubject = new RealSubject(target);
    }


    @Override
    public void request() {
        realSubject.request();
    }
}
