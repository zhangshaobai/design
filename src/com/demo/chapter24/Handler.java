package com.demo.chapter24;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 4:56 PM
 */
public abstract class Handler {

    private Handler successor;

    public abstract void handleRequest(int request);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
}
