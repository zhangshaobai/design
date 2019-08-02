package com.demo.chapter16;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 5:02 PM
 */
public class NoonState extends State {
    @Override
    public void handle(Work w) {
        if(w.getHour()<15) {
            System.out.println("中午处理工作");
        } else {
            w.setState(new AfternoonState());
            w.handle();
        }
    }
}
