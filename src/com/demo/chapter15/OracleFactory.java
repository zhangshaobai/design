package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 3:07 PM
 */
public class OracleFactory implements IFactory {
    @Override
    public IUserProduct createUser() {
        return new UserProductOracle();
    }

    @Override
    public IDepartmentProduct createDepartment() {
        return new DepartmentProductOracle();
    }
}
