package com.demo.chapter21;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import static sun.misc.GThreadHelper.lock;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 6:39 PM
 */
public class Singleton {

    private static Singleton instance = null;
    private static Object obj = new Object();

    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (obj) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}