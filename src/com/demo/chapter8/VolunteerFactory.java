package com.demo.chapter8;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/30 8:51 PM
 */
public class VolunteerFactory implements ILeiFengFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteers();
    }
}
