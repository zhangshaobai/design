package com.demo.chapter2;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   采用工厂模式与策略模式相结合，解放客户端的选择，由context进行选择
 * @author: zhangpeng
 * @date: 2019/7/29 8:27 PM
 */
public class Context {

    private Strategy strategy;

    public Context(String type) {
        switch (type) {
            case "正常收费":
                strategy = new StrategyNormal();
                break;
            case "打8折":
                strategy = new StrategySale(0.8);
                break;
            case "满300减100":
                strategy = new StrategyReturn(300, 100);
                break;
        }
    }

    public double getResult(double money) {
        return strategy.algorithmInterface(money);
    }
}
