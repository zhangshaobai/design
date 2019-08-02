package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/8/2 3:00 PM
 */
public class DepartmentProductOracle implements IDepartmentProduct {
    @Override
    public void insertDepart(Department department) {
        System.out.println("oracle插入部门");
    }

    @Override
    public void deleteDepart(Department department) {
        System.out.println("oracle删除部门");
    }
}
