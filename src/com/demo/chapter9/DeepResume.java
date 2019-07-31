package com.demo.chapter9;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:
 * @author: zhangpeng
 * @date: 2019/7/31 3:26 PM
 */
public class DeepResume implements Cloneable {
    private String name;
    private String age;
    private DeepWork deepWork;

    //深度拷贝，引用对象不指向同一引用地址
    @Override
    public DeepResume clone() {
        try {
            DeepResume deepResume = (DeepResume)super.clone();
            DeepWork deepWorkTmp = new DeepWork();
            deepWorkTmp.setTime(this.deepWork.getTime());
            deepWorkTmp.setCompany(this.deepWork.getCompany());
            deepResume.setDeepWork(deepWorkTmp);
            return deepResume;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age + "," + deepWork.getTime() + "," + deepWork.getCompany();
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

    public DeepWork getDeepWork() {
        return deepWork;
    }

    public void setDeepWork(DeepWork deepWork) {
        this.deepWork = deepWork;
    }
}
