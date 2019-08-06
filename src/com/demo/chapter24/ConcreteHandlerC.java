package com.demo.chapter24;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 5:15 PM
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 20 && request <= 30) {
            System.out.println(request + ": C 处理");
        } else {
            if(this.getSuccessor() != null) {
                this.getSuccessor().handleRequest(request);
            }
        }
    }
}
