package com.demo.chapter16;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 5:00 PM
 */
public class MorningState extends State {
    @Override
    public void handle(Work w) {
        if(w.getHour()<12) {
            System.out.println("上午处理工作");
        } else {
            w.setState(new NoonState());
            w.handle();
        }
    }
}
