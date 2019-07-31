package com.demo.chapter9;

/**
 * @Copyright (C), 2019,蔚商科技
 * @desc:   原型模式:用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * @author: zhangpeng
 * @date: 2019/7/31 2:32 PM
 */
public class Main {

    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.setName("小菜");
        resume.setAge("19");
        Work work = new Work();
        work.setCompany("腾讯");
        work.setTime("2019");
        resume.setWork(work);

        System.out.println(resume.toString());

        Resume newResume = resume.clone();
        newResume.getWork().setCompany("阿里巴巴");
        newResume.getWork().setTime("2009");

        //浅拷贝因为共享同一引用对象地址，会修改原对象内容
        System.out.println(resume.toString());
        System.out.println(newResume.toString());



        DeepResume deepResume = new DeepResume();
        deepResume.setName("小菜");
        deepResume.setAge("19");
        DeepWork deepWork = new DeepWork();
        deepWork.setCompany("腾讯");
        deepWork.setTime("2019");
        deepResume.setDeepWork(deepWork);

        System.out.println(deepResume.toString());

        DeepResume newDeepResume = deepResume.clone();
        newDeepResume.getDeepWork().setCompany("阿里巴巴");
        newDeepResume.getDeepWork().setTime("2009");

        //深拷贝因为复制一个新的引用对象，不会修改原对象内容
        System.out.println(deepResume.toString());
        System.out.println(newDeepResume.toString());

    }
}
