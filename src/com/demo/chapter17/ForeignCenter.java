package com.demo.chapter17;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 11:05 AM
 */
public class ForeignCenter {
    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("外籍中锋 " + name + " 进行进攻");
    }

    public void 防守() {
        System.out.println("外籍中锋 " + name + " 进行防守");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
