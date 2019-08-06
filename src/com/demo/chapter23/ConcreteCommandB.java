package com.demo.chapter23;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 2:58 PM
 */
public class ConcreteCommandB extends Command {

    public ConcreteCommandB(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.getReceiver().actionB();
    }
}
