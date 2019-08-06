package com.demo.chapter24;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 5:10 PM
 */
public class ConcreteHandlerB  extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 10 && request < 20) {
            System.out.println(request + ": B 处理");
        } else {
            if(this.getSuccessor() != null) {
                this.getSuccessor().handleRequest(request);
            }
        }
    }
}
