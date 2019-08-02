package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 3:06 PM
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUserProduct createUser() {
        return new UserProductMysql();
    }

    @Override
    public IDepartmentProduct createDepartment() {
        return new DepartmentProductMysql();
    }
}
