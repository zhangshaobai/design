package com.demo.chapter16;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 5:21 PM
 */
public class AfternoonState extends State {

    @Override
    public void handle(Work w) {
        System.out.println("下午处理工作");
    }
}
