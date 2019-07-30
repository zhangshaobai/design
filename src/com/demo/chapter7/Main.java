package com.demo.chapter7;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   代理模式:为其他对象提供一种代理以控制对这个对象的访问
 * @author: zhangpeng
 * @date: 2019/7/30 6:39 PM
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Target("娇娇");
        Proxy proxy = new Proxy(target);
        proxy.request();
    }
}
