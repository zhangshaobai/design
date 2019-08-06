package com.demo.chapter25;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 6:29 PM
 */
public class ColleagueA extends Colleague {

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void declare(String message) {
        this.getMediator().declare(message, this);
    }

    @Override
    public void getMsg(String message) {
        System.out.println("A 收到消息:" + message);
    }
}
