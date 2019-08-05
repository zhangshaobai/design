package com.demo.chapter17;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 11:02 AM
 */
public class Guard implements PlayerTarget {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("后卫 " + name + " 进行进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫 " + name + " 进行防守");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
