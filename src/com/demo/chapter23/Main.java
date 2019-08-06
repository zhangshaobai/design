package com.demo.chapter23;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   命令模式(Command):将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化;
 *          对请求排队或记录请求日志，以及支持可撤销的操作
 * @author: zhangpeng
 * @date: 2019/8/6 2:29 PM
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command commandA = new ConcreteCommandA(receiver);

        Command commandB = new ConcreteCommandB(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(commandA);
        invoker.executeCommand();

        invoker.setCommand(commandB);
        invoker.executeCommand();
    }
}
