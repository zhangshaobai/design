package com.demo.chapter16;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 4:55 PM
 */
public class Work {
    private State state;
    private int hour;

    public Work() {
        state = new MorningState();
    }

    public void handle() {
        state.handle(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
