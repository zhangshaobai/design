package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 3:01 PM
 */
public class DepartmentProductMysql implements IDepartmentProduct {
    @Override
    public void insertDepart(Department department) {
        System.out.println("mysql插入部门");
    }

    @Override
    public void deleteDepart(Department department) {
        System.out.println("mysql删除部门");
    }
}
