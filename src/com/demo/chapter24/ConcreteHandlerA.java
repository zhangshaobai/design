package com.demo.chapter24;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 5:01 PM
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request < 10) {
            System.out.println(request + ": A 处理");
        } else {
            if(this.getSuccessor() != null) {
                this.getSuccessor().handleRequest(request);
            }
        }
    }
}
