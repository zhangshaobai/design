package com.demo.chapter17;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/5 11:08 AM
 */
public class TranslatorAdapter implements PlayerTarget {

    private ForeignCenter center;

    public TranslatorAdapter(String name) {
        center = new ForeignCenter(name);
    }



    @Override
    public void attack() {
        center.进攻();
    }

    @Override
    public void defense() {
        center.防守();
    }
}
