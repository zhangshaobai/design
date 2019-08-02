package com.demo.chapter15;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   抽象工厂模式:提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 * @author: zhangpeng
 * @date: 2019/8/1 6:43 PM
 */
public class Main {

    public static  void main(String[] args) {
        IFactory factory = new OracleFactory();
        IUserProduct user = factory.createUser();
        IDepartmentProduct depart = factory.createDepartment();
        user.insertUser(new User());
        depart.deleteDepart(new Department());
    }
}
