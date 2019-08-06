package com.demo.chapter23;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/6 2:56 PM
 */
public class ConcreteCommandA extends Command {

    public ConcreteCommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.getReceiver().actionA();
    }
}
