package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 2:58 PM
 */
public class UserProductMysql implements IUserProduct {
    @Override
    public void insertUser(User user) {
        System.out.println("mysql插入用户");
    }

    @Override
    public void deleteUser(String id) {
        System.out.println("mysql删除用户");
    }
}
