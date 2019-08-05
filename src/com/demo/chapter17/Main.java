package com.demo.chapter17;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   适配器模式:将一个类的接口转换成客户希望的另外一个接口。
 *          Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * @author: zhangpeng
 * @date: 2019/8/2 5:56 PM
 */
public class Main {
    public static void main(String[] args) {
        PlayerTarget guard = new Guard("麦迪");
        guard.attack();
        guard.defense();


        PlayerTarget center = new TranslatorAdapter("姚明");
        center.attack();
        center.defense();
    }
}
