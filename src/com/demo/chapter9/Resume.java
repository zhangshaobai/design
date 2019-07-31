package com.demo.chapter9;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 3:12 PM
 */
public class Resume implements Cloneable {
    private String name;
    private String age;
    private Work work;

    //浅拷贝，引用对象指向同一引用地址
    @Override
    public Resume clone() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age + "," + work.getTime() + "," + work.getCompany();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
