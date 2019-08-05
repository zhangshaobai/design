package com.demo.chapter21;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   单例模式:保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * @author: zhangpeng
 * @date: 2019/8/5 6:24 PM
 */
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
