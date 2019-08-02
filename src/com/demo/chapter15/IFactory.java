package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 3:05 PM
 */
public interface IFactory {

    IUserProduct createUser();

    IDepartmentProduct createDepartment();
}
